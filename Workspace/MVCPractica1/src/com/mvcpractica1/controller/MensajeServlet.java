package com.mvcpractica1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MensajeServlet
 */
@WebServlet(description = "Este servlet me sirve para enviar un Hola Mundo", urlPatterns = { "/MensajeServlet" })
public class MensajeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text");
		response.getWriter().append("Hola Mundo");
	}
}