package com.mindviewinc.chapter18.sample;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class FreezeAlien {
	public static void main(String[] args) throws Exception {
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("src/com/mindviewinc/chapter18/sample/X.file"));
		Alien quellek = new Alien();
		out.writeObject(quellek);
	}
}
