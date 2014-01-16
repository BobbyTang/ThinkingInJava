package com.mindviewinc.chapter11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.TextFile;

public class Ex21 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.addAll(new TextFile(
				"src/com/mindviewinc/chapter11/sample/collection/SetOperations.java",
				"\\W+"));
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		countWords(words);
	}

	private static void countWords(List<String> words) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) != null ? map.get(word) + 1 : 1);
			}
		}
	}

}
