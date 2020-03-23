package com.example.design_pattern_android_java.FactoryMethod;

public class BranchOne_FactoryMethod implements IFactoryMethodBranch {
    @Override
    public int branchNumber() {
        return 1;
    }

    @Override
    public String getText() {
        return "This is branch one";
    }
}
