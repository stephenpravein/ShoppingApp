package com.teamsankya.shoppingapp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CartDAOHibernateImpl {
	@Autowired
	private SessionFactory sessionFactory;
}
