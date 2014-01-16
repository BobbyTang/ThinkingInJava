package com.mindviewinc.chapter17.sample;

public class StringHashCode {
	public static void main(String[] args) {
		String[] hellos = "Hello Hello".split(" ");
		System.out.println(hellos[0].hashCode());
		System.out.println(hellos[1].hashCode());
		
		System.out.println(hellos[0].equals(hellos[1]));
		System.out.println(hellos[0] == hellos[1]);
		
	}
}
