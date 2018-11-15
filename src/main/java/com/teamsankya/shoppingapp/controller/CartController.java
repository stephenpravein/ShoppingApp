package com.teamsankya.shoppingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teamsankya.shoppingapp.service.CartService;

@Controller
public class CartController {
	private CartService cartService;

	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
