package com.fppractica6.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivos {

	public static void main(String[] args) throws IOException {
		File archivo = null;
		FileReader reader = null;
		BufferedReader buffer = null;
		
		try {
			archivo = new File("c:\\a\\HolaMundo.java");
			reader = new FileReader(archivo);
			buffer = new BufferedReader(reader);
			String linea="";
			
			System.out.println(linea=buffer.readLine());
			
			while((linea=buffer.readLine())!=null)
			{
				System.out.println(linea);
			}
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				buffer.close();
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/*
	public static void method01() {
		File archivo = new File("c:\\a\\HolaMundo.java");
		
		try {
			FileReader reader = new FileReader(archivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method02() {
		
	}
*/
}
