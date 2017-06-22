package com.kittu.core.disignpatterns;

import java.util.ArrayList;
import java.util.List;

import com.kittu.core.pojo.Student;

public class DAOInterfaceImpl implements DAOInterface {

	// list is working as a database
	List<Student> students;

	public DAOInterfaceImpl() {

		Student student1 = new Student("Robert", 0);
		Student student2 = new Student("John", 1);

		students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNumber) {

		return students.get(rollNumber);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNumber()).setName(student.getName());
		System.out.println(" Update: Roll No " + student.getRollNumber() + ", updated in the database");

	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNumber());
		System.out.println(" Delete: Roll No " + student.getRollNumber() + ", deleted from database");

	}

}
