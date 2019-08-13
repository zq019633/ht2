package com.talkfun.cloudlive.update.listener;

import java.io.File;

public interface OnDownloadListener {
    void onStart();
    void onProgress(int percent);
    void onSuccess();
    void onFail(File apk);
    void onCancel();
}
