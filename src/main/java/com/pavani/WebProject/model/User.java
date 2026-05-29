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
    public User(String name, String gender, String image, Integer id) {
        this.name = name;
        this.gender = gender;
        this.image = image;
        this.id = id;
    }
    //Getters and Setters
    public String getName() {
        return this.name;
    }

    public String getImage() {
        return this.image;
    }

    public String getGender() {
        return this.gender;
    }

    public Integer getId() {
        return this.id;
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
