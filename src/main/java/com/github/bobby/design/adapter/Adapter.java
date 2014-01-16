package com.github.bobby.design.adapter;

public class Adapter extends Adaptee implements Target{
	public void request() {
		System.out.println("Adapter.request()");
		specialRequest();
	}
}
