package com.sainath.java.examples.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExam {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.sort(null);
		int i = list.get(0);
		for (Integer integer : list) {
			System.out.println(integer);
			list.remove(integer);
		}
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		
		
		
	}
}
