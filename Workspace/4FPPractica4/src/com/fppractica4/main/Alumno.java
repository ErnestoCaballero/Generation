package com.fppractica4.main;

public class Alumno {
	public static String escuela = "Tec Mario Molima";
	private String nombreAlumno;
	
	public Alumno() {
	
	}
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	
	public static int calcularAreaCuadrado(int lado) {
		return lado * lado;
	}
}
