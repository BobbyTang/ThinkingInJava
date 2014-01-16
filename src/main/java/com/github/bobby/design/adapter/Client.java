package com.github.bobby.design.adapter;

public class Client {
	public static void main(String[] args) {
		Target t = new Adapter();
		t.request();
	}
}
