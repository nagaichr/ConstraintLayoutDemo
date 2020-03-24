package com.includehelp.constraintlayoutdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayHello();
    }

    public String sayHello(){
        return "Hello Raghu";
    }

    public String branch1Detail(){
        return "branch1Detail";
    }
}
