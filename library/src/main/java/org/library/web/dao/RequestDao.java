package org.library.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.library.web.model.Request;
import org.library.web.model.User;

public class RequestDao {

	public boolean Insert(Request request ) throws ClassNotFoundException
	{
		 try {
			 Connection con = DbConnection.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("insert into request (title,author,edition,note,status,studentId) values(?,?,?,?,?,?);");
			 st.setString(1, request.getTitle());
			 st.setString(2, request.getAuthor());
			 st.setString(3, request.getEdition());
			 st.setString(4, request.getNote());
			 st.setString(5, request.getStatus());
			 st.setInt(6, request.getStudentId());
			 
			 st.executeUpdate(); 		 
			 st.close();
			 con.close();
			 return true;
			 }

		 catch(SQLException e){
			 return false;
		 }

	}
	
	public List<Request> GetRequest()
	{
		try {
			 Connection con = DbConnection.initializeDatabase();
			 Statement st =con.createStatement();
			 ResultSet rs=st.executeQuery("select * from request where status='pending'");
			 List<Request> requests=new ArrayList<Request>();
			 while(rs.next())
			 {
				 Request s=new Request();
				 s.setId(rs.getInt("id"));
				 s.setTitle(rs.getString("title"));
				 s.setAuthor(rs.getString("author"));
				 s.setEdition(rs.getString("edition"));
				 s.setNote(rs.getString("note"));
				 s.setStatus(rs.getString("status"));
				 s.setStudentId(rs.getInt("studentId"));
				 requests.add(s);
			 }
			 con.close();
			 rs.close();
			 st.close();
			 return requests;
		 }
		 catch(Exception e){
			 return null;
		 }
	}
	
	
	public List<Request> GetRequest(int id)
	{
		try {
			 Connection con = DbConnection.initializeDatabase();
			 Statement st =con.createStatement();
			 ResultSet rs=st.executeQuery("select * from request where studentId="+id);
			 List<Request> requests=new ArrayList<Request>();
			 while(rs.next())
			 {
				 Request s=new Request();
				 s.setId(rs.getInt("id"));
				 s.setTitle(rs.getString("title"));
				 s.setAuthor(rs.getString("author"));
				 s.setEdition(rs.getString("edition"));
				 s.setNote(rs.getString("note"));
				 s.setStatus(rs.getString("status"));
				 s.setStudentId(rs.getInt("studentId"));
				 requests.add(s);
			 }
			 con.close();
			 rs.close();
			 st.close();
			 return requests;
		 }
		 catch(Exception e){
			 return null;
		 }
	}
	
	
	
}
