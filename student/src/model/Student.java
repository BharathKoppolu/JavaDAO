package model;

public class Student {
	
	//Constructor with all the student properties as arguments
	public Student(int id, String name, String stream, String gender, double gpa)
	
	    {
		 this.id=id;
	     this.name = name;
	     this.stream = stream;
	     this.gender = gender;
	     this.gpa=gpa;
	    }

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	private int id;
	private String name;
	private String stream;
	private String gender;
	private double gpa;


}
