package com.dao;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.model.Queries;

@Repository
public class QueriesDaoImpl implements QueriesDao  {

	private JdbcTemplate jdbcTemplate;

	public QueriesDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addQuery(Queries queries) {
		// TODO Auto-generated method stub
		
	}
	

}
