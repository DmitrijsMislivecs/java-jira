package com.app.services;

import com.app.dao.LabelDAO;
import com.app.model.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelServices {
    @Autowired
    private LabelDAO labelDAO;

    public void StoreNewLabel(Label label) {
        labelDAO.storeNewLabel(label);
    }
}
