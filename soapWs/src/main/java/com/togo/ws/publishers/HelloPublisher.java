package com.togo.ws.publishers;

import javax.xml.ws.Endpoint;

import com.togo.ws.HelloService;

public class HelloPublisher {
	public static void main(String[] args) {

		final String url = "http://localhost:8888/hs";
		System.out.println("Publishing HelloService at endpoint " + url);
		Endpoint.publish(url, new HelloService());
	}
}