package com.fpjpractica1.main;

import java.util.Scanner;

public class Fpjpractica {

	public static void main(String[] args) {
		// Pr�ctica4
		//Introducir los d�as de la semana y mostrar el d�a de la semana en cadena.
		
		int diaSemana = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el d�a de la semana: ");
		diaSemana = input.nextInt();
		switch(diaSemana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("D�a introducido no v�lido.");
		}
		//Pr�ctica 5
		//Pedir al usuario. Si el usuario es menor a cinco entonces mostrar ni�o. Si es mayor o igual a cinco y menor o igual a 18 eres adolecente. Si es mayor o igual a 18 y menor que 36, entonces mostrar chavoruco. Si es 37 Mostrar Macho Castigador Pelo en pecho lomo plateado. Si es mayor a 37 mostrar viejito.
		int edad = 0;
		System.out.print("\nDame tu edad: ");
		edad = input.nextInt();
		
		if(edad<5) {
			System.out.println("Eres un ni�o!!");
		}
		else if (edad>=5 && edad < 18) {
			System.out.println("Eres un adolecente!!");
		}
		else if (edad>=18 && edad < 37) {
			System.out.println("Eres un Chavoruco");
		}
		else if (edad == 37) {
			System.out.println("Sos un macho castigador, hostia!");
		}
		else if (edad >37) {
			System.out.println("Eres un viejito!!");
		}
		
		input.close();	
	}

}


