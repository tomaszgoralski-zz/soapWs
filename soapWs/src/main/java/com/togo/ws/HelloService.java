package com.togo.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class HelloService {
	@WebMethod(operationName="sayfromName")
	public String say(@WebParam(name = "text") String text) {
		return "Hello" + text;
	}
}