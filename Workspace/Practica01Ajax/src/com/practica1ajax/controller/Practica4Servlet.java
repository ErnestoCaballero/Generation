package com.practica1ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Practica4Servlet
 */
@WebServlet("/Practica4Servlet")
public class Practica4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String json = request.getParameter("txtJson");
		DatosPersonales misDatosPersonales = new DatosPersonales();
		Gson gson = new Gson();
		misDatosPersonales = gson.fromJson(json, misDatosPersonales.getClass()); //O bien se puede usar: gson.fromJson(json, DatosPersonales.class).
		PrintWriter salida = response.getWriter();
		salida.append("Nombre: " + misDatosPersonales.getNombre());
		salida.append(" Apellido Paterno: " + misDatosPersonales.getApellidoPaterno());
		salida.append(" Apellido Materno: " + misDatosPersonales.getApellidoMaterno());
		salida.append(" Domicilio: " + misDatosPersonales.getDomicilio());
		salida.append(" Edad: " + misDatosPersonales.getEdad());
		salida.append(" Sexo: " + misDatosPersonales.getSexo());
	}

}
