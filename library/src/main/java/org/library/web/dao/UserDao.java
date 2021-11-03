package org.library.web.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.library.web.model.User;


public class UserDao {
	
	public boolean validateUser(String email,String password) throws ClassNotFoundException, SQLException {
		 try {
			 Connection con = DbConnection.initializeDatabase();
			 Statement st =con.createStatement();
			 ResultSet rs=st.executeQuery("select * from Users Where email='"+email+"' and password='"+password+"'");
			 if(rs.next())
			 {
				 return true;
			 }
			 else return false;
		 }
		 catch(Exception e){
			 return false;
		 }


	}
	
	public List<User> getUsers() {
		try {
			 Connection con = DbConnection.initializeDatabase();
			 Statement st =con.createStatement();
			 ResultSet rs=st.executeQuery("select * from Users");
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
				 users.add(u);
			 }
			 return users;
		 }
		 catch(Exception e){
			 return null;
		 }


	}
}
