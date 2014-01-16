package com.mindviewinc.chapter18.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.ListIterator;


public class Ex7 {
	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("src/com/mindviewinc/chapter18/exercise/Test.java"));
			String str = null;
			LinkedList<String> list = new LinkedList<String>();
			while ((str = br.readLine()) != null) {
				list.add(str);
			}
			br.close();
			
			ListIterator<String> iter = list.listIterator(list.size());
			while(iter.hasPrevious()){
				String s;
				s = iter.previous();
				s = s.toUpperCase();
				System.out.println(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
