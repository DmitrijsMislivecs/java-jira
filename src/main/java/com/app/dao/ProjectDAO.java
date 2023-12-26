package com.app.dao;

import com.app.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewProject(Project project) {
        jdbcTemplate.update("INSERT INTO projects (name, color) " +
                "VALUES (?, ?)", project.getName(), project.getColor());
    }
}
