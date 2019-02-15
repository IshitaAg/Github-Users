package com.example.mvpapp.models;

import com.google.gson.annotations.SerializedName;

public class userInfo {
    @SerializedName("login")
    private String UserName;
    @SerializedName("name")
    private String name;
    @SerializedName("following")
    private int following;

    @SerializedName("followers")
    private int followers;

    @SerializedName("public_repos")
    private int repos;
    @SerializedName("public_gists")
    private int gists;
    @SerializedName("location")
    private String location;
    @SerializedName("avatar_url")
    private String ImageURL;
    public userInfo(String name, int following, int followers, int repos, int gists, String location, String image,String userName) {
        this.name = name;
        this.following = following;
        this.followers = followers;
        this.repos = repos;
        this.gists = gists;
        this.location = location;
        ImageURL = image;
        UserName = userName;
    }
    public String getUserName() {
        return UserName;
    }

    public String getName() {
        return name;
    }

    public String getFollowing() {
        return String.valueOf(following);
    }

    public String getFollowers() {
        return String.valueOf(followers);
    }

    public String getRepos() {
        return String.valueOf(repos);
    }

    public String getGists() {
        return String.valueOf(gists);
    }

    public String getLocation() {
        return location;
    }

    public String getImage() {
        return ImageURL;
    }

}
