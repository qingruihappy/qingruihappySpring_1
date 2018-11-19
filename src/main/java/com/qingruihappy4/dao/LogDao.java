package com.qingruihappy4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LogDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void add(String name) {
		String sql = "INSERT INTO t_log(log_name) VALUES(?);";
		int updateResult = jdbcTemplate.update(sql, name);
		System.out.println("##LogDao##updateResult:" + updateResult);
	}

}
