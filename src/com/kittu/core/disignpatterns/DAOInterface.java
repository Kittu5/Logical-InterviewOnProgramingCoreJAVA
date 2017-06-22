package com.kittu.core.disignpatterns;

import java.util.List;

import com.kittu.core.pojo.Student;

public interface DAOInterface {

	/*
	 * The Data Access Object (DAO) pattern is now a widely accepted mechanism
	 * to abstract away the details of persistence in an application. The idea
	 * is that instead of having the domain logic communicate directly with the
	 * database, file system, web service, or whatever persistence mechanism
	 * your application uses, the domain logic speaks to a DAO layer instead.
	 * This DAO layer then communicates with the underlying persistence system
	 * or service.
	 * 
	 * The advantage of the DAO layer is that if you need to change the
	 * underlying persistence mechanism you only have to change the DAO layer,
	 * and not all the places in the domain logic where the DAO layer is used
	 * from
	 */

	   public List<Student> getAllStudents();
	   public Student getStudent(int rollNo);
	   public void updateStudent(Student student);
	   public void deleteStudent(Student student);

}
