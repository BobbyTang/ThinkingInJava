package com.mindviewinc.chapter17.exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class SList<T> {
	Link<T> header = new Link<T>(null, null);

	public SList() {
		header.next = header;//
	}

	public SListIterator<T> iterator() {
		return new SListIteratorImpl();
	}

	private class Link<T> {
		T t;
		Link<T> next;

		public Link(Link<T> next) {
			this(null, next);
		}

		public Link(T t, Link<T> next) {
			this.t = t;
			this.next = next;
		}
	}
	
	private class SListIteratorImpl implements SListIterator<T> {
		Link<T> lastReturn = header;
		Link<T> next;

		public SListIteratorImpl() {
			next = header.next;
		}

		public boolean hasNext() {
			return next != header;
		}

		public T next() {
			if (next == header)
				throw new NoSuchElementException();
			lastReturn = next;
			next = next.next;
			return lastReturn.t;
		}

		public void insert(T t) {
			lastReturn = header;// 最后让最近一次操作指向lastReturned位置复原，即指向头，固添加后不能马上进行删除与修改操作
			Link<T> newLink = new Link<T>(t, next);

			if (header.next == header) // Empty list
				header.next = newLink;
			else {
				// Find an element before the one pointed by 'next'
				for (Link<T> curr = header;; curr = curr.next)
					if (curr.next == next) {
						curr.next = newLink;
						break;
					}
			}

		}

		public void remove(T t) {
			
		}

	}
}

interface SListIterator<T> {
	boolean hasNext();

	T next();

	void insert(T t);

	void remove(T t);
}
