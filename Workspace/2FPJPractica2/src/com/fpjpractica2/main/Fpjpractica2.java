package com.fpjpractica2.main;
import java.util.Scanner;

public class Fpjpractica2 {

	public static void main(String[] args) {
		//Pr�ctica 6
		//Ciclo For
		//Series
		//Del 1 al 100
		for(int cont = 0;cont<=100; cont+=1) {
			System.out.println(cont);
		}
		//Ciclo for
		//for(;;) {
			//System.out.println("1");
		//}
		
		//for(int cont=1;cont>0;cont++) {
			//System.out.println(cont);
		//}
		
		//Pr�ctica 8
		//Calcular el n�mero primo
		boolean isPrimo=true;
		int numero = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("\nIntroduce un n�mero: ");
		numero = input.nextInt();
		for(int i=2;i<numero;i++) {
			if(numero%i==0) {
				isPrimo=false;
			}
		}
		System.out.println("El n�mero introducido es primo? "+isPrimo);
		
		//Pr�ctica 9
		//Sumar los pares del 2 al 2000
		int cont = 2;
		int acum = 0;
		while(cont<=2000) {
			acum+=cont;
			cont+=2;
		}
		System.out.println("\nLa suma de los pares del 2 al 2000: "+acum);
		
		//Pr�ctica 10
		//Pedir al usuario el radio del un c�rculo y mostrar su �rea.
		final double PI = 3.14151921863579;
		double radio = 0.0;
		double area = 0.0;
		System.out.print("\nInstroduce el radio de un c�rculo: ");
		radio = input.nextDouble();
		area = PI*radio*radio;
		System.out.println("El �rea del c�rculo es: " + area);		
		
		//Pr�ctica 11
		//Serie de Fibonacci
		// 1,1,2,3,5,8,13,21
		//Pedir al usuario la cantidad de n�meros a mostrar de la serie de Fibonacci
		
		int posicion = 0;
		int fibonacci = 1;
		int anterior = 1;
		int temp = 0;
		
		System.out.println("\nDame la posici�n de la serie de Fibonacci que quiere: ");
		posicion = input.nextInt();
		
		for(int i = 1; i < posicion-1; i++) {
			temp = fibonacci;
			fibonacci = fibonacci+anterior;
			anterior = temp;
		}
		System.out.println("El Fibonacci de la posici�n "+posicion+" es "+fibonacci);
		
		
		
		input.close();
	}

}
