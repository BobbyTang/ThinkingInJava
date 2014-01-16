package com.mindviewinc.chapter17.exercise;

import java.util.PriorityQueue;
import java.util.Random;

public class Ex11 implements Comparable<Ex11> {
	Integer count;

	@Override
	public int compareTo(Ex11 o) {
		int res = this.count - o.count;
		return res < 0 ? -1 : (res == 0 ? 0 : 1);
	}

	public Ex11(Integer count) {
		this.count = count;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		PriorityQueue<Ex11> pq = new PriorityQueue<Ex11>();
		pq.add(new Ex11(rand.nextInt(100)));
		pq.add(new Ex11(rand.nextInt(100)));
		pq.add(new Ex11(rand.nextInt(100)));
		pq.add(new Ex11(rand.nextInt(100)));

		while (pq.peek() != null) {
			Ex11 ex = pq.poll();
			System.out.println(ex.count);
		}

	}
}
