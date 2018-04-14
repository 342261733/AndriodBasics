package com.example.semyon.myapplication.interfaces;

import com.example.semyon.myapplication.Common;

/**
 * Created by semyon on 2018/4/13.
 */

public class InterfaceUseReturn {
    interface AnInterface {
        public void printSomethings();
    }

    public AnInterface testInterfaceReturn(final String string) {
        return new AnInterface() { // 可以理解为匿名函数吗
            @Override
            public void printSomethings() {
                Common.printf("InterfaceUseReturn: printSomethings" + string);
            }
        };
    }
}
