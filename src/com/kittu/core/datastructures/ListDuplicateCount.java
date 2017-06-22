package com.kittu.core.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDuplicateCount {

	/*
	 * There is an array with every element repeated twice or more times except
	 * one. Find that non-repeated element
	 */

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<>();

		ls.add(2);
		ls.add(2);
		ls.add(2);
		ls.add(3);
		ls.add(3);
		ls.add(3);
		ls.add(3);
		ls.add(3);
		ls.add(5);
		ls.add(5);
		ls.add(4);
		ls.add(4);
		ls.add(4);
		ls.add(1);

		System.out.println();
		System.out.println("Count all with frequency");
		System.out.println("---------------------------");
		Set<Integer> hs = new HashSet<Integer>(ls);
		for (int temp : hs) {
			System.out.println(temp + ": " + Collections.frequency(ls, temp));
			if (Collections.frequency(ls, temp) == 1) {
				System.out.println("Non-repeating element is: " + temp);
				System.out.println();
			}
		}

	}

}
