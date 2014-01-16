package com.github.bobby.design.proxy;

public class RealSubject implements Subject{

	public void request() {
		System.out.println("RealSubject.request()");
	}
	
}
