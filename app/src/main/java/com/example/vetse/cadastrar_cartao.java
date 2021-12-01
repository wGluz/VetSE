package com.example.vetse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class cadastrar_cartao extends AppCompatActivity {
    private ImageButton bt_voltar;
    private Button bt_cadastrar_cartao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cartao);

        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_voltar = (ImageButton) findViewById(R.id.bt_voltar);
                Intent b = new Intent(cadastrar_cartao.this, forma_pagamento.class);
            }
        });


        bt_cadastrar_cartao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_cadastrar_cartao = (Button) findViewById(R.id.bt_cadastrar_cartao);
                Intent b = new Intent(cadastrar_cartao.this, home.class);
            }
        });
    }
}