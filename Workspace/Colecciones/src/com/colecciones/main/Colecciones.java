package com.colecciones.main;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class Colecciones {

	public static void main(String[] args) {
		//method01();
		//method02();	
		//method03();
		//method04();
	}
	
	public static void method01() {
		ArrayList arreglo = new ArrayList();
		arreglo.add(8);
		arreglo.add(30);
		arreglo.add(20);
		arreglo.add(15);
		arreglo.add(30);
		arreglo.add(90);
		arreglo.add(5);		
		
		for(int i=0; i<arreglo.size();i++) {
			System.out.println(arreglo.get(i));
		}
	}
	
	public static void method02() {
		Vector arreglo = new Vector();
		arreglo.add(8);
		arreglo.add(30);
		arreglo.add(20);
		arreglo.add(15);
		arreglo.add(30);
		arreglo.add(90);
		arreglo.add(5);		
		
		for(int i=0; i<arreglo.size();i++) {
			System.out.println(arreglo.get(i));
		}
	}
	
	public static void method03() {
		
		LinkedList <Integer> arreglo = new LinkedList();
		
		arreglo.add(8);
		arreglo.add(30);
		arreglo.add(20);
		arreglo.add(15);
		arreglo.add(30);
		arreglo.add(90);
		arreglo.add(5);		
		
		for(int i=0; i<arreglo.size();i++) {
			System.out.println(arreglo.get(i));
		}
	}
	
	public static void method04() {
		PriorityQueue <Integer> arreglo = new PriorityQueue();
		
		arreglo.add(80);
		arreglo.add(5);
		arreglo.add(20);
		arreglo.add(15);
		arreglo.add(70);
		arreglo.add(90);
		arreglo.add(6);	
		
		System.out.println(arreglo.peek());
		System.out.println(arreglo);
		System.out.println(arreglo.poll());
		System.out.println(arreglo);
	}

}











