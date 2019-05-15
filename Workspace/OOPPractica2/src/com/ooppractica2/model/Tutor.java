package com.ooppractica2.model;

public class Tutor extends Persona {

		private String placa;
		private String ninio;
		
		//Creación de métodos contructores:
		public Tutor() {
			
		}
		
		public Tutor(String placa, String ninio) {
			this.placa = placa;
			this.ninio = ninio;
		}
		
		
		//Construcción de Getters y Setters-
		public String getPlaca() {
			return placa;
		}
		
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		
		public String getNinio() {
			return ninio;
		}
		
		public void setNinio(String ninio) {
			this.ninio = ninio;
		}
		
		@Override
		public String toString() {
			return "Nombre: "+super.getNombre()+"\nId: "+super.getId()+"\nRol: "+super.getRol()+"\nPlaca: "+placa+"\nNinio: "+ninio;
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
