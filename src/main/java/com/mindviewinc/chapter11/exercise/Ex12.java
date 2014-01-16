package com.mindviewinc.chapter11.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Ex12 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3,4,5,6,7));
		ListIterator<Integer> listIter = list1.listIterator(list1.size());//返回列表中元素的列表迭代器（按适当顺序），从列表的指定位置开始。
		List<Integer> list2 = new ArrayList<Integer>();
		while(listIter.hasPrevious()){
			list2.add(listIter.previous());
		}
		
		for (Integer integer : list2) {
			System.out.println(integer);
		}
		
	}
}
