package com.github.bobby.design.proxy;

public class Proxy implements Subject{
	private RealSubject subject;
	
	public void request() {
		if(subject == null){
			subject = new RealSubject();
		}
		
		subject.request();
		
	}
}
