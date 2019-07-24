package com.admin.foodfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.admin.foodfood.entity.ProductEntity;
import com.admin.foodfood.service.ProductService;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	@RequestMapping(value="/searchbyproductname", method=RequestMethod.GET)
	public List<ProductEntity> searchProduct(@RequestParam String productname) {
		List<ProductEntity> list=productservice.findProductByProductName(productname);
		return list;
		
	}

}
