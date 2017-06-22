package com.kittu.core.disignpatterns;

public class SingletonDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Test hash code for different singleton object

		SingletonExampleThreadSafe st1 = SingletonExampleThreadSafe.getInstance();
		System.out.println("st1: " + st1.hashCode());

		SingletonExampleThreadSafe st2 = SingletonExampleThreadSafe.getInstance();
		System.out.println("st2: " + st2.hashCode());

		// clone
		SingletonExampleThreadSafe st4 = (SingletonExampleThreadSafe) st1.clone();
		System.out.println("st4: " + st4.hashCode());

	}

}
