package com.teamsankya.shoppingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.shoppingapp.dao.CartDAO;
import com.teamsankya.shoppingapp.dto.CartBean;

public class CartServiceImpl implements CartService{
	@Autowired
	private CartDAO cartDAO;

	public CartDAO getCartDAO() {
		return cartDAO;
	}

	public void setCartDAO(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}

	@Override
	public List<CartBean> getProducts(String id) {
		return cartDAO.getProducts(id);
	}

}
