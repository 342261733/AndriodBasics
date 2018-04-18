package com.example.semyon.myapplication.interfaces;

import com.example.semyon.myapplication.Common;

/**
 * Created by xunianqiang on 2018/4/15.
 */

public class MyAnimal implements LandAnimal, SkyAnimal {
    @Override
    public void fly() {
        Common.printf("I can fly");
    }

    @Override
    public void run() {
        Common.printf("I can run");
    }
}
