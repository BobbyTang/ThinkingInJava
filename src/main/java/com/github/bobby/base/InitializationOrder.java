package com.github.bobby.base;

public class InitializationOrder {

	public static void main(String[] args) {
		Subclass sb = new Subclass();
		/**
		 * 1
		 * 2
		 * 3
		 * 
		 */
	}
}

class Super {

	static {
		System.out.println(1);
	}

	Super(int i) {
		System.out.println(i);
	}
}

class Subclass extends Super implements Interface {

	static {
		System.out.println(2);
	}

	Super su = new Super(4);

	Subclass() {
		super(3);
		new Super(5);
	}
}

interface Interface {
	static Super su = new Super(0);
}
