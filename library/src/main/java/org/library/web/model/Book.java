package org.library.web.model;

public class Book {
	private int bookId;
	private String title;
	private String publisher;
	private String author;
	private int numberOfCopies;
	private int numberOfAvailableCopies;
	private String category;
	
	public Book()
	{
		
	}
	
	public Book( String title,String publisher, String author, int numberOfCopies,
			int numberOfAvailableCopies,String category) {
		super();
		this.title = title;
		this.author = author;
		this.numberOfCopies = numberOfCopies;
		this.numberOfAvailableCopies = numberOfAvailableCopies;
		this.publisher=publisher;
		this.category=category;
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


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

}
