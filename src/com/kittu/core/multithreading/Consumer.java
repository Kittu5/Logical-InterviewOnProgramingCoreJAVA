package com.kittu.core.multithreading;

import java.util.Queue;

public class Consumer extends Thread {

	/*
	 * Consumer Thread will consumer values form shared queue. It will also use
	 * wait() method to wait if queue is empty. It will also use notify method
	 * to send notification to producer thread after consuming values from
	 * queue.
	 */

	private Queue<Integer> queue;
	private int maxSize;

	public Consumer(Queue<Integer> queue, int maxSize) {
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.isEmpty()) {
					System.out.println(
							"Queue is empty, Consumer thread is waiting for producer thread to put something in queue");
					try {
						queue.wait(100);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				System.out.println("Consuming value : " + queue.remove());
				queue.notifyAll();

			}
		}
	}

}
