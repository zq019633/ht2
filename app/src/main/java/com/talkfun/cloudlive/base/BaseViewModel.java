package com.talkfun.cloudlive.base;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

/**
 * Created by ccy on 2019/5/8/16:45
 */
public class BaseViewModel extends AndroidViewModel {
    protected Application application;

    public BaseViewModel(@NonNull Application application) {
        super(application);
        this.application = application;
    }
}
