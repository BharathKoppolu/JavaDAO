package dao;

import java.util.List;

import model.Student; 

public interface StudentDoaInterface {
	public void createStudent(Student s); //Insert student
	public void getAllStudents(); // Retrieve all students
	public int removeStudent(int id); // Remove Student
	public int updateStudent(int id); // Update Student

}
