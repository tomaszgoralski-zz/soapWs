package com.sample;

import javax.xml.ws.Endpoint;

public class HelloPublisher {
	public static void main(String[] args) {
		final String url = "http://localhost:8888/rs";
		System.out.println("Publishing RandService at endpoint " + url);
		Endpoint.publish(url, new HelloService());
		final String url2 = "http://localhost:8889/rs";
		System.out.println("Publishing MathService at endpoint " + url2);
		Endpoint.publish(url2, new MathService());
	}
}