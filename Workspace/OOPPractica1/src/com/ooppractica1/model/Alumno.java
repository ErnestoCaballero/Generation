package com.ooppractica1.model;

public class Alumno {
	//Atributos, propiedades, caracter�sticas.
	private String nombreAlumno;
	private String direccionAlumno;

	
	//M�todos constructores.
	public Alumno(){
		
	}
	
	public Alumno(String nombreAlumno){
		this.nombreAlumno = nombreAlumno;
	}
	
	public Alumno(String nombreAlumno, String direccionAlumno){
		this.nombreAlumno = nombreAlumno;
		this.direccionAlumno = direccionAlumno;
	}
	
	//Getters y Setters
	//Getters son m�todos de lectura
	//Setters son m�todos de escritura.
	
	public String getNombreAlumno() {
		return this.nombreAlumno;
	}
	
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;		
	}
	
	public String getDireccionAlumno() {
		return this.direccionAlumno;
	}
	
	public void setDireccionAlumno(String direccionAlumno) {
		this.direccionAlumno = direccionAlumno;
	}
}












