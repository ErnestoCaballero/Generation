package com.ejerciciospractica01.main;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosPractica01 {

	public static void main(String[] args) {
		//factorial();
		//gaussian();
		//pruebaArrays();
		//practice04();
		//practice05();
		//practice06();
		practice07();
		//practice08();
	}
	
	public static void factorial() {
		Scanner input = new Scanner(System.in);
		System.out.print("Give me a number to calculate it's factorial: ");
		int number = input.nextInt();
		int fact = 1;
		
		for(int i = 2; i <= number; i++) {
			fact = fact * i; 
			System.out.println("Productos: " + fact);
		}
		System.out.println("The factorial is: " + fact);
	}
	
	public static void gaussian() {
		Scanner input = new Scanner(System.in);
		System.out.print("Give me a number to calculate the sum of the first \"n\" numbers: ");
		int number = input.nextInt();
		int res = (number*(number+1))/2;
		
		System.out.println("The sum of the first \"n\" numbers is: " + res);
	}
	
	public static void pruebaArrays() { 
		int enteros[] = new int[5];
		int enteros01[] = new int[5];
		Random rndm = new Random(System.currentTimeMillis());
		
		for(int i=0;i < enteros.length;i++) {
			enteros[i]=rndm.nextInt(100);
			System.out.println("Posición ["+i+"] tiene el valor: " + enteros[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < enteros01.length; i++) {
			enteros01[i] = i;
			System.out.println("Posición ["+i+"] tiene el valor: " + enteros01[i]);
		}
	}
	
	public static void practice04() { //Remover duplicados en un aarreglo.
		int cardinalidad = 10;
		int enteros[] = new int[cardinalidad];
		enteros[0]=1;
		enteros[1]=2;
		enteros[2]=3;
		enteros[3]=2;
		enteros[4]=9;
		enteros[5]=12;
		enteros[6]=13;
		enteros[7]=15;
		enteros[8]=12;
		enteros[9]=20;
		
		
		for(int i=0;i<enteros.length;i++) {
			System.out.print(enteros[i]+", ");
		}
		
		System.out.println(" ");
		
		for(int i = 0; i<enteros.length; i++) {
			for(int j = i + 1; j < enteros.length; j++) {
				if(enteros[i] == enteros[j]) {
					System.out.println("Hay una repetición en los índices: " + i + " y " + j);
				}
			}
		}
		
	}
	
	public static void practice05() {
		int cardinalidad = 20;
		int lsuperior = 100;
		int enteros[] = new int[cardinalidad];
		Random aleatorio = new Random(System.currentTimeMillis());
		
		for(int i = 0; i < enteros.length; i++) {
			enteros[i]=aleatorio.nextInt(lsuperior);
		}
		
		for(int i=0;i<enteros.length;i++) {
			System.out.println("Indice ["+ i +"] Valor: "+enteros[i]);
		}
		
		System.out.println(" ");
		
		for(int i = 0; i<enteros.length; i++) {
			for(int j = i + 1; j < enteros.length; j++) {
				if(enteros[i] == enteros[j]) {
					System.out.println("Hay una repetición en los índices: " + i + " y " + j);
				}
			}
		}
	}
	
	public static void practice06() {
		int cardinalidad = 20;
		int lsuperior = 100;
		int enteros[] = new int[cardinalidad];
		Random aleatorio = new Random(System.currentTimeMillis());
		
		
		for(int i = 0; i < enteros.length; i++) {
			enteros[i] = aleatorio.nextInt(lsuperior);
		}
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.print(enteros[i] + " ");
		}
		
		System.out.println("");
		
		for (int i = 0; i < enteros.length - 1; i++) {
			if (enteros[i] > enteros[i + 1]) {
				int temp = enteros[i];
				enteros[i] = enteros[i + 1];
				enteros[i + 1] = temp;
				i = -1;
			}	
		}
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.print(enteros[i] + " ");
		}
	}
	
	public static void practice07() {
		int cardinalidad = 10;
		int lsuperior = 100;
		int enteros[] = new int[cardinalidad];
		int secretNumber = 0;
		int comparador = 0;
		int indice = enteros.length;
		Random aleatorio = new Random(System.currentTimeMillis());
		
		
		for(int i = 0; i < enteros.length; i++) {
			enteros[i] = aleatorio.nextInt(lsuperior);
		}
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.print(enteros[i] + " ");
		}
		
		System.out.println("");
		
		for (int i = 0; i < enteros.length - 1; i++) {
			if (enteros[i] > enteros[i + 1]) {
				int temp = enteros[i];
				enteros[i] = enteros[i + 1];
				enteros[i + 1] = temp;
				i = -1;
			}	
		}
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.print(enteros[i] + " ");
		}
		
		secretNumber = enteros[aleatorio.nextInt(cardinalidad)];
		System.out.println("");
		System.out.println("The secret number is " + secretNumber);
		
		indice = enteros.length / 2 - 1;
		System.out.println(indice + " " + enteros[indice]);
		comparador = enteros[indice];
		while (comparador != secretNumber) {
			if (secretNumber > comparador) {
				indice = indice + (enteros.length - indice) / 2;
				comparador = enteros[indice];
			} else if (secretNumber < comparador) {
				indice = indice - (indice / 2);
				comparador = enteros[indice];
			} else {
				System.out.println("No se encontró el número.");
			} 	
		}
		
		System.out.println("El número secreto es " + comparador);
	}
	
	public static void practice08() {
		int[] arreglo = {1, 3, 4, 7, 8, 9, 13, 24, 56, 79, 90};
		
		String resultado = busquedaBinaria(arreglo, 56) ? "Se encontró": "No se encontró";
		System.out.println(resultado);

	}
	
	public static boolean busquedaBinaria(int[] arreglo, int numBuscar) {
		int left = 0;
		int right = arreglo.length-1;
		int medio;
		int contador = 0;
		
		while (right >= left) {
			System.out.println("Se ejecutó " + ++contador + " veces");
			medio = (right + left) / 2;
			
			if (numBuscar == arreglo[medio]) {
				System.out.println("Se encontró en la posición " + (medio + 1));
				return true;
			} else if (numBuscar > arreglo[medio]) {
				left = medio + 1;
			} else {
				right = medio - 1;
			}
		}
		return false;
	}
}

