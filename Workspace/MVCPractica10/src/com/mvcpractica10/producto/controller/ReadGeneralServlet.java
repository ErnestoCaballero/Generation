package com.mvcpractica10.producto.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection; //IMPORTANTE para usar SQL.
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReadGeneralServlet")
public class ReadGeneralServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida = response.getWriter();
		
		//Declaramos e inicializamos las credenciales de acceso
		String url = "jdbc:mysql://localhost:3306/abarrotesgeneration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String password = "root";
		
		//Declaramos e inicializamos los objetos de la conexi�n.
		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null;
		
		
		try {
			//Se instanc�a el Driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			//Se abre la conexi�n a la base de datos.
			conn = DriverManager.getConnection(url, usuario, password);
			//Se apunta el objeto statement que nos sirve para ejecutar comandos en la base de datos (Se crea la consola de comandos que apuntan a esa conexi�n
			stmnt = conn.createStatement();
			
			rs = stmnt.executeQuery("SELECT * FROM productos");
			
			while (rs.next()) {
				salida.append("IdProducto: " + rs.getInt("id_producto"));
				salida.append("<br/>");
				salida.append("Nombre del Producto: " + rs.getString("nombre_producto"));
				salida.append("<br/>");
				salida.append("Precio del producto: " + rs.getDouble("precio_producto"));
				salida.append("<br/>");
				salida.append("Existencias Producto: " + rs.getInt("existencias"));
				salida.append("<br/>");
				salida.append("<p> </p>");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			//Cerramos las conexiones y colocamos los objetos a disposici�n del garbage collector.
			try {
				rs.close();
				stmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		salida.close();
	}

}
