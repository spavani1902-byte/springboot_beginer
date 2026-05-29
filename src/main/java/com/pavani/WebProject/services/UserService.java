package com.pavani.WebProject.services;
import java.util.*;
import com.pavani.WebProject.model.User;
public class UserService {
    private List<User> allUsers;

    public UserService() {
        allUsers = new ArrayList<>();
        allUsers.add(new User("Alice", "Female", "/img/jane.png", 1));
        allUsers.add(new User("Bob", "Male", "/img/john.png", 2));
    }
    public List<User> getAllUsers(){
        return allUsers;
    }
    // public void addUser(String name, String gender, String image){
    //     User newUser=new User(name, image, gender, allUsers.size()+1);
    //     allUsers.add(newUser);
    // }
    
    // public User getUsingSingleId(Integer id){
    //     return allUsers.get(id);
    // }
    // public void updateUser(String name, String gender, String image, Integer id){
    //     User updUser=new User(name, image, gender, id);
    //     allUsers.set(id, updUser);
    // }
    // public void deleteUser(Integer id){
    //     allUsers.remove(id);
    // }
}
