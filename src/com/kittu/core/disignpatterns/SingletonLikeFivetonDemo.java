package com.kittu.core.disignpatterns;

public class SingletonLikeFivetonDemo {

	public static void main(String[] args) {
		
		SingletonLikeFiveton st1 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st2 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st3 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st4 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st5 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st6 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st7 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st8 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st9 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st10 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st11= SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st12 = SingletonLikeFiveton.getInstance();
		SingletonLikeFiveton st13 = SingletonLikeFiveton.getInstance();
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println(st5.hashCode());
		System.out.println();
		System.out.println(st6.hashCode());
		System.out.println(st7.hashCode());
		System.out.println(st8.hashCode());
		System.out.println(st9.hashCode());
		System.out.println(st10.hashCode());
		System.out.println();
		System.out.println(st11.hashCode());
		System.out.println(st12.hashCode());
		System.out.println(st13.hashCode());
		

	}

}
