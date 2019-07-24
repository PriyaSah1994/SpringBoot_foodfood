package com.admin.foodfood.dto;

import javax.persistence.Column;

public class UserRegistrationRequest {

	
	private String userfirstname;
	
	private String userlastname;
	
	
	private long usercontactno;
	
	
	private String usergender;
	
	
	private String useraddress;
	
	
	private String userpassword;


	public String getUserfirstname() {
		return userfirstname;
	}


	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}


	public String getUserlastname() {
		return userlastname;
	}


	public void setUserlastname(String userlastname) {
		this.userlastname = userlastname;
	}


	public long getUsercontactno() {
		return usercontactno;
	}


	public void setUsercontactno(long usercontactno) {
		this.usercontactno = usercontactno;
	}


	public String getUsergender() {
		return usergender;
	}


	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}


	public String getUseraddress() {
		return useraddress;
	}


	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}


	public String getUserpassword() {
		return userpassword;
	}


	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	
	
}
