package com.app.controllers;

import com.app.services.LabelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LabelsController {
    @Autowired
    private LabelServices labelServices;

    @GetMapping("/allLabels")
    public String getAllLabelsPage(Model model) {
        model.addAttribute("labels", labelServices.getAllLabels());

        return "allLabels";
    }
}
