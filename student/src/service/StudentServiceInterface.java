package service;

import java.util.List;

import model.Student;

public interface StudentServiceInterface {

	public void createStudent(Student s);
	public void getAllStudents();
	public int removeStudent(int id);
	public int updateStudent(int id);
}
