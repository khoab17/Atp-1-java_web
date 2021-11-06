package org.library.web.model;

public class User {
	
    private int userId;
    private String fname;
    private String lname;
    private String gender;
    private String dateOfBirth;
    private String contact;
    private String email;
    private String password;
    private String role;
    
    public User() {}
    
	public User(String fname, String lname, String gender, String dateOfBirth, String contact, String email,
			String password,String role) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.contact = contact;
		this.email = email;
		this.password = password;
		this.role=role;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
    


}
