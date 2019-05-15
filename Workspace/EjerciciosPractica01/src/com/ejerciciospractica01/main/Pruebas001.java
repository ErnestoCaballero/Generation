package com.ejerciciospractica01.main;

import java.util.Scanner;

public class Pruebas001 {
	public static void main(String[] args) {
		@SuppressWarnings(value  = {""})
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int edad = input.nextInt();
		
		try {
			assert edad >= 18: "Not valido";
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("\nValue is "+edad);
		}
	}
}
