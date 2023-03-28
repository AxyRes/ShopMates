package com.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Authorities;
import com.model.Cart;
import com.model.Customer;
import com.model.User;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	private JdbcTemplate jdbcTemplate;

	public CustomerDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByemailId(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
