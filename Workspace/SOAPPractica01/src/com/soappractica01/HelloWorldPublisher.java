//Este método es para subi
package com.soappractica01;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
	public static void main(String[] args) {
		System.out.println("Vamos a publicar el servicio \"Hola Mundo\"");
		Endpoint.publish("http://localhost:9876/HolaMundo", new HolaMundoServerImplementation());
		System.out.println("Se terminó de publicar el servicio");
	}
}
