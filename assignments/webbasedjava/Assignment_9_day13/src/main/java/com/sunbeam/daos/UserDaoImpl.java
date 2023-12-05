package com.sunbeam.daos;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunbeam.pojos.User;

@Repository
public class UserDaoImpl {
	private JdbcTemplate jdbcTemplate;
	
	// @Autowired // implicit
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public User findByEmail(String email) {
		String sql = "SELECT id, name, email, password, reg_amt, reg_date, role FROM users WHERE email = ?";
		UserRowMapperImpl userRowMapper = new UserRowMapperImpl();
		List<User> list = jdbcTemplate.query(sql, userRowMapper, email);
		if(list.isEmpty())
			return null;
		return list.get(0);
	}
}



