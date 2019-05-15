package com.datastructures.main;

import java.util.*;


public class DataStructuresVector {
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("umesh");
		vector.addElement("irfan");
		vector.addElement("kumar");
		
		Enumeration en = vector.elements();
		
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}	
		
	}
}
