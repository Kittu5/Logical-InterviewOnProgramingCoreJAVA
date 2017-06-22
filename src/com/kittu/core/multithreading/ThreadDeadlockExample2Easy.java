package com.kittu.core.multithreading;

public class ThreadDeadlockExample2Easy {

	public static void main(String[] args) {

		// *******************************************************************************
		// Deadlock solution - just interchange lock1 & lock2 in the Thread2
		// run() method.
		// *******************************************************************************

		final Object lock1 = new Object();
		final Object lock2 = new Object();
		// final String lock1 = "Krishna";
		// final String lock2 = "Yadav";

		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (lock1) {
					System.out.println("Thread 1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (lock2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (lock1) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (lock2) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}

}
