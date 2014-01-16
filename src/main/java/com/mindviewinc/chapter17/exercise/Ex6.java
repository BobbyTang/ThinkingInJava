package com.mindviewinc.chapter17.exercise;
import java.util.*;
import static net.mindview.util.Print.*;
public class Ex6 {
	static void test(String msg, List<String> list) {
		System.out.println("--- " + msg + " ---");
		Collection<String> c = list;
		Collection<String> subList = list.subList(1,8);
		// Copy of subList:
		Collection<String> c2 = new ArrayList<String>(subList);
		try { c.retainAll(c2); } catch(Exception e) {
			print("retainAll(): " + e);
		}
		try { c.removeAll(c2); } catch(Exception e) {
			print("removeAll(): " + e);
		}
		try { c.clear(); } catch(Exception e) {
			print("clear(): " + e);
		}		 
		try { c.add("X"); } catch(Exception e) {
			print("add(): " + e);
		}
		try { c.addAll(c2); } catch(Exception e) {
			print("addAll(): " + e);
		}
		try { c.remove("C"); } catch(Exception e) {
			print("remove(): " + e);
		}
		// The List.set() method modifies the value but
		// doesn't change the size of the data structure:
		try {
			list.set(0, "X");
		} catch(Exception e) {
			print("List.set(): " + e);
		}
		// Additional optional List methods:
		try { list.add(0, "X"); } catch(Exception e) {
			print("List.add(): " + e);
		}
		try { list.addAll(0, c2); } catch(Exception e) {
			print("List.addAll(): " + e);
		}
		try { list.remove(0); } catch(Exception e) {
			print("List.remove(): " + e);
		}
		try { list.removeAll(c2); } catch(Exception e) {
			print("List.removeAll(): " + e);
		}
		try { list.retainAll(c2); } catch(Exception e) {
			print("List.retainAll(): " + e);
		}			
	}
	public static void main(String[] args) {
		List<String> list = 
			Arrays.asList("A B C D E F G H I J K L".split(" "));
		test("Modifiabe Copy", new ArrayList<String>(list));
		test("Arrays.asList()", list);
		test("unmodifiableLlist()", 
			Collections.unmodifiableList(new ArrayList<String>(list)));
	}
}
