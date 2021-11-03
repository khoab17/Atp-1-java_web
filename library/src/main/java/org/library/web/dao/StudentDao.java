package org.library.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.library.web.model.Student;
import org.library.web.model.User;

public class StudentDao {
	
	
	public boolean Insert(Student student ) throws ClassNotFoundException
	{
		 try {
			 Connection con = DbConnection.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("insert into student (fname,lname,gender,dateOfBirth,contact,email) values(?,?,?,?,?,?);");
			 st.setString(1, student.getFname());
			 st.setString(2, student.getLname());
			 st.setString(3, student.getGender());
			 st.setString(4, student.getDateOfBirth());
			 st.setString(6, student.getContact());
			 st.setString(5, student.getEmail());
			 st.executeUpdate(); 
			 
			 st.close();
			 con.close();
			 return true;
			 }

		 catch(SQLException e){
			 return false;
		 }

	}
	
	public List<Student> GetStudents()
	{
		try {
			 Connection con = DbConnection.initializeDatabase();
			 Statement st =con.createStatement();
			 ResultSet rs=st.executeQuery("select * from student");
			 List<Student> students=new ArrayList<Student>();
			 while(rs.next())
			 {
				 Student s=new Student();
				 s.setStudentId(rs.getInt("studentId"));
				 s.setFname(rs.getString("fname"));
				 s.setLname(rs.getString("lname"));
				 s.setDateOfBirth(rs.getString("dateOfBirth"));
				 s.setEmail(rs.getString("email"));
				 s.setGender(rs.getString("gender"));
				 s.setContact(rs.getString("contact"));
				 students.add(s);
			 }
			 con.close();
			 rs.close();
			 st.close();
			 return students;
		 }
		 catch(Exception e){
			 return null;
		 }
	}
	
	
	public void Update(Student student) {
		
	}
	
	public void Delete(Student student) {
			
		}
	
	
}
