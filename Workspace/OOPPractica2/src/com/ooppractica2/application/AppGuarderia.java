package com.ooppractica2.application;
import com.ooppractica2.model.Persona;
import com.ooppractica2.model.Guardia;

public class AppGuarderia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona popeye;		
		popeye = new Guardia();
		
		Guardia jorge = new Guardia("Guardia", null, 10.2); //Al inicializarlo (le agregamos "puesto", "horario" y "sueldo".
		
		System.out.println("Nombre: "+ popeye.getNombre());
		System.out.println("Id: "+ popeye.getId());
		System.out.println("Rol: "+ popeye.getRol());		
		System.out.println("\n"+popeye.toString()); //Utilizando el método toString que creamos en la clase Persona.
		
		//Definiendo los atributos de la superclase para Mr. Don. George.
		jorge.setNombre("Yorgy");
		jorge.setId("2");
		jorge.setRol("Tutor");	
		
		System.out.println("\n"+jorge.toString());
	}

}
