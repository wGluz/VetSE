package com.example.vetse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class detalhamento_pag extends AppCompatActivity {
    private ImageButton bt_voltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhamento_pag);
        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_voltar = (ImageButton) findViewById(R.id.bt_voltar);
                Intent b = new Intent(detalhamento_pag.this, home.class);
            }
        });
    }}