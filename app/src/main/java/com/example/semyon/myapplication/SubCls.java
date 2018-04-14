package com.example.semyon.myapplication;

import android.util.Log;

/**
 * Created by semyon on 2018/4/10.
 */

public class SubCls extends TestCls {
    @Override
    public void instanceMethod(String string) {
        super.instanceMethod(string);
        Log.e("semyon", "实例方法：SubCls " + string);
    }
}
