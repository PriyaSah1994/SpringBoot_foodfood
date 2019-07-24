package com.admin.foodfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.foodfood.dao.RoleDAO;
import com.admin.foodfood.entity.RoleEntity;
import com.admin.foodfood.entity.UserEntity;

@Service
public class RoleService {
	
	@Autowired
	RoleDAO roledao;

	public void save(RoleEntity newrole) {
		// TODO Auto-generated method stub
		roledao.save(newrole);
		
	}
	
	

}
