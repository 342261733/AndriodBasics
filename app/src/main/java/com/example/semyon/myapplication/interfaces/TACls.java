package com.example.semyon.myapplication.interfaces;

import com.example.semyon.myapplication.Common;

/**
 * Created by xunianqiang on 2018/4/15.
 */

public class TACls {
    public void test(String message, TCallBack callBack) throws InterruptedException {
        Common.printf("hello Tacls");
        Thread.sleep(2000); // 延迟2s回调
        callBack.success(message);
    }
}
