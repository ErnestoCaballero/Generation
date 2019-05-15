package com.mvcpractica3.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumaNumero
 */
@WebServlet(description = "Este programa manejará números en Back-End", urlPatterns = { "/SumaNumeroServlet" })

public class SumaNumeroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int suma = 0;
		
		String numero1 = request.getParameter("txtNumero1");
		int num1 = Integer.parseInt(numero1);
		
		int num2 = Integer.parseInt(request.getParameter("txtNumero2"));
		suma = num1 + num2;
		
		response.getWriter().append("La suma es: " + suma);
		
	}
}
