package com.example.pagingandsorting.controller;

import com.example.pagingandsorting.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity getAllUsers(@PageableDefault(size = 100) Pageable pageable) {
        return ResponseEntity.ok(userService.getAllUsers(pageable));
    }
}
