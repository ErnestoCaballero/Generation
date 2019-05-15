package com.mvcpractica2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MensajeServlet")
public class MensajeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String miMensaje = "";
		miMensaje = request.getParameter("txtMensaje");
		
		response.getWriter().append("Tu mensaje fue (m�todo Get): " + miMensaje);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String miMensaje = "";
		miMensaje = request.getParameter("txtMensaje");
		
		response.getWriter().append("T� mensaje fue (m�todo Post): " + miMensaje);
	}
}
