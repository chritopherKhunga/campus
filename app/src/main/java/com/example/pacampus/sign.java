package com.example.pacampus;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sign extends AppCompatActivity {
    private Button button;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        button = (Button) findViewById(R.id.reg);
        button.setOnClickListener(v -> reg());
        }
        public void reg()
        {
            Intent intent = new Intent(this,register.class);
            startActivity(intent);
        }
    }
