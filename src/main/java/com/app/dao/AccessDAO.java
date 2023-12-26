package com.app.dao;

import com.app.model.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccessDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewAccess(Access access) {
        jdbcTemplate.update("INSERT INTO accesses (user_id, project_id) " +
                "VALUES (?, ?)");
    }
}
