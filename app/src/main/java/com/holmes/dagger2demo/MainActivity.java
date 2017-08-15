package com.holmes.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.holmes.dagger2demo.presenter.MainPrsenter;
import com.holmes.dagger2demo.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainPrsenter mainPrsenter = new MainPrsenter(this);
        mainPrsenter.loadData();
    }

    @Override
    public void updateUI() {
        Log.e("updateUI","更新UI");
    }
}
