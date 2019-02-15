package com.example.mvpapp.models;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroInstance {
    public static final String BaseURL="https://api.github.com/";
    private static Retrofit retrofit=null;
    public static Retrofit GetClient(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                                 .baseUrl(BaseURL)
                                  .addConverterFactory(GsonConverterFactory.create())
                                  .build();
        }
        return retrofit;
    }
}
