package service;

import java.util.List;


import dao.StudentDaoImpl;
import dao.StudentDoaInterface;
import model.Student;


public class StudentService implements StudentServiceInterface {
	StudentDaoImpl sDao = new StudentDaoImpl();

	public void createStudent(Student s) {
		sDao.createStudent(s);
	}

	public void getAllStudents() {
		sDao.getAllStudents();
	}

	public int updateStudent(int id) {
		return sDao.updateStudent(id);
	}
	
	public int removeStudent(int id) {
		return sDao.removeStudent(id);
	}



}
