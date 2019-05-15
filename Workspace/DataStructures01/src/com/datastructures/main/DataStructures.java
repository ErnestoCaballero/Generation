package com.datastructures.main;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class DataStructures {

	public static void main(String[] args) {
		List<String> miLista = new ArrayList<String>();
		
		miLista.add("Perritu");
		miLista.add("Pajaritu");
		miLista.add("Gatitu");
		miLista.add("Pajaritu");
		miLista.add("Periquitu");
		miLista.add("Pajaritu");
		
		Iterator miIterator = miLista.iterator();
		String elemento = "";
		int cont = 0;
		int contPajaritus = 0;
		
		for (int i = 0; i < miLista.size(); i++) {
			if(miLista.get(i).equals("Pajaritu")) {
				elemento += i + " ";
				cont++;
			}
		}
		
		System.out.println(elemento + " Número de Pajaritus: " + cont);
		System.out.println();
		
		while (miIterator.hasNext()) {
			if (miIterator.next().equals("Pajaritu")) {
				contPajaritus++;
			}
		}
		
		System.out.println("El número de Pajaritus con Iteraator es: " + contPajaritus);
		
		miIterator = miLista.iterator();
		
		while (miIterator.hasNext()) {
			System.out.println("Elemento: " + miIterator.next());
		}
		
		System.out.println();
		
		miIterator = miLista.iterator();
		//Collections.sort(miLista);
		
		while (miIterator.hasNext()) {
			System.out.println("Elemento: " + miIterator.next());
		}
		
		System.out.println("Elemento en el índice 2: " + miLista.get(2));
		
		System.out.println("Se encuentra Pajaritu? " + miLista.contains("Pajaritu"));
		
		System.out.println("El índice del Pajaritu es: " + miLista.indexOf("Pajaritu")); //Método Non Greedy. La primera coincidencia.
		
		System.out.println("Dónde está mi último Pajaritu: " + miLista.lastIndexOf("Pajaritu"));
		
	}
}