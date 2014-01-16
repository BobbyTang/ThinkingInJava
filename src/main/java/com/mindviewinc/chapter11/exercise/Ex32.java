package com.mindviewinc.chapter11.exercise;

import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

public class Ex32 extends PetSequence implements Iterable<Pet>{
	public Iterator<Pet> iterator() {			//实现一个不是Collection的外部类时，使用Iterator就会变得非常吸引人
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public Iterable<Pet> reversed() {			//Iterable不是Iterator
		return new Iterable<Pet>() {			
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>() {
					int index = pets.length - 1;
					public Pet next() {
						return pets[index--];
					}
					public boolean hasNext() {
						return index >= 0;
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
	public static void main(String[] args) {
		Ex32 ex = new Ex32();
		for (Pet pet : ex.reversed()) {//利用foreach逆序
			System.out.println(pet);
		}
		for (Pet pet : ex) {
			System.out.println(pet);
		}
	}
}
