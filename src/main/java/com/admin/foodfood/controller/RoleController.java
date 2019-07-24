package com.admin.foodfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.admin.foodfood.entity.RoleEntity;
import com.admin.foodfood.entity.UserEntity;
import com.admin.foodfood.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	RoleService roleservice;
	
	@RequestMapping(value="/saveRoles", method= RequestMethod.POST)
	public RoleEntity createUser(@RequestBody RoleEntity newrole) {
		roleservice.save(newrole);
		return newrole;
		
	}

}
