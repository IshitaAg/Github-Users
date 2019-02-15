package com.example.mvpapp.views;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mvpapp.MainContract;
import com.example.mvpapp.R;
import com.example.mvpapp.models.user;
import com.example.mvpapp.models.userInfo;
import com.example.mvpapp.presenter.UserPresenter;

import java.util.List;

public class UserInfoView extends AppCompatActivity implements MainContract.View {
    UserPresenter presenter=new UserPresenter(this);
    ImageView profile;
    TextView name;
    TextView followers;
    TextView following;
    TextView gists;
    TextView repos;
    String loginval;
    TextView location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_detail);
        profile=findViewById(R.id.imgprofile);
        name=findViewById(R.id.username);
        followers=findViewById(R.id.followers);
        following=findViewById(R.id.following);
        gists=findViewById(R.id.gists);
        repos=findViewById(R.id.repos);
        location=findViewById(R.id.Location);
        loginval=getIntent().getStringExtra("loginval");
        presenter.DisplayUserInfo(loginval);
    }

    @Override
    public void setInfoList(List<user> mlist) {
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void setInfoUser(userInfo body) {
         name.setText("Name: "+body.getName());
         followers.setText("Followers: "+body.getFollowers());
         following.setText("Following: "+body.getFollowing());
         gists.setText("Public-gists: "+body.getGists());
         repos.setText("Public-repos: "+body.getRepos());
         location.setText("Location: "+body.getLocation());
        Glide.with(this).load(body.getImage()).into(profile);
    }

}
