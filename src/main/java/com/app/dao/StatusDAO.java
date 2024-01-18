package com.app.dao;

import com.app.model.Status;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StatusDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewStatus(Status status) {
        jdbcTemplate.update("INSERT INTO statuses (name) VALUES (?)", status.getName());
    }

    public List<Status> getAllStatuses() {
        RowMapper<Status> rowMapper = (rs, rowNumber) -> mapStatus(rs);

        return jdbcTemplate.query("SELECT * from statuses", rowMapper);
    }

    private Status mapStatus(ResultSet rs) throws SQLException {
        Status status = new Status();

        status.setId(rs.getLong("id"));
        status.setName(rs.getString("name"));

        return status;
    }
}
