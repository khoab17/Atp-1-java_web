package org.library.web.model;

public class Request {
	
	private int id;
	private String title;
	private String author;
	private String edition;
	private String note;
	private String status;
	private int studentId;
	
	public Request() {}

	public Request( String title, String author, String edition, String note, String status,int studentId) {
		super();
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.note = note;
		this.status = status;
		this.studentId=studentId;
	}
	
	public Request(int id, String title, String author, String edition, String note, String status,int studentId) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.note = note;
		this.status = status;
		this.studentId=studentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	

}
