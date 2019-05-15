package com.mvcpractica7.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SumaNumerosServlet")
public class SumaNumerosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//salida.append("Test");
		
		int numero1 = Integer.parseInt(request.getParameter("txtNumero1"));
		int numero2 = Integer.parseInt(request.getParameter("txtNumero2"));
		
		int resultado = numero1 + numero2;
		int resta = numero1 - numero2;
		
		request.setAttribute("resultado", resultado);
		request.setAttribute("resta", resta);
		
		if (resultado == 37) {
			RequestDispatcher rs = request.getRequestDispatcher("macho.jsp");
			rs.forward(request, response);
		} else if (resultado > 0) {
			RequestDispatcher rs = request.getRequestDispatcher("PositivoServlet");
			rs.forward(request, response);
		} else if (resultado < 0){
			RequestDispatcher rs = request.getRequestDispatcher("NegativoServlet");
			rs.forward(request, response);
		} else {
			RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
			rs.forward(request, response);
		}
		
	}

}
