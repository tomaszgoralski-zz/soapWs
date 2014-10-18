package com.togo.ws.publishers;

import javax.xml.ws.Endpoint;

import com.togo.ws.MathService;

public class MathPublisher {
	public static void main(String[] args) {

		final String url2 = "http://localhost:8889/ms";
		System.out.println("Publishing MathService at endpoint " + url2);
		Endpoint.publish(url2, new MathService());
	}
}