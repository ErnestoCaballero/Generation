package com.linkedList.main;

public class Nodo {
	
	private Object value;  //Es un objeto de la clase más alta de Java-
	private Nodo next = null;  //Nodo es un atributo de la clase Nodo que acabamos de crear. Es por una propiedad recursiva que se puede hacer esto. 
	public Nodo(Object value) {
		this.value = value;
	}
	
	public Nodo getNext() {
		return next;
	}
	
	public Object getValue() {
		return value;
	}
	
	public void setNext(Nodo next) {
		this.next = next;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
}
