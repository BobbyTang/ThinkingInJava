package com.mindviewinc.chapter11.exercise;
import net.mindview.util.*;
public class Ex15 {
	public static void main(String[] args) {
		Stack<Character> sc = new Stack<Character>();//		Character!!!
		sc.push('U');
		sc.push('n');
		sc.push('c');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push('e');
		sc.push('r');
		sc.push('t');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push('a');
		sc.push('i');
		sc.push('n');
		sc.push('t');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push(' ');
		System.out.print(sc.pop());
		sc.push('r');
		sc.push('u');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push('l');
		sc.push('e');
		sc.push('s');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
	}
}
