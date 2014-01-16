package com.github.bobby.design.bridge;

public class Client {
	public static void main(String[] args) {
		Abstraction ab = setMyAbstraction();
		
		String str = "new";
		
		ab.operation(str);
	}

	private static Abstraction setMyAbstraction() {
		Abstraction ab = null;
		
		ab = new RefinedAbstraction();
		ab.setImplementor(new ConcreteImplementorA());
		return ab;
	}
}
