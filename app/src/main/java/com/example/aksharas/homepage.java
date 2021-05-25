package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Button button = (Button) findViewById(R.id.learning);
        button.setOnClickListener(v -> openlearning ());

        Button button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(v -> opendatabase ());

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(v -> openthesaurus ());
    }


    public void openlearning () {
        Intent intent = new Intent(this, learning.class);
        startActivity(intent);
    }

    public void opendatabase () {
        Intent intent = new Intent(this, database.class);
        startActivity(intent);
    }

    public void openthesaurus () {
        Intent intent = new Intent(this,thesaurus.class);
        startActivity(intent);
    }



}

