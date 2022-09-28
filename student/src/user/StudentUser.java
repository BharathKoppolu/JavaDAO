package user;

import java.util.List;
import model.Student;
import service.StudentService;
import service.StudentServiceInterface;

public class StudentUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(001, "Bharath", "CSE", "male", 8.0);
		Student s2 = new Student(002, "Alice", "EEE", "female", 8.5);
		Student s3 = new Student(003, "Mahesh", "CSE", "male", 7.5);

		StudentServiceInterface stu = new StudentService();
//----------------------------------------------------------Inserting students		
		System.out.println("---Create Operation---");
	    stu.createStudent(s1); 
	    stu.createStudent(s2);
	    stu.createStudent(s3);
	    
//----------------------------------------------------------Listing out all students
	    System.out.println("---Retrieve Operation---");
	    stu.getAllStudents();
	    
//-----------------------------------------------------------Updating student with id=3
	    System.out.println("---Update Operation---");
	  	int up = stu.updateStudent(3);
	  	System.out.println(up + " Row Updated with ID: " + s3.getId()+"\n");
	  	
	  	System.out.println("Table after Updating: ");
	  	stu.getAllStudents();
	  	
//-----------------------------------------------------------Applying removal operation ID=2		
	  	System.out.println("---Delete Operation---");
		int rm = stu.removeStudent(2);
		System.out.println(rm + " Row Deleted with ID: " + s2.getId());
		
		System.out.println("Table after Deleting: ");
		stu.getAllStudents();
	}

}
