package com.example.zhuk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
    }

    public void living(View view) {
        Intent intent;
        intent = new Intent(MainScreen.this, MainScreen.class);
        startActivity(intent);
    }

    public void kitch(View view) {
        Intent intent;
        intent = new Intent(MainScreen.this, MainScreen.class);
        startActivity(intent);
    }

    public void bed(View view) {
        Intent intent;
        intent = new Intent(MainScreen.this, MainScreen.class);
        startActivity(intent);
    }

    public void dining(View view) {
        Intent intent;
        intent = new Intent(MainScreen.this, MainScreen.class);
        startActivity(intent);
    }

    public void house(View view) {
        Intent intent;
        intent = new Intent(MainScreen.this, MainScreen.class);
        startActivity(intent);
    }

    public void crr(View view) {
        Intent intent;
        intent = new Intent(MainScreen.this, MainScreen.class);
        startActivity(intent);
    }

    public void ring(View view) {
        Intent intent;
        intent = new Intent(MainScreen.this, MainScreen.class);
        startActivity(intent);
    }

    public void hum(View view) {
        Intent intent;
        intent = new Intent(MainScreen.this, MainScreen.class);
        startActivity(intent);
    }

    public void pls(View view) {
        Intent intent;
        intent = new Intent(MainScreen.this, MainScreen.class);
        startActivity(intent);
    }
}