package com.example.servicetest;

public interface DownloadListener {

    //通知当前下载进度
    void onProgress(int progress);

    //通知下载成功事件
    void onSuccess();

    //通知下载失败事件
    void onFailed();

    //通知下载暂停事件
    void onPaused();

    //通知下载取消事件
    void onCanceled();
}
