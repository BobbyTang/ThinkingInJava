package com.github.bobby.design.decorator;

public class ConcreteDecoratorA extends Decorator{
	
	public ConcreteDecoratorA(Component c) {
		super(c);
	}

	public void operation() {
		System.out.println("ConcreteDecoratorA.operation()");
		c.operation();
	}
}
