package com.example.linxiwang.instagramclone.models;

public class User {

    private String email;

    public User(String email){
        this.email = email;
    }
    public User(){
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                '}';
    }
}
