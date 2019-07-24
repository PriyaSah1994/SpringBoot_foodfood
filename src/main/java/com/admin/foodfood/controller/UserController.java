package com.admin.foodfood.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.admin.foodfood.dto.UserRegistrationRequest;
import com.admin.foodfood.entity.UserEntity;
import com.admin.foodfood.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(value="/saveUsers", method= RequestMethod.POST)
	public Object createUser(@RequestBody UserRegistrationRequest newuser) {
		userservice.save(newuser);
		Map<String, Object> map=new HashMap<>();
		map.put("type", "success");
		map.put("code", 200);
		map.put("message", "user added successfully");
		return map;
		
	}

	@RequestMapping(value="/getalllists")
	public List<UserEntity> getList() {
		return userservice.getAllList();
		
	}	
	
	@RequestMapping(value="/getbycontactnopassword", method=RequestMethod.GET)
	public List<UserEntity> getByContactNoPassword(@RequestParam long contactno, @RequestParam String password ){
		List<UserEntity> list= userservice.getListDetails(contactno,password);
		return list;
		
		
	}
	
	
}
