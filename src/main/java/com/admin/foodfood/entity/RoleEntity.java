package com.admin.foodfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class RoleEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="role_id")
	private int roleid;
	
	@Column(name="role_type")
	private String roletype;

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRoletype() {
		return roletype;
	}

	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}
	
	

	
	
	
}
