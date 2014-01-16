package com.github.bobby.design.bridge;

public abstract class Abstraction {
	protected Implementor imp;
	public void setImplementor(Implementor imp){
		this.imp = imp;
	}
	abstract public void operation(String str);
}
