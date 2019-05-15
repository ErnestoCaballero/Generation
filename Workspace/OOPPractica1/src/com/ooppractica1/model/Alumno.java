package com.ooppractica1.model;

public class Alumno {
	//Atributos, propiedades, características.
	private String nombreAlumno;
	private String direccionAlumno;

	
	//Métodos constructores.
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
	//Getters son métodos de lectura
	//Setters son métodos de escritura.
	
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












