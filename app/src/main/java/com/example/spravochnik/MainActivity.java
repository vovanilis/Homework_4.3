package com.example.spravochnik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mushroom1 = findViewById(R.id.mushroom1);
        mushroom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mushroom1.class);
                startActivity(intent);
            }
        });
        Button mushroom2 = findViewById(R.id.mushroom2);
        mushroom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mushroom2.class);
                startActivity(intent);
            }
        });
        Button mushroom3 = findViewById(R.id.mushroom3);
        mushroom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mushroom3.class);
                startActivity(intent);
            }
        });
        Button mushroom4 = findViewById(R.id.mushroom4);
        mushroom4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mushroom4.class);
                startActivity(intent);
            }
        });
        Button mushroom5 = findViewById(R.id.mushroom5);
        mushroom5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mushroom5.class);
                startActivity(intent);
            }
        });
    }
}