package com.datastructures.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DataStructuresHashMap {
	public static void main(String[] args) {
		HashMap<String, Double> miMapa = new HashMap<String, Double>();
		
		miMapa.put("Tacos Cuesillo", 24.0);
		miMapa.put("Tacos de Cabeza", 18.0);
		miMapa.put("Tacos de cachete", 12.0);
		miMapa.put("Tacos de Pastor", 10.0);
		
		for (Entry<String, Double> miEntry:miMapa.entrySet()) {
			System.out.println("Elemento <\"" + miEntry.getKey() + "\", " + miEntry.getValue() + ">");
		}
	}
}
