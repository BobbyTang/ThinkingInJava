package com.github.bobby.design.decorator;

public abstract class Decorator implements Component{
	protected Component c;
	public Decorator(Component c){
		this.c = c;
	}
	
	abstract public void operation();
	
}
