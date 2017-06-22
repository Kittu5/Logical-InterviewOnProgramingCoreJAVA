package com.kittu.core.multithreading;

public class ThreadDeadLockExample1 {

	public static void main(String[] args) {
		Thread1 T1 = new Thread1();
		Thread2 T2 = new Thread2();
		T1.start();
		T2.start();

	}

}
