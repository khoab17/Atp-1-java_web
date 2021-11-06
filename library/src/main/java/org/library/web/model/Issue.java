package org.library.web.model;

public class Issue {
	private int issueId;
	private String dateOfIssue;
	private String dateOfReturn;
	private int bookId;
	private int studentId;
	private String status;
	
	public Issue()
	{
		
	}
		
	public Issue(int issueId, String dateOfIssue, String dateOfReturn, int bookId, int studentId) {
		super();
		this.issueId = issueId;
		this.dateOfIssue = dateOfIssue;
		this.dateOfReturn = dateOfReturn;
		this.bookId = bookId;
		this.studentId = studentId;
	}
	
	public Issue(String dateOfIssue, String dateOfReturn, int bookId, int studentId,String status) {
		super();
		this.dateOfIssue = dateOfIssue;
		this.dateOfReturn = dateOfReturn;
		this.bookId = bookId;
		this.studentId = studentId;
		this.status=status;
	}
	
	
	
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getDateOfReturn() {
		return dateOfReturn;
	}
	public void setDateOfReturn(String dateOfReturn) {
		this.dateOfReturn = dateOfReturn;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
