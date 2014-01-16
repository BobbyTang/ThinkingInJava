package com.mindviewinc.chapter17.exercise;

public class TestListIterator {
	public static void main(String[] args) {
		// LinkedList<String> list = new
		// LinkedList<String>(Arrays.asList("A","B","C"));
		// ListIterator<String> listIter = list.listIterator();
		// listIter.add("d");
		// listIter.add("e");
		// //listIter.next();
		//
		// for (String str : list){
		// System.out.println(str);
		// }

		SList<String> list = new SList<String>();
		SListIterator<String> sListIter = list.iterator();
		sListIter.insert("A");
		sListIter.insert("B");
		sListIter.insert("C");
		SListIterator<String> sListIter2 = list.iterator();
		while (sListIter2.hasNext()) {
			String str = sListIter2.next();
			System.out.println(str);
		}

		// First, show some use cases for SListIterator
		// print("Demonstrating SListIterator...");
		// SList<String> sl = new SList<String>();
		// SListIterator<String> slit = sl.iterator();
		// slit.insert("One");
		// slit.insert("Two");
		// slit.insert("Three");
		// print(slit.hasNext());
		// print(slit.next());
		// print(sl);
	}
}
