package com.singleton.model;

public class Alumnos {
	private int idAlumno;
	private String Nombre;
	
	private static Alumnos miUnicaInstanciaDeAlumnos = null;
	
	
	public static Alumnos getInstanceOfAlumnos() {
		if(miUnicaInstanciaDeAlumnos == null) {
			miUnicaInstanciaDeAlumnos = new Alumnos();
		} else {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
		return miUnicaInstanciaDeAlumnos;
	}
	
	private Alumnos() {
		
	}
	
	private Alumnos(int idAlumno, String nombre) {
		super();
		this.idAlumno = idAlumno;
		Nombre = nombre;
	}
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@Override
	public String toString() {
		return "Alumnos [idAlumno=" + idAlumno + ", Nombre=" + Nombre + "]";
	}
	
	
}
