package com.example.mvpapp.models;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StackInter {

   @GET("users")
    Call<List<user>> getUsers();
   @GET("users/{login}")
    Call<userInfo> getInfo(@Path("login")String login);

}
