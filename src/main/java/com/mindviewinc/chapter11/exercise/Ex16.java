package com.mindviewinc.chapter11.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import net.mindview.util.TextFile;

public class Ex16 {
	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		words.addAll(new TextFile("src/com/mindviewinc/chapter11/sample/collection/SetOperations.java", "\\W+"));
		countAndDisplayVowels(words);
	}

	private static void countAndDisplayVowels(Set<String> words) {
		Set<Character> vowels = new HashSet<Character>();
		vowels.addAll(Arrays.<Character>asList('a','e','i','o','u','A','E','I','O','U'));
		Iterator<String> iter = words.iterator();
		int countAll = 0;
		while(iter.hasNext()){
			int count = 0;
			String word = iter.next();
			char[] letter = word.toCharArray();
			for (char c : letter) {
				if(vowels.contains(c)){
					count++;
					countAll++;
				}
			}
			System.out.println(word + "		count : " + count);
		}
		System.out.println();
		System.out.println("countAll = " + countAll);
	}
}
