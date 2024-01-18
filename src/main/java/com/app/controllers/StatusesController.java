package com.app.controllers;

import com.app.services.StatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusesController {

    @Autowired
    private StatusServices statusServices;

    @GetMapping("/allStatuses")
    public String getAllStatusesPage(Model model) {
        model.addAttribute("statuses", statusServices.getAllStatuses());

        return "allStatuses";
    }
}
