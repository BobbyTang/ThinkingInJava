package com.github.bobby.test;

public class StringEqualTest {
	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		String d = new String("abc");
		
		System.out.println(a == b);//true
		System.out.println(a == c);//false
		System.out.println(c == d);//false
		System.out.println(a.equals(b));//true
		System.out.println(a.equals(c));//true
		System.out.println(c.equals(d));//true
		
		System.out.println(a == c.intern());//true
		System.out.println(c.intern() == d.intern());//true
		
		System.out.println(d == d.concat(""));//true
	}
}
