package com.pavani.WebProject.controllers;
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
    public ResponseEntity getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
