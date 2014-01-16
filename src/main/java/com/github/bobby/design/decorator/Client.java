package com.github.bobby.design.decorator;

public class Client {
	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		Decorator decorator = new ConcreteDecoratorA(c);
		decorator.operation();
	}
}
