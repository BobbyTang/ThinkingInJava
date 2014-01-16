package com.mindviewinc.chapter11.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex8 {
	public static void main(String[] args) {
		List<Gerbil> list = new ArrayList<Gerbil>();
		for(int i=0;i<10;i++){
			list.add(new Gerbil(i));
		}
		
		Iterator<Gerbil> iter= list.iterator();
		while(iter.hasNext()){
			iter.next().hop();
		}
	}
	
}
