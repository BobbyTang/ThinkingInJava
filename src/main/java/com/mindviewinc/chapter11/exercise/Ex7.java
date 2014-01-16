package com.mindviewinc.chapter11.exercise;

import static net.mindview.util.Print.print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex7 {
	public static void main(String[] args) {
		String [] array = new String[]{"a","b","c","d","e"};
		List<String> list = new ArrayList<String>();
		List<String> subList = null;
		list = Arrays.asList(array);
		print("1:	" + list);
		subList = list.subList(1, 3);
		print("2:	" + subList);
		List<String> copy = new ArrayList<String>(list);
		copy.removeAll(subList);
		print("3:	" + copy);
	}
}
