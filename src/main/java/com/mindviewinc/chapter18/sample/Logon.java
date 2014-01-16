package com.mindviewinc.chapter18.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import static net.mindview.util.Print.*;

public class Logon implements Serializable {
	private Date date = new Date();
	private String username;
	private transient String password;

	public Logon(String name, String pwd) {
		username = name;
		password = pwd;
	}

	public String toString() {
		return "logon info: \n   username: " + username + "\n   date: " + date
				+ "\n   password: " + password;
	}

	public static void main(String[] args) throws Exception {
		Logon a = new Logon("Hulk", "myLittlePony");
		print("logon a = " + a);
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(
				"src/com/mindviewinc/chapter18/sample/Logon.out"));
		o.writeObject(a);
		o.close();
		TimeUnit.SECONDS.sleep(1); // Delay
		// Now get them back:
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"src/com/mindviewinc/chapter18/sample/Logon.out"));
		print("Recovering object at " + new Date());
		a = (Logon) in.readObject();
		print("logon a = " + a);
	}
}