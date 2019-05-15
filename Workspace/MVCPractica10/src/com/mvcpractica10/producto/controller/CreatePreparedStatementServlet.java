package com.mvcpractica10.producto.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcpractica10.producto.model.Productos;


@WebServlet("/CreatePreparedStatementServlet")
public class CreatePreparedStatementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Funciona");
		
		
		
		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/abarrotesgeneration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String sql = "INSERT INTO productos VALUES('0',?,?,?)";
		
		Productos miProducto = new Productos();
		miProducto.setNombreProducto(request.getParameter("txtNombreProducto"));
		miProducto.setPrecioProducto(Double.parseDouble(request.getParameter("txtPrecioProducto")));
		miProducto.setExistenciaProducto(Integer.parseInt(request.getParameter("txtExistenciaProducto")));
		
		//Declarar objetos
		Connection conn = null;
		PreparedStatement pstmnt = null;
		int nRegistros = 0;
		
		try {
			//Instanciar driver
			Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			conn = DriverManager.getConnection(url, user, password);
			pstmnt = conn.prepareStatement(sql);
			pstmnt.setString(1, miProducto.getNombreProducto());
			pstmnt.setDouble(2, miProducto.getPrecioProducto());
			pstmnt.setInt(3, miProducto.getExistenciaProducto());
			
			nRegistros = pstmnt.executeUpdate();
			
			if (nRegistros > 0) {
				response.getWriter().append("Registro sí se añadió.");
			} else {
				response.getWriter().append("El registró no quedó registrado. Intente de nuevo.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			response.getWriter().append("<a href='createPreparedStatement.jsp'>Regresar</a>");
			try {
				conn.close();
				pstmnt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
