package com.teamsankya.shoppingapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.shoppingapp.dao.CartDAO;

public class CartServiceImpl {
	@Autowired
	private CartDAO cartDAO;
}
