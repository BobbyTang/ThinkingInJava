package com.github.bobby.base;

import java.util.TreeSet;

public class SetSizeTest {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		System.out.println(set.size());
		set.add("1");
		System.out.println(set.size());//size������ӵĸ����ı�
	}
}
