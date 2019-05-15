package com.mvcpractica4.model;

public class DatosPersonales {
	private String nombre;
	private String paterno;
	private String materno;
	private int edad;
	private double estatura;
	private String sexo;
	private String[] mascotas;
	
	public DatosPersonales() {
		
	}
	
	public DatosPersonales(String nombre, String paterno, String materno, int edad, double estatura, String sexo, String[] mascotas) {
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.edad = edad;
		this.estatura = estatura;
		this.sexo = sexo;
		for (int i = 0; i < mascotas.length; i++) {
			this.mascotas = mascotas;
		}
	}
	
	public String toString() {
		String misMascotas = "";
		for(String mascota:mascotas) {
			misMascotas+=mascota + " ";
		}
		return "Nombre: "+nombre + " Apellido Paterno: " + paterno + " Apellido Materno: " + materno + " Edad: " + edad + " Estatura: " + estatura + " Sexo: " + sexo + " Mascota: " + misMascotas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPaterno() {
		return paterno;
	}
	
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	
	public String getMaterno() {
		return materno;
	}
	
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getEstatura() {
		return estatura;
	}
	
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getMascotas() {
		String misMascotas = "";
		for(String mascota:mascotas) {
			misMascotas+=mascota + " ";
		}
		return misMascotas;
	}
	
	public void setMascotas(String[] mascotas) {
		this.mascotas = mascotas;
	}
}
