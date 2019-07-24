package com.admin.foodfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.foodfood.dao.ProductDAO;
import com.admin.foodfood.entity.ProductEntity;

@Service
public class ProductService {

	@Autowired
	ProductDAO productdao;
	
	

	public List<ProductEntity> findProductByProductName(String productname) {
		// TODO Auto-generated method stub
		
		return productdao.findProductByProductName(productname);
	}

}
