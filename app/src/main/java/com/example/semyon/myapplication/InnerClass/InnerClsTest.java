package com.example.semyon.myapplication.InnerClass;

import com.example.semyon.myapplication.Common;

/**
 * Created by semyon on 2018/4/13.
 */

public class InnerClsTest {
    public int a = 1;
    static public int aa = 333; // 非常强大
    public class InnerCls {
        private int b = 2;
        public void innerMethod() {
            Common.printf("a , b = " + Integer.toString(aa) + ","+ Integer.toString(b));
        }
    }

    static public class InnerClassStatic {
        private int c = 33;
        public void innerClassMethod() {
            Common.printf("a , b = " + Integer.toString(aa) + ","+ Integer.toString(c));
        }
    }

    public void testInnerClass() {
        InnerCls inner = new InnerCls();
        inner.innerMethod();
    }
}