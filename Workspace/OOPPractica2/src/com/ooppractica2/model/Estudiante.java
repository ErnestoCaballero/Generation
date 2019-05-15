package com.ooppractica2.model;

public class Estudiante extends Persona {
	
	String materia;
	
	//Creación de métodos constructores.
	public Estudiante() {
		
	}
	
	public Estudiante(String materia) {
		this.materia = materia;
	}
	
	
	//Construcción de Getters y Setters.
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
