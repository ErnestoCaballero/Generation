package com.fpjpractica1.main;
import java.util.Scanner;

public class Fpjpractica1 {

	public static void main(String[] args) {
		// Pr�ctica 1
		// Mostrar Hola mundo
		System.out.println("Hola, Mundo!");
		
		//Practica 
		//Aceptar un valor desde el teclado.
		//Para aceptar un valor del teclado se necesita que el objeto Scanner y las variables en donde se almacenar�n los valores.
		String nombre = "";
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nIntroduce tu nombre: ");
		nombre = input.nextLine();
		System.out.println("Tu nombre es: " + nombre);
		
		//Pr�ctica 3
		//Instroducor la base y la altura de un tri�ngulo y calcular su �rea.
		int base=0;
		int altura=0;
		double area = 0.0;
		System.out.print("\nDame la base del tri�ngulo: ");
		base = input.nextInt();
		System.out.print("Dame la altura del tri�ngulo: ");
		altura = input.nextInt();
		area = (base * altura)/2;
		System.out.println("El �rea es " + area);		
	}

}
