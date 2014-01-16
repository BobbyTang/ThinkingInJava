package com.mindviewinc.chapter18.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ThawAlien {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("src/com/mindviewinc/chapter18/sample", "X.file")));
		Object mystery = in.readObject();
		System.out.println(mystery.getClass());
	}
}
