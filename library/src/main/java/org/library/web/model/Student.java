package org.library.web.model;

public class Student {
	
	private int studentId;
	private String fname;
	private String lname;
	private String gender;
	private String dateOfBirth;
	private String email;
	private String contact;
	
	public Student() {
		
	}
	
	public Student(String fname, String lname, String gender, String dateOfBirth, String email, String contact) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.contact=contact;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
}
