package com.example.mvpapp.models;

import com.google.gson.annotations.SerializedName;

public class user {
    @SerializedName("login")
     private String UserName;
    @SerializedName("id")
    private int id;

    public user(String userName, int id) {
        UserName = userName;
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
