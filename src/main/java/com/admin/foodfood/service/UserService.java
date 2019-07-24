package com.admin.foodfood.service;

import static org.springframework.test.web.client.response.MockRestResponseCreators.withUnauthorizedRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.foodfood.dao.RoleDAO;
import com.admin.foodfood.dao.UserDAO;
import com.admin.foodfood.dto.UserRegistrationRequest;
import com.admin.foodfood.entity.RoleEntity;
import com.admin.foodfood.entity.UserEntity;

@Service
public class UserService {

	@Autowired
	UserDAO userdao;
	@Autowired
	RoleDAO roledao;
	
	public void save(UserRegistrationRequest userrequest) {
		// TODO Auto-generated method stub
		RoleEntity role=roledao.findByRoleid(2);
		UserEntity userentity=new UserEntity();
		userentity.setRoleid(role);
		userentity.setUserfirstname(userrequest.getUserfirstname());
		userentity.setUserlastname(userrequest.getUserlastname());
		userentity.setUseraddress(userrequest.getUseraddress());
		userentity.setUsercontactno(userrequest.getUsercontactno());
		userentity.setUsergender(userrequest.getUsergender());
		userentity.setUserpassword(userrequest.getUserpassword());
		userdao.save(userentity);
	}

	public List<UserEntity> getAllList() {
		List list= userdao.findAll();
		return list;
		
	}

	public List<UserEntity> getListDetails(long contactno, String password) {
		// TODO Auto-generated method stub
		return userdao.findByContactNoPassword(contactno,password);
	}

}
