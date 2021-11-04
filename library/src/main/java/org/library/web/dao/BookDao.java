package org.library.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.library.web.model.Book;

public class BookDao {
	
	public boolean Insert(Book book ) throws ClassNotFoundException
	{
		try {
			 Connection con = DbConnection.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("insert into book (title,publisher,author,numberOfCopies,numberOfAvailableCopies,category) values(?,?,?,?,?,?);");
			 st.setString(1, book.getTitle());
			 st.setString(2, book.getPublisher());
			 st.setString(3, book.getAuthor());
			 st.setInt(4, book.getNumberOfCopies());
			 st.setInt(5, book.getNumberOfAvailableCopies());
			 st.setString(6, book.getCategory());
			 st.executeUpdate(); 
			 
			 st.close();
			 con.close();
			 return true;
			 }

		 catch(SQLException e){
			 return false;
		 }

	}
	
	public Book GetBook(int id)  {
		try {
		Connection con=DbConnection.initializeDatabase();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from book where bookId="+id);
		Book b=new Book();
		 while(rs.next())
		 {
			 b.setBookId(rs.getInt("bookId"));
			 b.setTitle(rs.getString("title"));
			 b.setAuthor(rs.getString("author"));
			 b.setPublisher(rs.getString("publisher"));
			 b.setNumberOfCopies(rs.getInt("numberOfCopies"));
			 b.setNumberOfAvailableCopies(rs.getInt("numberOfAvailableCopies"));
			 b.setCategory(rs.getString("category"));
		 }
		 return b;
	 }
	 catch(Exception e){
		 return null;
	
	 }
	}
	
	public List<Book> GetBooks()  {
		try {
		Connection con=DbConnection.initializeDatabase();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from book");
		List<Book> books=new ArrayList<Book>();
		 while(rs.next())
		 {
			 Book b=new Book();
			 b.setBookId(rs.getInt("bookId"));
			 b.setTitle(rs.getString("title"));
			 b.setAuthor(rs.getString("author"));
			 b.setNumberOfCopies(rs.getInt("numberOfCopies"));
			 b.setNumberOfAvailableCopies(rs.getInt("numberOfAvailableCopies"));
			 b.setCategory(rs.getString("category"));
			 books.add(b);
		 }
		 return books;
	 }
	 catch(Exception e){
		 return null;
	
	 }
	}
	
	
	public boolean Update(Book book ) throws ClassNotFoundException
	{
		try {
			 Connection con = DbConnection.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("update  book set title=?,publisher=?,author=?,numberOfCopies=?,numberOfAvailableCopies=?,category=? where bookId="+book.getBookId());
			 st.setString(1, book.getTitle());
			 st.setString(2, book.getPublisher());
			 st.setString(3, book.getAuthor());
			 st.setInt(4, book.getNumberOfCopies());
			 st.setInt(5, book.getNumberOfAvailableCopies());
			 st.setString(6, book.getCategory());
			 st.executeUpdate(); 
			 
			 st.close();
			 con.close();
			 return true;
			 }

		 catch(SQLException e){
			 return false;
		 }

	}
	
	public boolean Delete(int id) throws ClassNotFoundException, SQLException {
		
		Connection con = DbConnection.initializeDatabase();
		PreparedStatement st = con.prepareStatement("delete  from book where bookId="+id);
		try{
			st.executeUpdate();
			st.close();
			con.close();
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	
}

