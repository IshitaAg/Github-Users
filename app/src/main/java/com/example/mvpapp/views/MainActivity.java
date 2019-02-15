package com.example.mvpapp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mvpapp.MainContract;
import com.example.mvpapp.R;
import com.example.mvpapp.models.user;
import com.example.mvpapp.models.userInfo;
import com.example.mvpapp.presenter.UserPresenter;
import com.example.mvpapp.views.Adapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    Adapter adapter;
    RecyclerView recyclerView;
    UserPresenter userPresenter=new UserPresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler1);
        userPresenter.DisplayInfo();
    }

    @Override
    public void setInfoList(List<user> mlist) {
        adapter=new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void setInfoUser(userInfo body) {

    }
}
