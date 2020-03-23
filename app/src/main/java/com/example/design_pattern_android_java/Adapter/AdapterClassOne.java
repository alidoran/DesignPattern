package com.example.design_pattern_android_java.Adapter;

import android.util.Log;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class AdapterClassOne implements AdapterInterface {

    @Override
    public void methodOne() {
        Log.d("Adapter Tag", "methodOne: Method One Class One");
    }

    @Override
    public void methodTwo() {
        Log.d("Adapter Tag", "methodOne: Method Two Class One");
    }
}
