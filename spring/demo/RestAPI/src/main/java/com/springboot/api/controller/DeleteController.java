package com.springboot.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/delete-api")
public class DeleteController {
    @DeleteMapping(value = "/{var}")
    public String DeleteVar(@PathVariable String var) {
        return var;
    }

    @DeleteMapping(value = "/req")
    public String getReqPar(@RequestParam String var) {
        return var;
    }
}
