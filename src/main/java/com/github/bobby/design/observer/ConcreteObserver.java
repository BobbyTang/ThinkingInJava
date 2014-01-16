package com.github.bobby.design.observer;

public class ConcreteObserver implements Observer{
	private String concreteName;
	public ConcreteObserver(String concreteName){
		this.concreteName = concreteName;
	}
	public void update() {
		System.out.println("ConcreteObserver.update() " + concreteName);
	}
}
