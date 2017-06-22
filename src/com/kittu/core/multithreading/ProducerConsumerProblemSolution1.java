package com.kittu.core.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblemSolution1 {
	/*
	 * In computing, the producer–consumer problem (also known as the
	 * bounded-buffer problem) is a classic example of a multi-process
	 * synchronization problem. The problem describes two processes, the
	 * producer and the consumer, which share a common, fixed-size buffer used
	 * as a queue.
	 * 
	 * The producer’s job is to generate data, put it into the buffer, and start
	 * again. At the same time, the consumer is consuming the data (i.e.
	 * removing it from the buffer), one piece at a time. Problem To make sure
	 * that the producer won’t try to add data into the buffer if it’s full and
	 * that the consumer won’t try to remove data from an empty buffer.
	 * 
	 * Solution The producer is to either go to sleep or discard data if the
	 * buffer is full. The next time the consumer removes an item from the
	 * buffer, it notifies the producer, who starts to fill the buffer again. In
	 * the same way, the consumer can go to sleep if it finds the buffer to be
	 * empty. The next time the producer puts data into the buffer, it wakes up
	 * the sleeping consumer. An inadequate solution could result in a deadlock
	 * where both processes are waiting to be awakened.
	 * 
	 */

	public static void main(String[] args) {
		int maxSize = 2;
		System.out.println("How to use wait and notify method in Java");
		System.out.println("Solving Producer Consumper Problem");
		Queue<Integer> queue = new LinkedList<>();

		Thread producer = new Producer(queue, maxSize);
		Thread consumer = new Consumer(queue, maxSize);
		producer.start();
		consumer.start();

	}

}
