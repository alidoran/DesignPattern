package com.example.design_pattern_android_java.FactoryMethod;

public class BranchTwo_FactoryMethod implements IFactoryMethodBranch {
    @Override
    public int branchNumber() {
        return 2;
    }

    @Override
    public String getText() {
        return "This is branch two";
    }
}
