package com.springboot.api.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.dto.MemberDto;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello there";
    }

    @GetMapping(value = "/name")
    public String getName() {
        return "JO";
    }

    @GetMapping(value = "/var/{var}")
    public String getVar(@PathVariable String var) {
        return var;
    }

    @GetMapping(value = "/req")
    public String getReqPar(@RequestParam String name, @RequestParam String email) {
        return name + " " + email;
    }

    @GetMapping(value = "/reqs")
    public String getReqParMap(@RequestParam Map<String, String> par) {
        StringBuilder sb = new StringBuilder();

        par.entrySet().forEach(map -> {
            sb.append(map.getKey() + " " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping(value = "reqdto")
    public String getReqDto(MemberDto memberDto) {
        return memberDto.toString();
    }
}
