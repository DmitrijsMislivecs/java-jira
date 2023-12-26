package com.app.dao;

import com.app.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StatusDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewStatus(Status status) {
        jdbcTemplate.update("INSERT INTO statuses (name) VALUES (?)", status.getName());
    }
}
