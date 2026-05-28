package com.pavani.WebProject.model;
//POJO-Plain Old Java Object
public class User {
    private String name;
    private String image;
    private String gender;
    private Integer id;
    //Defaulrt constructor
    public User(){

    }
    //Parameterized constructor
    public User(String name, String image, String gender, Integer id) {
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.id = id;
    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getGender() {
        return gender;
    }

    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
