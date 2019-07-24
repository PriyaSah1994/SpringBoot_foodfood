package com.admin.foodfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.admin.foodfood.dto.CartResponse;
import com.admin.foodfood.entity.CartEntity;
import com.admin.foodfood.service.CartService;

@RestController
public class CartController {
	
	@Autowired
	CartService cartservice;
	
	@RequestMapping(value="/savetocart", method= RequestMethod.POST)
	public CartEntity savedToCart(@RequestBody CartEntity addtocart) {
		cartservice.save(addtocart);
		return addtocart;
		}
	
	@RequestMapping(value="/getcartbyuserid", method=RequestMethod.POST)
	public List<CartResponse> getCartByUserid(@RequestParam int userid) {
		List<CartResponse> list=cartservice.getCartByUserid(userid);
		return list;
		
	}
	
	@RequestMapping(value="/deletefromcart")
	public void deleteFromCart(@RequestParam int userid, @RequestParam int productid) {
		
		cartservice.deleteFromCart(userid,productid);
		
		
	}
	
}
