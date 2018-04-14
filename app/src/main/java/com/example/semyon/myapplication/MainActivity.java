package com.example.semyon.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.semyon.myapplication.InnerClass.InnerClsTest;
import com.example.semyon.myapplication.abstact.Animal;
import com.example.semyon.myapplication.abstact.Dog;
import com.example.semyon.myapplication.abstact.Cat;
import com.example.semyon.myapplication.interfaces.InterfaceUseReturn;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    int[] arrInt;
    int arrInt2[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
        testCls();
        testArray();
        testAbs();
        testInnerCls();
        testInterface();
    }

    private void setupUI() {
        TextView txView = findViewById(R.id.textView);
//        Log.e("semyon", "test");
    }

    private void testInterface() {
        InterfaceUseReturn interObj = new InterfaceUseReturn();
        interObj.testInterfaceReturn("Java Block"); // ????
    }

    private void testInnerCls() {
        // 内部类调用方法一
        InnerClsTest innerObj = new InnerClsTest();
        innerObj.testInnerClass();
        int d = innerObj.aa;
        int e = InnerClsTest.aa; // 强大的静态变量
        Common.printf(Integer.toString(e) + ',' + Integer.toString(d));

        // 内部类调用方法二
        InnerClsTest.InnerCls inInerObj = new InnerClsTest().new InnerCls();
        inInerObj.innerMethod();
    }

    private void testAbs() {
        Animal dog = new Dog();
        dog.speak();

        Animal cat = new Cat();
        cat.speak();

        if (cat instanceof Cat) {
            Common.printf("cat is cat");
        }
        if (cat instanceof Animal) {
            Common.printf("cat is Animal");
        }
    }

    private void testCls() {
        TestCls testObj = new TestCls();
        TestCls testObj2 = new TestCls("init mehtod with string");
        testObj.instanceMethod("instance method");

        TestCls.classMethod("hello class method");

        SubCls subObj = new SubCls();
        subObj.instanceMethod("sub class");
    }

    private void testArray() {
        // 一维数组
        arrInt = new int[]{1, 2, 3, 4};
        println(Arrays.toString(arrInt));

        String arrString[] = new String[10];
        arrString[0] = "hi";
        arrString[1] = "h3";
        println(Arrays.toString(arrString));
        if (arrString[0] == "hi") {
            println("== hi");
        }
        if (arrString[0].equals("hi")) {
            println("equal hi");
        }

        // 二维数组
        String[][] douString = new String[2][3];
        douString[1][2] = "do";
//        println(Arrays.toString(douString));
        for (int i=0; i<2; i++) {
            println(Arrays.toString(douString[i]));
        }
    }

    public void println(String string) {
        Log.e("semyon", string);
    }
}
