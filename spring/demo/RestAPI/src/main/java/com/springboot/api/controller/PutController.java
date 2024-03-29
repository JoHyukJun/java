package com.springboot.api.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.dto.MemberDto;

@RestController
@RequestMapping(value = "/api/v1/put-api")
public class PutController {
    @PutMapping(value = "/member")
    public String postMem(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + ":" + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PutMapping(value = "/member-dto")
    public String postMemDto(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    @PutMapping(value = "/member-dto-2")
    public MemberDto postMemDtoReturn(@RequestBody MemberDto memberDto) {
        return memberDto;
    }

    @PutMapping(value = "member-dto-3")
    public ResponseEntity<MemberDto> postMemDtoResBody(@RequestBody MemberDto memberDto) {
        return ResponseEntity
        .status(HttpStatus.ACCEPTED)
        .body(memberDto);
    }
}
