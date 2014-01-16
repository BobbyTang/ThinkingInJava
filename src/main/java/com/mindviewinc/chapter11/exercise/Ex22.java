package com.mindviewinc.chapter11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class Ex22 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		Set<Word> set = null;
		words.addAll(new TextFile(
				"src/com/mindviewinc/chapter11/sample/collection/SetOperations.java",
				"\\W+"));
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		set = countWords(words);
	}

	private static Set countWords(List<String> words) {
		Set<Word> set = new TreeSet<Word>();
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) != null ? map.get(word) + 1 : 1);
			}
		}
		return null;
	}
}
class Word{
	private String wordName;
	private int wordCount;
	public Word(){
		
	}
	public Word(String wordName, int wordCount) {
		this.wordName = wordName;
		this.wordCount = wordCount;
	}
	
}
