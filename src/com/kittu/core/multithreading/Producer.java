package com.kittu.core.multithreading;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {

	/*
	 * Producer Thread will keep producing values for Consumer to consumer. It
	 * will use wait() method when Queue is full and use notify() method to send
	 * notification to Consumer Thread.
	 * 
	 */

	private Queue<Integer> queue;
	private int maxSize;

	public Producer(Queue<Integer> queue, int maxSize) {
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.size() == maxSize) {
					try {
						System.out.println(
								"Queue is full, Producer thread waiting for consumer to take something from queue");
						queue.wait(100);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				Random random = new Random();
				int i = random.nextInt();
				System.out.println("Producing value : " + i);
				queue.add(i);
				queue.notifyAll();
			}
		}
	}
}
