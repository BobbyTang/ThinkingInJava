package com.github.bobby.design.observer;

public class Client {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver("A"));
		subject.attach(new ConcreteObserver("B"));
		subject.notifyObserver();
	}
}
