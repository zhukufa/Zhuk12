package com.example.zhuk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    SharedPreferences sp = getSharedPreferences("hasVisited",
                            Context.MODE_PRIVATE);
                    boolean hasVisited = sp.getBoolean("hasVisited", false);

                    if (!hasVisited) {
                        SharedPreferences.Editor e = sp.edit();
                        e.putBoolean("hasVisited", true);
                        e.commit();
                        Intent mainIntent = new Intent(SplashScreen.this, Register.class);
                        SplashScreen.this.startActivity(mainIntent);
                        SplashScreen.this.finish();
                    } else {
                        Intent mainIntent = new Intent(SplashScreen.this, Register.class);
                        SplashScreen.this.startActivity(mainIntent);
                        SplashScreen.this.finish();
                    }
                }
            },SPLASH_DISPLAY_LENGTH);
        }
    }
}