package com.sungyeon.user.loginapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/userapi")
public class LoginApiController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody String user) {
        return ResponseEntity.ok("ok " + user);
    }
}
