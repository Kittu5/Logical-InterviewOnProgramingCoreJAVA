package com.kittu.core.datastructures;

public class MyStackExample {

	int stackSize;
	int[] staArr;
	int top;

	MyStackExample(int size) {
		this.stackSize = size;
		this.staArr = new int[stackSize];
		this.top = -1;
	}

	public void push(int entry) throws Exception {
		if (isStackFull()) {
			throw new Exception("Stack is Full. We can't add the element ");
		}
		System.out.println("Adding element    : " + entry);
		staArr[++top] = entry;

	}

	public int pop() throws Exception {

		if (isStackEmpty()) {
			throw new Exception("Stack is Empty. We can't remove an element ");
		}

		int entry = staArr[top--];
		System.out.println("Removing element  : " + entry);
		return entry;
	}

	public int peek() {
		System.out.println("Top/Peek element  : " + staArr[top]);
		return staArr[top];
	}

	public boolean isStackFull() {
		return (top == stackSize - 1);
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	public static void main(String... args) throws Exception {
		MyStackExample ms = new MyStackExample(5);
		System.out.println();
		System.out.println(".....................");
		ms.push(0);
		ms.push(1);
		ms.push(2);
		ms.pop();
		ms.push(3);
		ms.push(4);
		ms.push(5);
		//ms.push(6);	// throws exception stack is full.	
		ms.pop();
		ms.push(7);
		ms.peek();
		System.out.println(".....................");

	}

}
