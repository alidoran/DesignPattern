package com.example.design_pattern_android_java.Adapter;

public class AdapterClassAdapter implements AdapterInterface {

    private AdapterClassTwo classTwo;

    public AdapterClassAdapter() {
        classTwo = new AdapterClassTwo();
    }

    @Override
    public void methodOne() {
        classTwo.methodOne();
    }

    @Override
    public void methodTwo() {
        classTwo.methodTwo();
    }
}
