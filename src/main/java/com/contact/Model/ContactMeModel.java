package com.contact.Model;

public class ContactMeModel {

	public String id;
	public String fname;
	public String lname;
	public String contact;
	public String message;

	ContactMeModel() {

	}

	ContactMeModel(String fname, String lname, String contact, String message) {
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return getFname() + " :" + getLname() + ":" + getFname() + ":" + getContact();

	}

}