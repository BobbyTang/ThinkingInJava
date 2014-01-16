package com.mindviewinc.chapter11.exercise;

import java.util.PriorityQueue;
import java.util.Random;

public class Ex28 {
	public static void main(String[] args) {
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		Random random = new Random(47);
		for (int i = 0; i < 10; i++) {
			Double tmp = random.nextDouble();
			pq.offer(tmp);
			System.out.print("  " + tmp);
		}
		
		System.out.println();
		
		while(pq.peek() != null)
			System.out.print(pq.poll() + " ");
		
		
	}
}
