package com.teamsankya.shoppingapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.teamsankya.shoppingapp.dto.CartBean;

@Repository
public interface CartDAO {
	public List<CartBean> getProducts(String id);
}
