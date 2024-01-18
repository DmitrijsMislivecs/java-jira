package com.app.controllers;

import com.app.services.AccessServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccessController {
    @Autowired
    private AccessServices accessServices;

    @GetMapping("/allAccesses")
    public String getAllAccessesPage(Model model) {
        model.addAttribute("accesses", accessServices.getAllAccesses());

        return "allAccesses";
    }
}
