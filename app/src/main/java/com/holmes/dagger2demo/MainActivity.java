package com.holmes.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.holmes.dagger2demo.model.MainModel;
import com.holmes.dagger2demo.module.MainModule;
import com.holmes.dagger2demo.presenter.MainPrsenter;
import com.holmes.dagger2demo.view.MainView;

import javax.inject.Inject;

import dagger.Component;

public class MainActivity extends AppCompatActivity implements MainView {
    @Inject
    MainPrsenter mainPrsenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivity_MainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
        //加载数据
        mainPrsenter.loadData();
    }

    @Override
    public void updateUI() {
        Log.e("updateUI", "更新UI");
    }

    @Component(modules = MainModule.class)
    public interface MainComponent {
        void inject(MainActivity activity);
    }
}
