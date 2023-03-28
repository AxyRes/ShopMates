package com.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.CustomerOrder;

@Repository
public class CustomerOrderDaoImpl implements CustomerOrderDao {

	private JdbcTemplate jdbcTemplate;

	public CustomerOrderDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addCustomerOrder(CustomerOrder customerOrder) {
		// TODO Auto-generated method stub
		
	}

}
