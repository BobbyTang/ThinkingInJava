package com.github.bobby.design.adapterobject;

public class Adapter extends Target{
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	public void request() {
		System.out.println("Adapter.request()");
		adaptee.specialRequest();
	}
}
