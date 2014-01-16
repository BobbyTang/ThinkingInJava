package com.mindviewinc.chapter11.exercise;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex24 {
	public static void main(String[] args) {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		Map<String, Object> mapNew = new LinkedHashMap<String, Object>();
		Set<String> keySet = map.keySet();
		Set<String> set = new TreeSet<String>(keySet);//”√treeset≈≈–Ú
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			String key = iter.next();
			mapNew.put(key, map.get(key));
		}
		
	}
}
