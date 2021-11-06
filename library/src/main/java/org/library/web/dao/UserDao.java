package org.library.web.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.library.web.model.User;


public class UserDao {
	
	public User validateUser(String email,String password) throws ClassNotFoundException, SQLException {
		 try {
			 Connection con = DbConnection.initializeDatabase();
			 Statement st =con.createStatement();
			 ResultSet rs=st.executeQuery("select * from Users Where email='"+email+"' and password='"+password+"'");
			 if(rs.next())
			 {
				 //System.out.println(rs.getString("role"));
				 User u=new User();
				 u.setUserId(rs.getInt("userId"));
				 u.setFname(rs.getString("fname"));
				 u.setLname(rs.getString("lname"));
				 u.setGender(rs.getString("gender"));
				 u.setDateOfBirth(rs.getString("dateOfBirth")); 
				 u.setContact(rs.getString("contact"));
				 u.setEmail(rs.getString("email"));
				 u.setPassword(rs.getString("password"));
				 u.setRole(rs.getString("role"));
				 
				 return u;
				 
			 }
			 else {return null;}
		 }
		 catch(Exception e){
			 return null;
		 }


	}
	
	public boolean Insert(User user ) throws ClassNotFoundException
	{
		 try {
			 Connection con = DbConnection.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("insert into users (fname,lname,gender,dateOfBirth,contact,email,password,role) values(?,?,?,?,?,?,?,?);");
			 st.setString(1, user.getFname());
			 st.setString(2, user.getLname());
			 st.setString(3, user.getGender());
			 st.setString(4, user.getDateOfBirth());
			 st.setString(5, user.getContact());
			 st.setString(6, user.getEmail());
			 st.setString(7, user.getPassword());
			 st.setString(8, user.getRole());
			 
			 st.executeUpdate(); 
			 
			 st.close();
			 con.close();
			 return true;
			 }

		 catch(SQLException e){
			 return false;
		 }

	}
	
	public List<User> getUsers() {
		try {
			 Connection con = DbConnection.initializeDatabase();
			 Statement st =con.createStatement();
			 ResultSet rs=st.executeQuery("select * from Users where role='admin'");
			 List<User> users=new ArrayList<User>();
			 while(rs.next())
			 {
				 User u=new User();
				 u.setUserId(rs.getInt("userId"));
				 u.setFname(rs.getString("fname"));
				 u.setLname(rs.getString("lname"));
				 u.setGender(rs.getString("gender"));
				 u.setDateOfBirth(rs.getString("dateOfBirth")); 
				 u.setContact(rs.getString("contact"));
				 u.setEmail(rs.getString("email"));
				 u.setPassword(rs.getString("password"));
				 u.setRole(rs.getString("role"));
				 users.add(u);
			 }
			 st.close();
			 con.close();
			 return users;
		 }
		 catch(Exception e){
			 return null;
		 }


	}
}
