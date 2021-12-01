package com.example.vetse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pronto extends AppCompatActivity {
    private ImageButton bt_pronto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronto);

        bt_pronto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_pronto = (ImageButton) findViewById(R.id.bt_pronto);
                Intent b = new Intent(pronto.this, detalhamento_pag.class);
            }
        });


    }
}