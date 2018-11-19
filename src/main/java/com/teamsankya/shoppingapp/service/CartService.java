package com.teamsankya.shoppingapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.teamsankya.shoppingapp.dto.CartBean;

@Service
public interface CartService {
	public List<CartBean> getProducts(String id);
}
