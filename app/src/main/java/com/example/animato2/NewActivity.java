package com.example.animato2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateSwipeRight(this);
    }
}