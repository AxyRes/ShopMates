package com.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<User> getAllUsers() {
		String sql = "SELECT * FROM Accounts";
		List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
		return users;
	}

	@Override
	public void deleteUser(String userId) {
		String sql = "DELETE FROM Accounts WHERE userId = ?";
		jdbcTemplate.update(sql, userId);
	}

	@Override
	public void addUser(User user) {
		String sql = "INSERT INTO Accounts (userId, email, password, status) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getUserId(), user.getEmailId(), user.getPassword(), user.isEnabled());
	}

	@Override
	public User getUserById(String userId) {
		String sql = "SELECT * FROM Accounts WHERE userId = ?";
		User user = jdbcTemplate.queryForObject(sql, new Object[] { userId }, new BeanPropertyRowMapper<>(User.class));
		return user;
	}
}
