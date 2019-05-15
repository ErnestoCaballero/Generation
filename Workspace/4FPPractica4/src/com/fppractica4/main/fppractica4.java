package com.fppractica4.main;

public class fppractica4 {

	public static void main(String[] args) {
		Alumno Juan = new Alumno();
		Alumno Pedro = new Alumno();
		Alumno Angel = new Alumno();
		
		Juan.setNombreAlumno("Juan");
		Pedro.setNombreAlumno("Pedro");
		Angel.setNombreAlumno("Angel");
		
		//Juan
		System.out.println("\nNombre del alumno: "+Juan.getNombreAlumno());
		System.out.println("Escuela: "+Juan.escuela);
		
		//Pedro
		System.out.println("\nNombre del alumno: "+Pedro.getNombreAlumno());
		System.out.println("Escuela: "+Pedro.escuela);
		Pedro.escuela = "CUCEI";
		
		//Angel
		System.out.println("\nNombre del alumno: "+Angel.getNombreAlumno());
		System.out.println("Escuela: "+Angel.escuela);
		
		System.out.println("\nEl área de 2 es: "+Alumno.calcularAreaCuadrado(2));
		
	}

}
