package com.app.dao;

import com.app.model.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class LabelDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewLabel(Label label) {
        jdbcTemplate.update("INSERT INTO labels (name) VALUES (?)", label.getName());
    }

    public List<Label> getAllLabels() {
        RowMapper<Label> rowMapper = ((rs, rowNumber) -> mapLabel(rs));

        return jdbcTemplate.query("SELECT * FROM labels", rowMapper);
    }

    private Label mapLabel(ResultSet rs) throws SQLException {
        Label label = new Label();

        label.setId(rs.getLong("id"));
        label.setName(rs.getString("name"));

        return label;
    }
}
