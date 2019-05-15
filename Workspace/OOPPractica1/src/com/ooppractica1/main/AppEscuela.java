package com.ooppractica1.main;
import com.ooppractica1.model.Alumno;

public class AppEscuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.out.println("Hola, univeso!\n");
			//Forma de dos líneas.
			Alumno Miguel;
			Miguel = new Alumno(); //cuando usamos la palabra "new" estamos creando un nuevo objeto de esa clase. Concretización.
			
			//Forma de una línea
			Alumno Armando = new Alumno("Armando");
			
			Alumno Carlos = new Alumno("Carlos", "Plaza del sol");
			
			Miguel.setNombreAlumno("Miguel");
			Miguel.setDireccionAlumno("IJALTI");
			
			//Miguel.nombreAlumno = "Miguel"; Aquí se le da entrada directa al atributo cuando es public. Pero debe ser private.
			//Miguel.direccionAlumno ="IJALTI";
			
			System.out.println("El nombre de Miguel es " + Miguel.getNombreAlumno());
			System.out.println("El domicilio de Miguel es " + Miguel.getDireccionAlumno());
			
			System.out.println("El nombre de Armando es " + Armando.getNombreAlumno());
			System.out.println("El domicilio de Armando es " + Armando.getDireccionAlumno());
			
			System.out.println("El nombre de Carlos es " + Carlos.getNombreAlumno());
			System.out.println("El domicilio de Miguel es " + Carlos.getDireccionAlumno());
			
			Carlos.setDireccionAlumno("Tabacholos");
			System.out.println("El nombre del objeto Carlos es: " + Carlos.getNombreAlumno());
			System.out.println("El domicilio del objeto Carlos es: "+ Carlos.getDireccionAlumno());
			
	}
}