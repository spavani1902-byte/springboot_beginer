package com.pavani.WebProject.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.pavani.WebProject.model.User;

@Service
public class UserService {
    private List<User> allUsers;

    public UserService() {
        allUsers = new ArrayList<>();
        allUsers.add(new User("Alice", "Female", "/img/jane.png", 1));
        allUsers.add(new User("Bob", "Male", "/img/john.png", 2));
    }

    public List<User> getAllUsers() {
        return allUsers;
    }

    public User getOneUser(int id) {
        for (int i = 0; i < allUsers.size(); i++) {
            User u = allUsers.get(i);
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public User createUser(User u) {
        allUsers.add(u);
        return u;
    }

    public User updateUser(int id, User u) {
        for (int i = 0; i < allUsers.size(); i++) {
            User user = allUsers.get(i);
            if (user.getId() == id) {
                allUsers.set(i, u);
                return u;
            }
        }
        return null;
    }

    public void deleteUser(int id) {
        for (int i = 0; i < allUsers.size(); i++) {
            User u = allUsers.get(i);
            if (u.getId() == id) {
                allUsers.remove(i);
            }
        }
    }
}
