package com.cayhualla.myfirstapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splatch);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(SplatchActivity.this, MainActivity.class));
            }
        }, 3000);

    }
}
