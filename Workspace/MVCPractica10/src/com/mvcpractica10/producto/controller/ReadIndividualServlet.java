package com.mvcpractica10.producto.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadIndividualServlet")
public class ReadIndividualServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Simon");   Prueba de que sí hay conexión entre front y back.
		
		//Nos traesmos del front el valor que vamos a buscar.
		String idProductoBuscado = request.getParameter("txtIdProducto");
		
		//Declaramos las variables de la Base de datos:
		String url = "jdbc:mysql://localhost:3306/abarrotesgeneration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String password = "root";
		String sql = "SELECT * FROM productos WHERE id_producto = " + idProductoBuscado;
		
		//Genero mis variables de respuesta.
		int idProducto = 0;
		String nombreProducto = "";
		double precioProducto = 0.0;
		int existenciasProducto = 0;
		
		
		//Creamos los objetos
		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null; //rs es la terminal en la consola
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			//Abrimos la conexión a la base de datos.
			conn = DriverManager.getConnection(url, usuario, password);
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sql);
			rs.next();
			idProducto = rs.getInt("id_producto");
			nombreProducto = rs.getString("nombre_producto");
			precioProducto = rs.getDouble("precio_producto");
			existenciasProducto = rs.getInt("existencias");
			
			response.getWriter().append("Id del producto: " + idProducto);
			response.getWriter().append(" Nombre del producto: " + nombreProducto);
			response.getWriter().append(" Precio del producto: " + precioProducto);
			response.getWriter().append(" Existencias: " + existenciasProducto);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			//Cerramos las conexiones y colocamos los objetos a disposición del garbage collector.
			try {
				rs.close();
				stmnt.close();
				conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
