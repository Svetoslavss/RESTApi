package com.academy.sirma.RestDbApp.Repositories;

import com.academy.sirma.RestDbApp.Models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveUser(User user){
        String sql = "INSERT INTO users (username, password, email) VALUES(?, ?, ?) )";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }
}

