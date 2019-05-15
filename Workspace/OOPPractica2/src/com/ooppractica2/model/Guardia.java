package com.ooppractica2.model;

import java.util.Date;

public class Guardia extends Persona {
	
	private String puesto;
	private Date horario;
	private double salario;
	
	//Creación de métodos contructores.
	public Guardia() {
		
	}
	
	public Guardia(String puesto, Date horario, double salario) {
		this.puesto = puesto;
		this.horario = horario;
		this.salario = salario;
	}
	
	//Contrucción de Getters y Setters.
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public Date getHorario() {
		return horario;
	}
	
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+super.getNombre()+"\nId: "+super.getId()+"\nRol: "+super.getRol()+"\nPuesto: "+puesto+"\nHorario: "+horario+"\nSalario: "+salario;
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
