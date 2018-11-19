package com.teamsankya.shoppingapp.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.shoppingapp.dto.CartBean;

public class CartDAOHibernateImpl implements CartDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<CartBean> getProducts(String id) {
		CartBean bean;
		try {
			bean = sessionFactory.getCurrentSession().get(CartBean.class, id);
		} catch (HibernateException e) {
			bean = sessionFactory.openSession().get(CartBean.class, id);
		}

		return (List<CartBean>) bean;
	}

}
