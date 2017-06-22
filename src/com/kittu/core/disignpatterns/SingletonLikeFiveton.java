package com.kittu.core.disignpatterns;

public class SingletonLikeFiveton {

	/*
	 * Singleton will create only 1 instance and it will share to all
	 * request/class. Like Singleton, Fiveton also create max 5 instances for
	 * request/class. And these 5 instances will share by Round-Rabin method.
	 */

	private static final SingletonLikeFiveton[] instance = new SingletonLikeFiveton[5];
	private static int index = 0;
	

	private SingletonLikeFiveton() {
		// Private Construtor
	}

	public static SingletonLikeFiveton getInstance() {
		if (instance[index] == null) {
			instance[index] = new SingletonLikeFiveton();
		}
		SingletonLikeFiveton fiveton = instance[index];
		index = (index + 1) % instance.length;
		return fiveton;
	}
}
