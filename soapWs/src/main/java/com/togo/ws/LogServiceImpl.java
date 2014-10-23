package com.togo.ws;

import javax.jws.WebService;

@WebService(serviceName="dupa", name = "LogService")
public class LogServiceImpl {
	public void log(String msg) {
		System.out.println(msg);
	}
}