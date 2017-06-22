package com.kittu.core.datastructures;

import java.util.TreeMap;

public class Logic1ExampleTreeMap {
	
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

	
	
	static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

	static String getData(int key) {
	
		Integer ceiling_key = map.ceilingKey(key);
		Integer floor_key = map.floorKey(key);

		if (ceiling_key == null || floor_key == null)
			return null;

		String value1 = map.get(ceiling_key);
		String value2 = map.get(floor_key);

		if (value1.equals(value2))
			return value1;
		else
			return null;

	}

	public static void main(String[] args) {

		map.put(1, "A");
		map.put(5, "A");
		map.put(7, "B");
		map.put(10, "B");
		map.put(11, "C");
		map.put(15, "C");
		System.out.println();
		System.out.println("...............");
		System.out.println(" Three   : " + getData(3));
		System.out.println(" Four    : " + getData(4));
		System.out.println(" Six     : " + getData(6));
		System.out.println(" Nine    : " + getData(9));
		System.out.println(" Ten     : " + getData(10));
		System.out.println(" Twelve  : " + getData(12));
		System.out.println(" Fifteen : " + getData(15));
		System.out.println("...............");

	}


}
