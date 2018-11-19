package com.teamsankya.shoppingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamsankya.shoppingapp.dto.CartBean;
import com.teamsankya.shoppingapp.service.CartService;

@Controller
public class CartController {
	@Autowired
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

	@RequestMapping(path = "getid", method = RequestMethod.GET)
	public String getId(ModelMap map, String id) {
		CartBean cartBean=(CartBean) cartService.getProducts(id);
		map.addAttribute("cartBean", id);
		if (cartBean==null) {
			return "Failure";
		} else {
			return "Search";
		}
	}
}
