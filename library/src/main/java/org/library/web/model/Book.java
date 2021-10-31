package org.library.web.model;

public class Book {
	private int bookId;
	private String title;
	private String name;
	private String author;
	private int serial;
	private int numberOfCopies;
	private int numberOfAvailableCopies;
	
	public Book()
	{
		
	}
	
	public Book(int bookId, String title, String name, String author, int serial, int numberOfCopies,
			int numberOfAvailableCopies) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.name = name;
		this.author = author;
		this.serial = serial;
		this.numberOfCopies = numberOfCopies;
		this.numberOfAvailableCopies = numberOfAvailableCopies;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getSerial() {
		return serial;
	}


	public void setSerial(int serial) {
		this.serial = serial;
	}


	public int getNumberOfCopies() {
		return numberOfCopies;
	}


	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}


	public int getNumberOfAvailableCopies() {
		return numberOfAvailableCopies;
	}


	public void setNumberOfAvailableCopies(int numberOfAvailableCopies) {
		this.numberOfAvailableCopies = numberOfAvailableCopies;
	}
	

}
