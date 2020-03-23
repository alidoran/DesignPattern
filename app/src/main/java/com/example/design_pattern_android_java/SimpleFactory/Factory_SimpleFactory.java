package com.example.design_pattern_android_java.SimpleFactory;

public class Factory_SimpleFactory {

    public static Interface_SimpleFactory create (String selected_branch){
        if (selected_branch.equals("BranchOne"))
            return new BranchOne_SimpleFactory();
        else if (selected_branch.equals("BranchTwo"))
            return new BranchTwo_SimpleFactory();
        else
            return null;
    }
}
