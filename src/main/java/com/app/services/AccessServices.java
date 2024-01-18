package com.app.services;

import com.app.dao.AccessDAO;
import com.app.model.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessServices {
    @Autowired
    private AccessDAO accessDAO;

    public List<Access> getAllAccesses() {
        return accessDAO.getAllAccesses();
    }
}
