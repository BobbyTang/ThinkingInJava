package com.github.bobby.design.proxy;

public class Client {
	public static void main(String[] args) {
		Subject proxy = new Proxy();
		proxy.request();
	}
}
