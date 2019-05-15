package com.ooppractica2.model;

public abstract class Persona implements Personable {
	private String nombre;
	private String id;
	private String rol;
	
	//Creación de métodos constructores.
	public Persona() {
		
	}
	
	public Persona(String nombre, String id, String rol) {
		this.nombre = nombre;
		this.id = id;
		this.rol = rol;
	}
	
	
	//Construcción de getters y setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	public String toString() {
		return("Nombre: "+nombre +"\nId: "+id+"\nRol: "+rol);
	}
}
