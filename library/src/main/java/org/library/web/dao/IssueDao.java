package org.library.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.library.web.model.Issue;
import org.library.web.model.Student;

public class IssueDao {
	
	public IssueDao() {}
	
	public boolean Insert(Issue issue ) throws ClassNotFoundException
	{
		 try { 
			 System.out.println(issue.getBookId()+"Book Id");
			 Connection connection = DbConnection.initializeDatabase();
			 Statement statement=connection.createStatement();
			 ResultSet rs=statement.executeQuery("SELECT numberOfAvailableCopies FROM book where bookId="+issue.getBookId());
			
			 while(rs.next())
			 {
				 System.out.println("Available Copies"+rs.getInt("numberOfAvailableCopies"));
				 
				 int c=rs.getInt("numberOfAvailableCopies");
				 if(c>0)
				 {			
					 System.out.println(issue.getBookId()+"Book Id");

					 String sql="UPDATE book SET numberOfAvailableCopies =? WHERE (bookId =?);";
					 PreparedStatement spt=connection.prepareStatement(sql);
					 spt.setInt(1, c-1);
				     spt.setInt(2,issue.getBookId());
				     
				     spt.executeUpdate();
				     //System.out.println("Flag:"+flag);
				     connection.close();
				     spt.close();
				     rs.close();
				     
				     boolean flag=AddIssue(issue);
				     if(flag)
				     {
				    	 return true;
				     }
				     else {return false;}
					
				 }
			 }
			 
			 return false;
		 }


		 catch(SQLException e){
			 return false;
		 }

	}
	
	
	public boolean AddIssue(Issue issue) throws ClassNotFoundException
	{

		try {
			 Connection con = DbConnection.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("insert into issue (dateOfIssue,dateOfReturn,bookId,studentId) values(?,?,?,?);");
			 st.setString(1, issue.getDateOfIssue());
			 st.setString(2, issue.getDateOfReturn());
			 st.setInt(3, issue.getBookId());
			 st.setInt(4, issue.getStudentId());
			 st.executeUpdate(); 			 
			 st.close();
			 con.close();
			 System.out.println("Runnig");
			 return true;
			 }

		 catch(SQLException e){
			 return false;
		 }
		
	}
	
	
	
	public List<Issue> GetIssues(){
		try {
			 Connection con = DbConnection.initializeDatabase();
			 Statement st =con.createStatement();
			 ResultSet rs=st.executeQuery("select * from issue;");
			 List<Issue> issues=new ArrayList<Issue>();
			 while(rs.next())
			 {
				 Issue i=new Issue();
				 i.setIssueId(rs.getInt("issueId"));
				 i.setDateOfIssue(rs.getString("dateOfIssue"));
				 i.setDateOfReturn(rs.getString("dateOfReturn"));
				 i.setBookId(rs.getInt("bookId"));
				 i.setStudentId(rs.getInt("studentId"));
				 issues.add(i);
			 }
			 con.close();
			 rs.close();
			 st.close();
			 return issues;
		 }
		 catch(Exception e){
			 return null;
		 }
	}

}
