package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.StudentiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentiController {
    private final StudentiService studentiService;

    public StudentiController(StudentiService studentiService) {
        this.studentiService = studentiService;
    }
}
