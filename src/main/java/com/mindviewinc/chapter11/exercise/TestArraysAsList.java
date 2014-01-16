package com.mindviewinc.chapter11.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import net.mindview.util.PPrint;

public class TestArraysAsList {
	public static void main(String[] args) {
		String[] strs = {"1","2","3","4","5","6","7","8","9","10"};
		//List<String> list = Arrays.asList(strs);
		List<String> list = new ArrayList<String>(Arrays.asList(strs));
		Collections.shuffle(list);
		
		PPrint.pprint(list);
		PPrint.pprint(strs);
	}
}
