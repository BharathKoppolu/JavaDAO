package dao;

import java.sql.*;

import java.util.ArrayList;

import java.util.List;

import model.Student;

public class StudentDaoImpl implements StudentDoaInterface {
	
	String url = "jdbc:mysql://localhost:3306/student";
	String uname = "root";
	String pass = "root";
	
	String Insert_Query = "INSERT INTO studentinfo (ID, Name, Stream, Gender, GPA) VALUES" + "(?,?,?,?,?);" ;
	String Select_Query= "SELECT * from studentinfo";
	String Update_Query= "UPDATE studentinfo SET Name = ?, stream= ? where ID= ?;";
	String Delete_Query= "DELETE from studentinfo WHERE ID = ?;";

	public Connection connect() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public void createStudent(Student s) {
		try (Connection con=connect(); PreparedStatement pst = con.prepareStatement(Insert_Query);) { 
			pst.setInt(1, s.getId());
			pst.setString(2, s.getName());
			pst.setString(3, s.getStream());
			pst.setString(4, s.getGender());
			pst.setDouble(5, s.getGpa());
			pst.executeUpdate();
			System.out.println("Student with ID:"+ s.getId() + " created Succcessfully");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getAllStudents() {
		// Step 1: Establishing a Connection
		try (Connection con = connect();
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = con.prepareStatement(Select_Query);) {
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt(1) + "-> " + rs.getString(2) + " " + rs.getString(3) + " "+ rs.getString(4) + " " + rs.getDouble(5));
			}
		System.out.println();
		} catch (Exception e) {
			System.out.println(e);
		}	
	}

	public int updateStudent(int id) {
		int rowUpdated=0;
		try (Connection con=connect(); PreparedStatement pst = con.prepareStatement(Update_Query);) { 
			pst.setString(1, "Nagesh");
			pst.setString(2, "IT");
			pst.setInt(3,id);
			rowUpdated = pst.executeUpdate();
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}
		
	public int removeStudent(int id) {
		int rowDeleted=0;
		try (Connection con = connect();
				PreparedStatement pst = con.prepareStatement(Delete_Query);) {
			pst.setInt(1, id);
			rowDeleted = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}


}
