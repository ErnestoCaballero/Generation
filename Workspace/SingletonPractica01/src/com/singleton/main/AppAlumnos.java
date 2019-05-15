package com.singleton.main;
import com.singleton.model.*;

public class AppAlumnos {
	public static void main(String[] args) {
		/*//Forma 1 
		Alumnos alumno1 = null;
		alumno1.getInstanceOfAlumnos();*/
		
		//Forma 2
		Alumnos alumno1 = Alumnos.getInstanceOfAlumnos();
		
		/*//Forma 3
		Alumnos.getInstanceOfAlumnos();*/
		
		alumno1.setIdAlumno(1);
		alumno1.setNombre("Ernesto");
		System.out.println("id: " + alumno1.getIdAlumno() + " Nombre: " + alumno1.getNombre());
		
		
		Alumnos alumno2 = Alumnos.getInstanceOfAlumnos();
		
		alumno2.setIdAlumno(2);
		alumno2.setNombre("Pablo");
		System.out.println("id: " + alumno2.getIdAlumno() + " Nombre: " + alumno2.getNombre() + alumno1.getNombre());
		
	}
}
