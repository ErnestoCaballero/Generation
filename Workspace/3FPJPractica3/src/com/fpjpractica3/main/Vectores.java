package com.fpjpractica3.main;

import java.util.Random;

public class Vectores {

	public static void main(String[] args) {
		//method01();
		method02();
	}
	
	
	public static void method01() {
		int[] enteros = new int[100];
		
		Random aleatorio = new Random(System.currentTimeMillis());
		
		for (int i= 0; i<100;i++) {
			enteros[i]=aleatorio.nextInt(100);
		}
		
		for(int i =0; i<100;i++) {
			System.out.println("Enteros ["+i+"]: "+enteros[i]);
		}
		System.out.println(System.currentTimeMillis());
	}

	public static void method02() {
		final int ELEMENTOS_VECTOR = 200;
		final int LIMITE_SUPERIOR = 100;
		int[] enteros = new int[ELEMENTOS_VECTOR];
		Random aleatorio = new Random(System.currentTimeMillis());
		
		for (int i= 0; i<ELEMENTOS_VECTOR;i++) {
			enteros[i]=aleatorio.nextInt(LIMITE_SUPERIOR);
		}
		
		for(int i =0; i<ELEMENTOS_VECTOR;i++) {
			System.out.println("Enteros ["+i+"]: "+enteros[i]);
		}
		
	}
	
}
