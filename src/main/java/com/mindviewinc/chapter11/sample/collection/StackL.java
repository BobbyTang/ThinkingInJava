package com.mindviewinc.chapter11.sample.collection;

import java.util.LinkedList;
import java.util.Stack;

@SuppressWarnings("unchecked")
public class StackL {
	private LinkedList linkedList = new LinkedList();
	public void push(Object e) {//Ñ¹Õ»
		linkedList.addFirst(e);
	}
	public Object pop(){//³öÕ»
		return linkedList.removeFirst();
	}
	
	public static void main(String[] args) {
		StackL stackL = new StackL();
		Stack stack = new Stack();
	}
}
