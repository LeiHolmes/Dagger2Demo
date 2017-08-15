package com.holmes.dagger2demo.presenter;

import com.holmes.dagger2demo.model.LoadDataListener;
import com.holmes.dagger2demo.model.MainModel;
import com.holmes.dagger2demo.view.MainView;

import javax.inject.Inject;

/**
 * Description:
 * author         xulei
 * Date           2017/8/15
 */

public class MainPrsenter {
    private MainView mainView;
    private MainModel mainModel;

    @Inject
    public MainPrsenter(MainView mainView) {
        this.mainView = mainView;
        mainModel = new MainModel();
    }

    public void loadData() {
        mainModel.requestData(new LoadDataListener() {
            @Override
            public void onSuccess() {
                mainView.updateUI();
            }
        });
    }
}
