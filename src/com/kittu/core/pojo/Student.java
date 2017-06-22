package com.kittu.core.pojo;

public class Student {

	private int rollNumber;
	private String name; 

	 public Student(String name, int rollNumber){
	      this.name = name;
	      this.rollNumber = rollNumber;
	   }
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
