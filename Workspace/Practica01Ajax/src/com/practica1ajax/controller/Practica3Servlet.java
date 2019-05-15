package com.practica1ajax.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Practica3Servlet
 */
@WebServlet("/Practica3Servlet")
public class Practica3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("TestServlet: ");
		
		DatosPersonales misDatosPersonales = new DatosPersonales();
		misDatosPersonales.setNombre(request.getParameter("txtNombre"));
		misDatosPersonales.setApellidoPaterno(request.getParameter("txtApellidoPaterno"));
		misDatosPersonales.setApellidoMaterno(request.getParameter("txtApellidoMaterno"));
		misDatosPersonales.setSexo(request.getParameter("txtSexo"));
		misDatosPersonales.setDomicilio(request.getParameter("txtDomicilio"));
		misDatosPersonales.setEdad(Integer.parseInt(request.getParameter("txtEdad")));
		//System.out.println(request.getParameter("txtEstatura"));
		//misDatosPersonales.setEstatura(Double.parseDouble(request.getParameter("txtEstatura")));
		
		//Declarar objetos de bases de datos.
		Connection conn = null;
		PreparedStatement pstmnt = null;
		int nRegistros = 0;
		
		//Declarar mis variables de conexión.
		Properties props = new Properties();
		String archiveProperties = "config.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(archiveProperties);
		
		if (inputStream != null) {
			props.load(inputStream);
		} else {
			throw new FileNotFoundException();
		}
		
		String driverMysql = props.getProperty("driverMysql");
		String urlServidor = props.getProperty("urlservidor");
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String sentenciaSQL = props.getProperty("InsertEmpleado");
		
		try {
			//Instanciamos el Driver.
			Class.forName(driverMysql).getDeclaredConstructor().newInstance();
			
			//Obtenemos la conexión
			conn = DriverManager.getConnection(urlServidor, user, pass);
			
			//Configuramos el prepared Statement
			pstmnt = conn.prepareStatement(sentenciaSQL);
		
			pstmnt.setString(1, misDatosPersonales.getNombre());
			pstmnt.setString(2, misDatosPersonales.getApellidoPaterno());
			pstmnt.setString(3, misDatosPersonales.getApellidoMaterno());
			pstmnt.setInt(4, misDatosPersonales.getEdad());
			pstmnt.setString(5, misDatosPersonales.getSexo());
			pstmnt.setDouble(6, 1.75);
			pstmnt.setString(7, misDatosPersonales.getDomicilio());
			
			nRegistros = pstmnt.executeUpdate();
			if(nRegistros > 0) {
				System.out.println("Registro añadido con éxito");
				response.getWriter().append("Registro añadido con éxito");
			} else {
				System.out.println("Hubo un error en la entrada.");
				response.getWriter().append("Error en el registro.");
				
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmnt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		response.setContentType("application/json");
		Gson objGson = new Gson();     //objGson = new Gson();
		String miJson;
		miJson = objGson.toJson(misDatosPersonales);
		response.getWriter().append(miJson);
		
	}

}
