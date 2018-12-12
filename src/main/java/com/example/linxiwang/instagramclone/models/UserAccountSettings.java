package com.example.linxiwang.instagramclone.models;

public class UserAccountSettings {

    private String age;
    private  String bio;
    private String favorite_places;
    private String interests;
    private String name;
    private String photo;


    public UserAccountSettings(String age, String bio, String favorite_places, String interests, String name, String photo) {
        this.age = age;
        this.bio = bio;
        this.favorite_places = favorite_places;
        this.interests = interests;
        this.name = name;
        this.photo = photo;
    }

    public UserAccountSettings( ) {
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFavorite_places() {
        return favorite_places;
    }

    public void setFavorite_places(String favorite_places) {
        this.favorite_places = favorite_places;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "UserAccountSettings{" +
                "age='" + age + '\'' +
                ", bio='" + bio + '\'' +
                ", favorite_places='" + favorite_places + '\'' +
                ", interests='" + interests + '\'' +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
