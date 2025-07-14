package com.green.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sbs")
public class SbsController {

    @GetMapping
    public String index() {
        return "sbs!!";
    }
}
