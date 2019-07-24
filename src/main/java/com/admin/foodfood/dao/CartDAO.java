package com.admin.foodfood.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.admin.foodfood.entity.CartEntity;

public interface CartDAO extends JpaRepository<CartEntity, Integer>{

	@Query(" FROM CartEntity c where c.userid=(:userid)")
	List<CartEntity> getCartByUserid(@Param("userid") int userid);
	
	@Transactional
	@Modifying
	@Query(" delete from CartEntity c where c.userid=:#{#userid} and c.productid=:#{#productid}")
	void deleteById(@Param("userid") int userid, @Param("productid") int productid);

}
