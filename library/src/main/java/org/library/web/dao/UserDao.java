package org.library.web.dao;


import java.sql.Connection;
import org.library.web.dao.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		return null;
	}
}
