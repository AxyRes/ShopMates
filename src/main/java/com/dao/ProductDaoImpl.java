package com.dao;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	private JdbcTemplate jdbcTemplate;

	public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(String productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

}
