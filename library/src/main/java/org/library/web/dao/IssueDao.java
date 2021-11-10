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
			 PreparedStatement st = con.prepareStatement("insert into issue (dateOfIssue,dateOfReturn,bookId,studentId,status) values(?,?,?,?,?);");
			 st.setString(1, issue.getDateOfIssue());
			 st.setString(2, issue.getDateOfReturn());
			 st.setInt(3, issue.getBookId());
			 st.setInt(4, issue.getStudentId());
			 st.setString(5, issue.getStatus());
			 st.executeUpdate(); 			 
			 st.close();
			 con.close();
			// System.out.println("Runnig");
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
				 i.setStatus(rs.getString("status"));
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
	
	public List<Issue> GetIssuesPending(){
		try {
			 Connection con = DbConnection.initializeDatabase();
			 Statement st =con.createStatement();
			 ResultSet rs=st.executeQuery("select * from issue where status='pending';");
			 List<Issue> issues=new ArrayList<Issue>();
			 while(rs.next())
			 {
				 Issue i=new Issue();
				 i.setIssueId(rs.getInt("issueId"));
				 i.setDateOfIssue(rs.getString("dateOfIssue"));
				 i.setDateOfReturn(rs.getString("dateOfReturn"));
				 i.setBookId(rs.getInt("bookId"));
				 i.setStudentId(rs.getInt("studentId"));
				 i.setStatus(rs.getString("status"));
				 i.setFine(rs.getDouble("fine"));
				 i.setComment(rs.getString("comment"));
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
	
	
	
	public List<Issue> GetIssues(int id){
		try {
			 Connection con = DbConnection.initializeDatabase();
			 Statement st =con.createStatement();
			 ResultSet rs=st.executeQuery("select * from issue where studentId="+id+" and (status='pending' or status='borrowed')");
			 List<Issue> issues=new ArrayList<Issue>();
			 while(rs.next())
			 {
				 Issue i=new Issue();
				 i.setIssueId(rs.getInt("issueId"));
				 i.setDateOfIssue(rs.getString("dateOfIssue"));
				 i.setDateOfReturn(rs.getString("dateOfReturn"));
				 i.setBookId(rs.getInt("bookId"));
				 i.setStudentId(rs.getInt("studentId"));
				 i.setStatus(rs.getString("status"));
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
	
	
	public boolean UpdateReturnStatus(int id,String status ) throws ClassNotFoundException
	{
		try {
			 Connection con = DbConnection.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("update  issue set status=? where issueId="+id);
			 st.setString(1,status);
			 st.executeUpdate(); 
			 
			 st.close();
			 con.close();
			 return true;
			 }

		 catch(SQLException e){
			 return false;
		 }

	}
	
	//========================================Add Fine
	
	public boolean AddFine(int id,int fine, String comment)
	{
	
		//System.out.print(id+" ......"+fine+" ........"+comment);
		try {
			System.out.print(id+" ......"+fine+" ........"+comment);
			Connection con = DbConnection.initializeDatabase();
			PreparedStatement st=con.prepareStatement("update issue set fine=?, comment=? where issueId=?");
			st.setInt(1,fine);
			st.setString(2,comment);
			st.setInt(3,id);
			st.executeUpdate(); 
			con.close();
			st.close();
			
			UpdateReturnStatus(id);
			return true;
		}
		catch(Exception e){return false;}
	}
	
	public boolean UpdateReturnStatus(int id ) throws ClassNotFoundException
	{
		try {
			 Connection con = DbConnection.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("update  issue set status=? where issueId="+id);
			 st.setString(1,"approved");
			 st.executeUpdate();
			 //System.out.print("Hitting");
			 int bookId=0;
			 int count=0;
			 Statement stt=con.createStatement();
			 ResultSet rs=stt.executeQuery("select * from issue where issueId="+id);
			 while(rs.next())
			 {
				 bookId=rs.getInt("bookId");
			 }
			 System.out.print("Hitting"+bookId);
			 
			 ResultSet result=stt.executeQuery("select * from book where bookId="+bookId);
			 
			 while (result.next())
			 {
				 count=result.getInt("numberOfAvailableCopies");
			 }
			 
			 //System.out.println("HittingLaST BOOK ID"+bookId+"  Number Of Copies"+count );
			 stt.close();
			 
			ReturnBook(bookId,count);
			 
			
			 st.close();
			 con.close();
			 
			 
			 return true;
			 }

		 catch(SQLException e){
			 return false;
		 }

	}
	
	
	public void ReturnBook(int id,int availableCopies)
	{
		try {
			
		//System.out.print("Calling last func");
		 Connection con = DbConnection.initializeDatabase();
		 PreparedStatement st = con.prepareStatement("update  book set numberOfAvailableCopies=? where bookId=?");
		 st.setInt(1,availableCopies+1);
		 st.setInt(2,id);
		 st.executeUpdate(); 
		 con.close();
		 st.close();
		}
		catch(Exception e) {}
		
	}

}
