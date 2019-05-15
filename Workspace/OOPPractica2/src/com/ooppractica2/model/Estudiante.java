package com.ooppractica2.model;

public class Estudiante extends Persona {
	
	String materia;
	
	//Creaci�n de m�todos constructores.
	public Estudiante() {
		
	}
	
	public Estudiante(String materia) {
		this.materia = materia;
	}
	
	
	//Construcci�n de Getters y Setters.
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}

	
	@Override
	public String toString() {
		return "Nombre: "+super.getNombre()+"\nId: "+super.getId()+"\nRol: "+super.getRol()+"Materia: "+materia;
	}

	@Override
	public void registroEntrada() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registroSalida() {
		// TODO Auto-generated method stub
		
	}
}
