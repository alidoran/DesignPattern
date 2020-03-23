package com.example.design_pattern_android_java.FactoryMethod;

public interface IFactoryMethod {

    IFactoryMethodBranch create();

    IFactoryMethodBranch create(String selectedBranch);
}
