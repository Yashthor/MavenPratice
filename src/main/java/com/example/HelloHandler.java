package com.example;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class HelloHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange exchange) throws IOException {
	String resp = "I am inside handler method with " + Thread.currentThread().getName();
	exchange.sendResponseHeaders(200, resp.length());
	OutputStream outputStream = exchange.getResponseBody();
	outputStream.write(resp.getBytes(StandardCharsets.UTF_8));	
	outputStream.flush();
	outputStream.close();
	

	}

}
