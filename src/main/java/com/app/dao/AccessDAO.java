package com.app.dao;

import com.app.model.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AccessDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewAccess(Access access) {
        jdbcTemplate.update("INSERT INTO accesses (user_id, project_id) " +
                "VALUES (?, ?)");
    }

    public List<Access> getAllAccesses() {
        RowMapper<Access> rowMapper = ((rs, rowNumber) -> mapAccess(rs));

        return jdbcTemplate.query("SELECT * FROM accesses", rowMapper);
    }

    private Access mapAccess(ResultSet rs) throws SQLException {
        Access access = new Access();

        access.setId(rs.getLong("id"));
        access.setUser_id(rs.getLong("user_id"));
        access.setProject_id(rs.getLong("project_id"));

        return access;
    }
}
