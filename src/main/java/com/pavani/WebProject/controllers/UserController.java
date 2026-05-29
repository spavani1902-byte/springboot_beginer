package com.pavani.WebProject.controllers;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pavani.WebProject.services.UserService;
import com.pavani.WebProject.model.User;
@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;
    UserController(){
        userService=new UserService();
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
