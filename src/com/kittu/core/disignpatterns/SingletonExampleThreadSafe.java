package com.kittu.core.disignpatterns;

public class SingletonExampleThreadSafe {

	/*
	 * This property is useful to create singleton class in java. Singleton
	 * pattern helps us to keep only one instance of a class at any time. The
	 * purpose of singleton is to control object creation by keeping private
	 * constructor.
	 * 
	 * Singleton pattern restricts the instantiation of a class and ensures that
	 * only one instance of the class exists in the java virtual machine. The
	 * singleton class must provide a global access point to get the instance of
	 * the class. Singleton pattern is used for logging, drivers objects,
	 * caching and thread pool.
	 * 
	 * Singleton is one of the most widely used creational design pattern to
	 * restrict the object creation by applications. In real world applications,
	 * resources like Database connections or Enterprise Information Systems
	 * (EIS) are limited and should be used wisely to avoid any resource crunch.
	 * To achieve this, we can implement Singleton design pattern to create a
	 * wrapper class around the resource and limit the number of object created
	 * at runtime to one.
	 * 
	 */

	private static SingletonExampleThreadSafe instance = null;
	//private static Object mutex = new Object();  // For synchronized block

	//Private constructor
	private SingletonExampleThreadSafe() {

	}

	// synchronized method
	public static synchronized SingletonExampleThreadSafe getInstance() {
		if (instance == null) {
			instance = new SingletonExampleThreadSafe();
		}
		return instance;
	}

	/*
			// synchronized Block
			public static SingletonExampleThreadSafe getInstance() {
				if (instance == null) {
					synchronized (mutex) {
						if (instance == null) {
							instance = new SingletonExampleThreadSafe();
						}
					}
		
				}
				return instance;
			}
 	*/
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
		//return super.clone();
	}
	

	
}
