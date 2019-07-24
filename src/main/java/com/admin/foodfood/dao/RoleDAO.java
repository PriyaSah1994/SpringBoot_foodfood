package com.admin.foodfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.foodfood.entity.RoleEntity;


public interface RoleDAO extends JpaRepository<RoleEntity, Integer>{
	
	RoleEntity findByRoleid(int roleid);

}
