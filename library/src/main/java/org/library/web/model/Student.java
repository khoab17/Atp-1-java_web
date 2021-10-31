package org.library.web.model;

public class Student {
	
	private int studetnId;
	private String fname;
	private String lname;
	private String gender;
	private String dateOfBirth;
	private String email;
	private String password;
	
	public Student() {
		
	}
	
	public Student(int studetnId, String fname, String lname, String gender, String dateOfBirth, String email,
			String password) {
		super();
		this.studetnId = studetnId;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
	}
	
	public int getStudetnId() {
		return studetnId;
	}
	public void setStudetnId(int studetnId) {
		this.studetnId = studetnId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
