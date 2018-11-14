package com.teamsankya.shoppingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.shoppingapp.service.CartService;

public class CartController {
	@Autowired
	private CartService cartService;
}
