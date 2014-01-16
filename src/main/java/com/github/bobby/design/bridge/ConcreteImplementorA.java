package com.github.bobby.design.bridge;

public class ConcreteImplementorA implements Implementor{
	public void operaiontImpl(String str) {
		System.out.println("ConcreteImplementorA.operaiontImpl()");
		System.out.println(str);
	}
}
