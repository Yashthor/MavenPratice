package com.example;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.HttpServer;

public class HttpServerDemo {

	public static void main(String[] args) throws IOException {
		HttpServer server = HttpServer.create(new InetSocketAddress("localhost",8000), 0);
		server.createContext("/hello",new HelloHandler());
		server.setExecutor(Executors.newFixedThreadPool(4));
		server.start();

	}

}
