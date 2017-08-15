package com.holmes.dagger2demo.module;

import com.holmes.dagger2demo.view.MainView;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * author         xulei
 * Date           2017/8/15
 */
@Module
public class MainModule {
    private final MainView mainView;

    public MainModule(MainView mainView) {
        this.mainView = mainView;
    }

    @Provides
    MainView provideMainView() {
        return mainView;
    }
}
