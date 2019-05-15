package com.soappractica01;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HolaMundoCliente {

	public static void main(String[] args) {
		try {
			URL miURL = new URL("http://localhost:9876/HolaMundo?wsdl");
			QName miQName = new QName("http://soappractica01.com/", "HolaMundoServerImplementationService"); //A clase concreta que implementa el método, hay que ponerlo aquí como parámetro y AGREGARLE un "Service" al final!!!
			Service miServicio = Service.create(miURL, miQName);
			IHolaMundoServer server = miServicio.getPort(IHolaMundoServer.class);
			
			System.out.println(server.diHolaMundo());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
