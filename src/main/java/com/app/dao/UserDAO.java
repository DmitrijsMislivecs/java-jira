package com.app.dao;

import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewUser(User user) {
        jdbcTemplate.update("INSERT INTO users (first_name, last_name, email, password) " +
                "VALUES (?, ?, ?, ?)", user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
    }
}
