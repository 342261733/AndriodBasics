package com.example.semyon.myapplication;

import android.util.Log;

/**
 * Created by semyon on 2018/4/10.
 */

public class TestCls extends Object {

    String name;

    public TestCls() { // 构造函数
        Log.e("semyon", "TestCls test");
    }

    public TestCls(String string) { // 带参数的构造函数
        this(); // 必须先调用构造函数，否则报错
        this.name = string;
        Log.e("semyon", "构造函数：TestCls " + this.name);
    }

    static public void classMethod(String string) { // 类方法
        Log.e("semyon", "类方法：TestCls " + string);
    }

    public void instanceMethod(String string) { // 实例方法
        Log.e("semyon", "实例方法：TestCls " + string);
        TestCls.classMethod("hello");
    }

}
