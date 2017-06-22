package com.kittu.core.datastructures;

import java.util.NavigableMap;
import java.util.TreeMap;

import com.sun.java_cup.internal.runtime.Scanner;

public class Logic1ExampleConcurrentNavigableMap {
	
	
	/*	
	Which data structure is efficient for key-value pair?

			Key           value
			1-5           A
			7-10          B
			11-15         C
			
	If 	input is 4 then output is A, 
		input is 8 then output is B and so on.
		
	Which data structure i can use to store the following data so that you should not store values multiple times.

	HashMap is not efficient one.
			
			
	*/	
	

	public static NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
	static {
		map.put(1, "A");   // 1..5 => A
		map.put(5, "A");  // 6 => empty
		map.put(4, "B");   // 7..10 => B
		map.put(11, "C");  // 11..15 => C
		map.put(16, null); // 16.. => empty
	}

	public static void main(String[] args) {

		System.out.println(".................");
		System.out.println(" 2 value  : " + map.floorEntry(2).getValue());
		System.out.println(" 4 value  : " + map.floorEntry(4).getValue());
		System.out.println(" 5 value  : " + map.floorEntry(5).getValue());
		System.out.println(" 6 value  : " + map.floorEntry(6).getValue());
		System.out.println(" 8 value  : " + map.floorEntry(8).getValue());
		System.out.println(" 10 value : " + map.floorEntry(10).getValue());
		System.out.println(" 13 value : " + map.floorEntry(13).getValue());
		System.out.println(" 15 value : " + map.floorEntry(15).getValue());
		System.out.println(" 16 value : " + map.floorEntry(16).getValue());
		System.out.println(" 17 value : " + map.floorEntry(16).getValue());
		
		System.out.println("---------------------------");
		
		/*	
		System.out.println(" 16 value : " + map.ceilingKey(5).getInteger("A"));
		System.out.println(map.floorKey(9));
		System.out.println(map.ceilingEntry(1).getValue());
		System.out.println(map.ceilingEntry(4).getValue());
		System.out.println(map.ceilingEntry(6).getValue());
		System.out.println(map.ceilingEntry(8).getValue());
		System.out.println(map.ceilingEntry(15).getValue());
		System.out.println(map.ceilingEntry(15).getKey());
		*/
		
		System.out.println(".................");
		
		

	}

}
