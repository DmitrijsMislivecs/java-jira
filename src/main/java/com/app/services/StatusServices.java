package com.app.services;

import com.app.dao.StatusDAO;
import com.app.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServices {
    @Autowired
    private StatusDAO statusDAO;

    public void storeNewStatus(Status status) {
        statusDAO.storeNewStatus(status);
    }
}
