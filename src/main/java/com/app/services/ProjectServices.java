package com.app.services;

import com.app.dao.ProjectDAO;
import com.app.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServices {
    @Autowired
    private ProjectDAO projectDAO;

    public void StoreNewProject(Project project) {
        projectDAO.storeNewProject(project);
    }
}
