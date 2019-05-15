package com.fppractica8.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivos {

	public static void main(String[] args) {
		File archivo = null; //Creaci�n de un objeto que almacenar� el path.
		FileWriter pw = null; //Objeto que permite crear un archivo de texto en un path espec�fico.
		BufferedWriter buffer = null; //Objeto que crea un buffer para que de all� lea el procesador y no directamente de los bytes
									//tienen tiempos diferentes los bytes que se env�an y los que puede procesar el procesador. 
		try {
			archivo = new File("c:\\a\\c.txt");
			pw = new FileWriter(archivo);
			buffer = new BufferedWriter(pw);
			
			for(int i = 1;i<=100;i++) {
				buffer.write("Hola ");
			}
			
			pw.write("Hola, mundos!"); 
			/*En el texto resultante sale esto primero aunque est� despu�s en el c�digo. La raz�n es el pw. Que lee
			 directamente los bytes sin pasar por el buffer. Si cambiamos el pw por buffer, s� lo pone despu�s del ciclo for.
									*/
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
