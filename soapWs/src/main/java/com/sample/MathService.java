package com.sample;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class MathService {
	@WebMethod()
	public int sum(@WebParam(name = "number1") int x,
			@WebParam(name = "number2") int y) {
		return (x + y);
	}
}