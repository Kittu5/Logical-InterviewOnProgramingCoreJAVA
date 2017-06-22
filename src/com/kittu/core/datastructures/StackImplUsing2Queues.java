package com.kittu.core.datastructures;

import java.util.LinkedList;
import java.util.Queue;
public class StackImplUsing2Queues {
	
	//Java Program to Implement Stack using Two Queues --- Stack: FIFO & Queue : LIFO
	
	/*  ALGARITHM
	
	Create two queues : 'q' and 'tmp' as in the program given below
	For push operation :
	    if size of q = 0 then
	        enqueue value into q
	    else
	        dequeue all elements from q to tmp
	        enqueue value into q
	        dequeue all elements from tmp to q
	 
	For pop operation :
	    if size of q = 0 then
	        throw 'underflow' exception
	    else 
	        return front element of q
	        		
	*/        
		
	
	Queue<Integer> queue1;
	Queue<Integer> queue2;

	StackImplUsing2Queues() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}

	// Remove value from the beginning of the list for demonstrating behaviour
	// of stack
	public void push(int entry) {
		if (queue1.size() == 0){
			queue1.add(entry);
		}
		else {
			int sizeOfQueue1 = queue1.size();
			// Copy elements of Queue1 to Queue2
			for (int i = 0; i < sizeOfQueue1; i++)
				queue2.add(queue1.remove());
			queue1.add(entry);
			// Copy elements for Queue2 to Queue1
			for (int j = 0; j < sizeOfQueue1; j++)
				queue1.add(queue2.remove());
		}
	}

	public int pop() {
		if (queue1.size() == 0)
			throw new QueueEmptyException("Queue is Empty. It is an Underflow Exception");
		return queue1.remove();
	}

	public static void main(String[] args) {
		StackImplUsing2Queues stack = new StackImplUsing2Queues();
		stack.push(20);
		stack.push(30);
		System.out.println("Removed element : " + stack.pop());
		stack.push(40);
		System.out.println("Removed element : " + stack.pop());
		System.out.println("Removed element : " + stack.pop());
		//System.out.println("Removed element : " + stack.pop());  // Throws: QueueEmptyException
	}
}

/**
 * Exception to indicate that Queue is empty.
 */

class QueueEmptyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public QueueEmptyException() {
		super();
	}

	public QueueEmptyException(String message) {
		super(message);
	}
}
	
	
	
