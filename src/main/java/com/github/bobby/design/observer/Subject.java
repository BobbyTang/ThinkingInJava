package com.github.bobby.design.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	List<Observer> list = new ArrayList<Observer>();
	public void attach(Observer o){
		if(o != null){
			list.add(o);
		}
	}
	
	public void detach(Observer o) {
		list.remove(o);
	}
	
	public void notifyObserver(){
		for(Observer o : list){
			o.update();
		}
	}
}
