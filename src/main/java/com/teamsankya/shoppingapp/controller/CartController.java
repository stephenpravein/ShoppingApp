package com.teamsankya.shoppingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.shoppingapp.service.CartService;

public class CartController {
	@Autowired
	private CartService cartService;

	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
}
