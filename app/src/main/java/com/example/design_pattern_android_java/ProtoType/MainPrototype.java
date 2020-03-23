package com.example.design_pattern_android_java.ProtoType;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.design_pattern_android_java.R;

public class MainPrototype extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prototype);

        MenModel menModel = new MenModel("ali");

        MenModel cloneHumanModel = (MenModel) menModel.cloneModel();
        Toast.makeText(this, cloneHumanModel.getName(), Toast.LENGTH_LONG).show();

        cloneHumanModel.setName("hassan");
        Toast.makeText(this, cloneHumanModel.getName(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, menModel.getName(), Toast.LENGTH_LONG).show();
        
    }
}