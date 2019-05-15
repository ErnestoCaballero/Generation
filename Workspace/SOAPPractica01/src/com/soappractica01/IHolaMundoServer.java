package com.soappractica01;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC) //El formato del WSDL. El nuevo es Document.
public interface IHolaMundoServer {
	@WebMethod
	public String diHolaMundo();
}
