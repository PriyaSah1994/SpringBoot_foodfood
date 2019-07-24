package com.admin.foodfood.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.admin.foodfood.entity.UserEntity;
import com.admin.foodfood.service.UserService;

public interface UserDAO extends JpaRepository<UserEntity, Integer> {

	@Query("FROM UserEntity ur where ur.usercontactno=(:contactno) and ur.userpassword=(:password) ")
	List<UserEntity> findByContactNoPassword(@Param("contactno") long contactno, @Param("password") String password);

}
