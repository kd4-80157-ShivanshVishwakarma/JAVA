package com.sunbeam.user;
import java.sql.Date;
import java.util.Scanner;

public class User {
	private int id;
	private String fName;
	private String lName;
	private String eMail;
	private String passWd;
	private Date dob;
	private boolean status;
	private String role;
	Scanner sc = new Scanner(System.in);
	
	
	public User() {
	}

	public User(int id, String fName, String lName, String eMail, String passWd, Date dob, boolean status,
			String role) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.eMail = eMail;
		this.passWd = passWd;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassWd() {
		return passWd;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", eMail=" + eMail + ", passWd=" + passWd
				+ ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}
	
	
	
}
