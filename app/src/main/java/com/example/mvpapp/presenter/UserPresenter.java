package com.example.mvpapp.presenter;

import com.example.mvpapp.Interactor;
import com.example.mvpapp.MainContract;
import com.example.mvpapp.models.user;
import com.example.mvpapp.models.userInfo;

import java.util.List;

public class UserPresenter implements MainContract.Presenter {

   Interactor interactor=new Interactor(this);
    MainContract.View view;
    public UserPresenter(MainContract.View v) {
        view=v;
    }

    @Override
    public void DisplayInfo() {
        interactor.GetInfo();
    }

    @Override
    public void DisplayUserInfo(String val) {
        interactor.GetInfoUser(val);
    }

    @Override
    public void setInfo(List<user> mlist) {
        view.setInfoList(mlist);
    }

    @Override
    public void setUserInfo(userInfo body) {
          view.setInfoUser(body);
    }
}
