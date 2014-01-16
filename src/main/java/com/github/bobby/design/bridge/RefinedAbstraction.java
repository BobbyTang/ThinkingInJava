package com.github.bobby.design.bridge;

public class RefinedAbstraction extends Abstraction{
	
	public void operation(String str) {
		System.out.println(str);
		System.out.println("RefinedAbstraction.operation()");
		str = "other";
		imp.operaiontImpl(str);
	}
}
