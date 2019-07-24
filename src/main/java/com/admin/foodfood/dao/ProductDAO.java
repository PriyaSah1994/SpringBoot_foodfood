package com.admin.foodfood.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.admin.foodfood.entity.ProductEntity;

public interface ProductDAO extends JpaRepository<ProductEntity, Integer>{

	//@Query("FROM ProductEntity pe where pe.productname=(:productname)")
	//List<ProductEntity> findProductByProductName(@Param("productname") String productname);
	
	@Query("FROM ProductEntity pe where pe.productname LIKE %:productname% ")
	List<ProductEntity> findProductByProductName(@Param("productname") String productname);
	
	
	

}
