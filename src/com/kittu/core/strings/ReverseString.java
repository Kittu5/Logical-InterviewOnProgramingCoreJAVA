package com.kittu.core.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {

		ReverseString rs = new ReverseString();

		// Way-1
		System.out.println(new StringBuilder("hi krishna").reverse().toString());

		// Way-2
		rs.way2();

		// Way-3
		rs.way3();

		// Way-4
		rs.way4();

	}

	public void way2() {
		String input = "AliveisAwesome";
		StringBuilder result = new StringBuilder();
		result.append(input);
		result = result.reverse();
		for (int i = 0; i < result.length(); i++)
			System.out.print(result.charAt(i));
	}

	public void way3() {
		System.out.println();
		String input = "Be in present";
		char[] hello = input.toCharArray();
		List<Character> trial1 = new LinkedList<>();
		for (char c : hello)
			trial1.add(c);
		Collections.reverse(trial1);
		ListIterator<Character> li = trial1.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());
		}
	}

	public void way4() {
		System.out.println();
		String input = "";
		System.out.println("Enter the input string");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
			char[] ch = input.toCharArray();
			for (int i = ch.length - 1; i >= 0; i--)
				System.out.print(ch[i]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
