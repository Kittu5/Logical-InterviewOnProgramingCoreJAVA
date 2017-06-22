package com.kittu.core.datastructures;

public class MissingNumberInArray1to100 {

	/*
	 * We can also below logic to find the missing number in integer array of 1
	 * to 100
	 * 
	 * Now we are working for n=8
	 */

	// Method to calculate sum of 'n' numbers
	static int sumOfNnumbers(int n) {
		int sum = (n * (n + 1)) / 2;

		return sum;
	}

	// Method to calculate sum of all elements of array
	static int sumOfElements(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		return sum;
	}

	public static void main(String[] args) {

		int n = 8;

		int[] a = { 1, 4, 7, 3, 2, 8, 6 };

		// Step 1
		int sumOfNnumbers = sumOfNnumbers(n);

		// Step 2
		int sumOfElements = sumOfElements(a);

		// Step 3
		int missingNumber = sumOfNnumbers - sumOfElements;

		System.out.println("Missing Number is = " + missingNumber);

	}

}
