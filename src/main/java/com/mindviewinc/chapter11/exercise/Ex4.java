package com.mindviewinc.chapter11.exercise;

import java.util.Collection;
import java.util.TreeSet;

public class Ex4 {
	public static void main(String[] args) {
		Generator gen = new Generator();
		Collection<String> c = new TreeSet<String>();
		gen.fill(c, 10);
		for (String str : c) {
			System.out.println(str);
		}
	}
}

class Generator{
	private String[] str = {"Snow White","Star Wars","Bashful","Doc"};
	private int index = 0;
	public String next(){
		String temp = str[index];
		if(index == str.length - 1){
			index = 0;
		}else {
			index = index + 1;
		}
		return temp;
	}
	//Ìî³äÈÝÆ÷
	public Collection<String> fill(Collection<String> c, int n){
		for(int i=0; i<n; i++){
			c.add(this.next());
		}
		return c;
	}
	//Ìî³äÊý×Ö
	public void fillAll(String[] ary){
		for (int i = 0; i < ary.length; i++) {
			ary[i] = this.next();
		}
	}
}




