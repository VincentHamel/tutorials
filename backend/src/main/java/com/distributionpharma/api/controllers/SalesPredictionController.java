package com.distributionpharma.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesPredictionController {

    @GetMapping("/hello")
    public String getString(){
        return "hello";
    }
}
