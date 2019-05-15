package com.soappractica01;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soappractica01.IHolaMundoServer")
public class HolaMundoServerImplementation implements  IHolaMundoServer {
	public String diHolaMundo() {
		return "Hola Mundo";
	}
}
