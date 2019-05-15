package com.mvcpractica9.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("txtUsuario");
		String pass = request.getParameter("txtPass");
		
		//System.out.println("Get con éxito. Password: " + pass + " User: " + user);
		//Típicamente, es aquí donde se accede a la base de datos para comparar los resultados. 
		
		if (user.equals("admin") && pass.equals("123")) {
			HttpSession objSesion = request.getSession(true);
			objSesion.setAttribute("usuario", user);
			objSesion.setAttribute("password", pass);
			objSesion.setMaxInactiveInterval(60);
			
			response.sendRedirect("logeado.jsp");
		
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			out.println("<font color='red'>Credenciales Inválidas</font>");
			dispatcher.include(request,  response);
		}
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
