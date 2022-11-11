package com.example.zhuk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Register extends AppCompatActivity {
Button save;
ImageButton backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
    }

    public void savechange(View view) {
        Intent intent;
        intent = new Intent(Register.this, MainScreen.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent;
        intent = new Intent(Register.this, MainActivity.class);
        startActivity(intent);
    }
}