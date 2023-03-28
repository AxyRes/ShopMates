package com.dao;

import java.io.IOException;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Cart;
import com.service.CustomerOrderService;

@Repository
public class CartDaoImpl implements CartDao {

	private JdbcTemplate jdbcTemplate;

	public CartDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Cart getCartByCartId(String CartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart validate(String cartId) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cart cart) {
		// TODO Auto-generated method stub
		
	}


}
