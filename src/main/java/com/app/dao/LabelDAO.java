package com.app.dao;

import com.app.model.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LabelDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewLabel(Label label) {
        jdbcTemplate.update("INSERT INTO labels (name) VALUES (?)", label.getName());
    }
}
