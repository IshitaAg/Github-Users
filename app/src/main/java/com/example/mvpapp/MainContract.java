package com.example.mvpapp;

import com.example.mvpapp.models.user;
import com.example.mvpapp.models.userInfo;

import java.util.List;

public class MainContract {
    public interface Presenter{
        void DisplayInfo();
        void DisplayUserInfo(String val);
        void setInfo(List<user> nlist);

        void setUserInfo(userInfo body);
    }
    public interface  View{
         void setInfoList(List<user> mlist);
         void setInfoUser(userInfo body);
    }
    public interface Interactor{
        void GetInfo();
        void GetInfoUser(String val);

    }
}

