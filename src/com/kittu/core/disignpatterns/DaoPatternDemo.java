package com.kittu.core.disignpatterns;

import com.kittu.core.pojo.Student;

public class DaoPatternDemo {

	public static void main(String[] args) {
		DAOInterface studentDao = new DAOInterfaceImpl();
		
		System.out.println();
		System.out.println("*********************************************");
		// print all students
		System.out.println(" Students List:");
		for (Student student : studentDao.getAllStudents()) {			
			System.out.println(" [RollNo : " + student.getRollNumber() + ", Name : " + student.getName() + " ]");
		}

		System.out.println("--------------------------------------------");

		// update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		System.out.println(" Student: [RollNo : " + student.getRollNumber() + ", Name : " + student.getName() + " ]");

		System.out.println("--------------------------------------------");

		// get the student
		studentDao.getStudent(0);
		System.out.println(" Get Student: [RollNo : " + student.getRollNumber() + ", Name : " + student.getName() + " ]");

		System.out.println("--------------------------------------------");

		// remove the student
		studentDao.deleteStudent(student);
		System.out.println(" Student: [RollNo : " + student.getRollNumber() + ", Name : " + student.getName() + " ]");
		
		System.out.println();
		System.out.println("*********************************************");
	}

}
