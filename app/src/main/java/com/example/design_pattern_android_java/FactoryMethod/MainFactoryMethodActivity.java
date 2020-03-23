package com.example.design_pattern_android_java.FactoryMethod;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.design_pattern_android_java.R;

public class MainFactoryMethodActivity extends AppCompatActivity {

    private Button btnOne;
    private Button btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_factory_method);

        initView();
        initEvent();
    }

    private void initView(){
        btnOne = findViewById(R.id.factory_pattern_btn_one);
        btnTwo = findViewById(R.id.factory_pattern_btn_two);
    }

    private void initEvent(){
        btnOne.setOnClickListener(v->{
            String toast = new FactoryClass_FactoryMethod().create().getText();
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        });

        btnTwo.setOnClickListener(v-> {
            String toast = new FactoryClass_FactoryMethod().create("BranchTwo").getText();
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        });
    }
}
