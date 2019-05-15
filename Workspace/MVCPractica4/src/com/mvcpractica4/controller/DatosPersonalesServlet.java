package com.mvcpractica4.controller;
import com.mvcpractica4.model.DatosPersonales;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatosPersonalesServlet
 */
@WebServlet("/DatosPersonalesServlet")
public class DatosPersonalesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String nombre, paterno, materno, sexo;
		String[] mascotas = new String[3];
		double estatura;
		int edad;
		
		nombre = request.getParameter("txtNombre");
		paterno = request.getParameter("txtPaterno");
		materno = request.getParameter("txtMaterno");
		sexo = request.getParameter("txtSex");
		estatura = Float.parseFloat(request.getParameter("txtEst"));
		edad = Integer.parseInt(request.getParameter("txtEdad"));
		
		response.getWriter().append("Nombre: "+nombre);
		response.getWriter().append("Apellido Paterno: " + paterno);
		response.getWriter().append("Apellido Materno: "+ materno);
		response.getWriter().append("Sexo: " + sexo);
		response.getWriter().append("Estatura: " + estatura);
		response.getWriter().append("Edad: " + edad);*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre, paterno, materno, sexo;
		String[] mascotas = new String[3];
		double estatura;
		int edad;
		
		request.getParameterNames();
		nombre = request.getParameter("txtNombre");
		paterno = request.getParameter("txtPaterno");
		materno = request.getParameter("txtMaterno");
		sexo = request.getParameter("txtGenero");
		estatura = Float.parseFloat(request.getParameter("txtEstatura"));
		edad = Integer.parseInt(request.getParameter("txtEdad"));
		mascotas = request.getParameterValues("cbMascota");
		
		response.getWriter().append("Nombre: "+nombre);
		response.getWriter().append(" Apellido Paterno: " + paterno);
		response.getWriter().append(" Apellido Materno: "+ materno);
		response.getWriter().append(" Sexo: " + sexo);
		response.getWriter().append(" Estatura: " + estatura);
		response.getWriter().append(" Edad: " + edad);
		for (String mascotita:mascotas) {
			response.getWriter().append(" Mascotas: " + mascotita);
		}
		
		final int CANTIDAD_REGISTROS = 100;
		
		DatosPersonales Andrea = new DatosPersonales();
		DatosPersonales Dante = new DatosPersonales();
		DatosPersonales registro = new DatosPersonales("registro1", "registro1", "registro1", 1,1.0, "1",null );
		DatosPersonales registro1;
		
		ArrayList<DatosPersonales> registros = new ArrayList<DatosPersonales>();
		
		for (int i = 0; i < CANTIDAD_REGISTROS;i++) {
			registro1 = new DatosPersonales();
			registro1.setNombre("registro " + i);
			registro1.setPaterno("registro " + i);
			registro1.setMaterno("registro " + i);	
			registro1.setEdad(i);
			registro1.setEstatura(i);
			registro1.setSexo(""+i);
			registro1.setMascotas(null);
			registros.add(registro1);
			
		}
		
		for (int i = 0; i < CANTIDAD_REGISTROS; i++) {
			registros.add(new DatosPersonales("registro "+i, "registro "+i,"registro " +i, i, i,""+i,null));
		}
		
		registros.add(registro);
		
		
		
		//DatosPersonales Talavera = new DatosPersonales();
		
		Andrea.setNombre(nombre);
		Andrea.setPaterno(paterno);
		Andrea.setMaterno(materno);	
		Andrea.setEdad(edad);
		Andrea.setEstatura(estatura);
		Andrea.setSexo(sexo);
		Andrea.setMascotas(mascotas);
		Dante.setNombre("Dante");
		Dante.setPaterno("Delgado");
		Dante.setMaterno("Avalos");
		Dante.setEdad(16);
		Dante.setEstatura(1.75);
		Dante.setSexo("Masculino");
		
		PrintWriter salida = response.getWriter();
		response.setContentType("text/html charset-UTF-8");
		
		salida.append("<html>");
		salida.append("<head>");
		salida.append("<title>");
		salida.append("Datos Personales");
		salida.append("</title>");
		salida.append("</head>");
		salida.append("<body>");
		salida.append("<h2>Datos Personales</h2>");
		salida.append("<table>");
		salida.append("<thead>");
		salida.append("<tr>");
		salida.append("<th>Nombre</th>");
		salida.append("<th>Apellido Paterno</th>");
		salida.append("<th>Apellido Materno</th>");
		salida.append("<th>Edad</th>");
		salida.append("<th>Estatura</th>");
		salida.append("<th>Sexo</th>");
		salida.append("</tr>");
		salida.append("</thead>");
		salida.append("<tr>");
		
		//registros.forEach(DatosPersonales -> {salida.println(DatosPersonales.)});
		
		for (DatosPersonales personita:registros) {
			salida.append("<td>"+personita.getNombre()+"</td>");
			salida.append("<td>"+personita.getNombre()+"</td>");
			salida.append("<td>"+personita.getPaterno()+"</td>");
			salida.append("<td>"+personita.getMaterno()+"</td>");
			salida.append("<td>"+personita.getEdad()+"</td>");
			salida.append("<td>"+personita.getEstatura()+"</td>");
			salida.append("<td>"+personita.getSexo()+"</td>");
		}
		
		salida.append("</tr>");
		salida.append("<tbody>");
		salida.append("</tbody>");
		salida.append("</table>");
		salida.append("</body>");
		salida.append("</html>");
		
		salida.close();
		
		/*Dante.setNombre(request.getParameter("txtNombre"));
		Dante.setPaterno(request.getParameter("txtPaterno"));
		Dante.setMaterno(request.getParameter("txtMaterno"));
		Dante.setEdad(request.getParameter("txtEdad"));
		Dante.setEstatura(request.getParameter("txtEstatura"));
		Dante.setSexo(request.getParameter("txtGenero"));
		Dante.setMascotas(request.getParameter("cbMascota"));*/
	}	
}
