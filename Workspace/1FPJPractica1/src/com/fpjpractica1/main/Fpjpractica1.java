package com.fpjpractica1.main;
import java.util.Scanner;

public class Fpjpractica1 {

	public static void main(String[] args) {
		// Práctica 1
		// Mostrar Hola mundo
		System.out.println("Hola, Mundo!");
		
		//Practica 
		//Aceptar un valor desde el teclado.
		//Para aceptar un valor del teclado se necesita que el objeto Scanner y las variables en donde se almacenarán los valores.
		String nombre = "";
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nIntroduce tu nombre: ");
		nombre = input.nextLine();
		System.out.println("Tu nombre es: " + nombre);
		
		//Práctica 3
		//Instroducor la base y la altura de un triángulo y calcular su área.
		int base=0;
		int altura=0;
		double area = 0.0;
		System.out.print("\nDame la base del triángulo: ");
		base = input.nextInt();
		System.out.print("Dame la altura del triángulo: ");
		altura = input.nextInt();
		area = (base * altura)/2;
		System.out.println("El área es " + area);		
	}

}
