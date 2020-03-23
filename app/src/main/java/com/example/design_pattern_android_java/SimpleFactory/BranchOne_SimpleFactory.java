package com.example.design_pattern_android_java.SimpleFactory;

public class BranchOne_SimpleFactory implements Interface_SimpleFactory {
    @Override
    public String print() {
        return "This is first branch";
    }
}
