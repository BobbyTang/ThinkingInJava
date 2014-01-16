package com.mindviewinc.chapter11.exercise;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
	public static void main(String[] args) {
		List<Gerbil> list = new ArrayList<Gerbil>();
		for(int i=0;i<10;i++){
			list.add(new Gerbil(i));
		}
		
		for(int i=0;i<10;i++){
			list.get(i).hop();
		}
		//foreach Ñ­»·
		for(Gerbil gerbil: list){
			gerbil.hop();
		}
	}
	
}

class Gerbil {
	private int gerbilNumber;
	public Gerbil(int gerbilNumber){
		this.gerbilNumber = gerbilNumber;
	}
	public void hop(){
		System.out.println("gerbil " + gerbilNumber + " is jumping.");
	}
}