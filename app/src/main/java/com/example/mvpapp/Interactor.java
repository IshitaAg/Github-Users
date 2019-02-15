package com.example.mvpapp;

import android.util.Log;

import com.example.mvpapp.models.RetroInstance;
import com.example.mvpapp.models.StackInter;
import com.example.mvpapp.models.user;
import com.example.mvpapp.models.userInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Interactor implements MainContract.Interactor {
    MainContract.Presenter presenter;
    public Interactor(MainContract.Presenter p) {
        presenter=p;
    }

    @Override
    public void GetInfo() {
        StackInter apiService= RetroInstance.GetClient().create(StackInter.class);
        Call<List<user>> call= apiService.getUsers();
        call.enqueue(new Callback<List<user>>() {
            @Override
            public void onResponse(Call<List<user>> call, Response<List<user>> response) {
                Log.d("fail", String.valueOf(response.body()));
                presenter.setInfo(response.body());

            }

            @Override
            public void onFailure(Call<List<user>> call, Throwable t) {
                Log.d("fail", String.valueOf(t));
            }
        });
    }

    @Override
    public void GetInfoUser(String val) {
        StackInter api=RetroInstance.GetClient().create(StackInter.class);
        Call<userInfo> call =api.getInfo(val);
        call.enqueue(new Callback<userInfo>() {
            @Override
            public void onResponse(Call<userInfo> call, Response<userInfo> response) {
                presenter.setUserInfo(response.body());
            }

            @Override
            public void onFailure(Call<userInfo> call, Throwable t) {
                Log.d("fail", String.valueOf(t));
            }
        });
    }
}
