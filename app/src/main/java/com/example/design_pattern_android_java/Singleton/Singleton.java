package com.example.design_pattern_android_java.Singleton;

//package private class and method
class Singleton {
    private static final Singleton instance = new Singleton();

    static Singleton getInstance() {
        return instance;
    }

    long plus(long a, long b) {
        return a + b;
    }
}
