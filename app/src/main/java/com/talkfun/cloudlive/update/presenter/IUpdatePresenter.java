package com.talkfun.cloudlive.update.presenter;

/**
 * Created by Administrator on 2017/6/23.
 */
public interface IUpdatePresenter {
    void checkVersion();
    void downloadApk(String url);
    void stopDownloadApk();
}
