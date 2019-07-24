package com.admin.foodfood.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.foodfood.dao.CartDAO;
import com.admin.foodfood.dao.ProductDAO;
import com.admin.foodfood.dto.CartResponse;
import com.admin.foodfood.entity.CartEntity;
import com.admin.foodfood.entity.ProductEntity;

@Service
public class CartService {
	
	@Autowired
	CartDAO cartdao;
	
	@Autowired
	ProductDAO productdao;
	
	public void save(CartEntity addtocart) {
		cartdao.save(addtocart);
	}

	public List<CartResponse> getCartByUserid(int userid) {
		
		List<CartEntity> list= cartdao.getCartByUserid(userid);
		List<CartResponse> listcart=new ArrayList<>();
		for (CartEntity cartEntity : list) {
			ProductEntity pe=productdao.getOne(cartEntity.getProductid());
			CartResponse cartresponse=new CartResponse();
			cartresponse.setProductname(pe.getProductname());
			cartresponse.setProductprice(pe.getProductprice());
			listcart.add(cartresponse);
		}
		
		return listcart;
	}

	public void deleteFromCart(int userid, int productid) {
		// TODO Auto-generated method stub
		 cartdao.deleteById(userid,productid);
	}

}
