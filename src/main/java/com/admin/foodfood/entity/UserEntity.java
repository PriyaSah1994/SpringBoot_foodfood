package com.admin.foodfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userid;
	
	@Column(name="user_firstname")
	private String userfirstname;
	
	@Column(name="user_lastname")
	private String userlastname;
	
	@Column(name="user_contactno")
	private long usercontactno;
	
	@Column(name="user_gender")
	private String usergender;
	
	@Column(name="user_address")
	private String useraddress;
	
	@Column(name="user_password")
	private String userpassword;
	
	@OneToOne
	@JoinColumn(name="role_id")
	private RoleEntity roleid;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

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

	public RoleEntity getRoleid() {
		return roleid;
	}

	public void setRoleid(RoleEntity roleid) {
		this.roleid = roleid;
	}

	
	
	
	
	
	

}
