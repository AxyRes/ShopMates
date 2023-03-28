package com.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Cart;
import com.model.CartItem;

@Repository
public class CartItemDaoImpl implements CartItemDao {

	private JdbcTemplate jdbcTemplate;

	public CartItemDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCartItem(String CartItemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAllCartItems(Cart cart) {
		// TODO Auto-generated method stub
		
	}

}
