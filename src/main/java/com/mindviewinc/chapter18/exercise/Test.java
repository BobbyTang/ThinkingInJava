package com.mindviewinc.chapter18.exercise;

import java.io.File;

import net.mindview.util.PPrint;


public class Test {
	public static void main(String[] args) {
		File file = new File(".");
		String[] fileStr = file.list();
		PPrint.pprint(fileStr);
	}
}
