package com.mindviewinc.chapter11.sample.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Cymric;
import typeinfo.pets.Hamster;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import static net.mindview.util.Print.*;

public class ListFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Pet> pets = Pets.arrayList(7);
		print("1: " + pets);												//
		Hamster h = new Hamster();
		pets.add(h); // Automatically resizes								
		print("2: " + pets);												//
		print("3: " + pets.contains(h));									//3:	true
		pets.remove(h); // Remove by object
		Pet p = pets.get(2);
		print("4: " + p + " " + pets.indexOf(p));							//4:	2
		Pet cymric = new Cymric();
		print("5: " + pets.indexOf(cymric));								//5:	-1
		print("6: " + pets.remove(cymric));									//6:	false
		// Must be the exact object:
		print("7: " + pets.remove(p));										//7:	true
		print("8: " + pets);												//
		pets.add(3, new Mouse()); // Insert at an index
		print("9: " + pets);												//					
		List<Pet> sub = pets.subList(1, 4);
		print("subList: " + sub);											//subList:	
		print("10: " + pets.containsAll(sub));								//10:	true
		Collections.sort(sub); // In-place sort
		print("sorted subList: " + sub);									//
		// Order is not important in containsAll():
		print("11: " + pets.containsAll(sub));								//11:	true
		Collections.shuffle(sub, rand); // Mix it up
		print("shuffled subList: " + sub);									
		print("12: " + pets.containsAll(sub));								//12:	true
		List<Pet> copy = new ArrayList<Pet>(pets);
		print("copy: " + copy);
		sub = Arrays.asList(pets.get(1), pets.get(4));
		print("sub: " + sub);
		copy.retainAll(sub);												
		print("13: " + copy);												
		copy = new ArrayList<Pet>(pets); // Get a fresh copy
		print("Get a fresh copy: " + copy);
		copy.remove(2); // Remove by index
		print("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects					根据对象引用
		print("15: " + copy);
		copy.set(1, new Mouse()); // Replace an element
		print("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		print("17: " + copy);
		print("18: " + pets.isEmpty());
		pets.clear(); // Remove all elements
		print("19: " + pets);
		print("20: " + pets.isEmpty());										//20:	true
		pets.addAll(Pets.arrayList(4));
		print("21: " + pets);
		Object[] o = pets.toArray();
		print("22: " + o[3]);
		Pet[] pa = pets.toArray(new Pet[0]);
		print("23: " + pa[3].id());
	}
}
