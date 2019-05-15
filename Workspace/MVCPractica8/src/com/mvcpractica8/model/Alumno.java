package com.mvcpractica8.model;

public class Alumno {
	//Atributos
	private String nombreAlumno;
	private double calificacion1;
	private double calificacion2;
	
	//Constructores
	public Alumno() {
		
	}
	
	public Alumno(String nombre, double cal1, double cal2) {
		this.nombreAlumno = nombre;
		this.calificacion1 = cal1;
		this.calificacion2 = cal2;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombreAlumno;
	}
	
	public void setNombre(String nombre) {
		this.nombreAlumno = nombre;
	}
	
	public double getCalificacion1() {
		return calificacion1;
	}
	
	public void setCalificacion1(double cal1) {
		this.calificacion1 = cal1;
	}
	
	public double getCalificacion2() {
		return calificacion2;
	}
	
	public void setCalificacion2(double cal2) {
		this.calificacion2 = cal2;
	}
	
}
