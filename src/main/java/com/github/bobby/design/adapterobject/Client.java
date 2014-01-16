package com.github.bobby.design.adapterobject;

public class Client {
	public static void main(String[] args) {
		Target t = new Adapter(new Adaptee());
		t.request();
	}
}
