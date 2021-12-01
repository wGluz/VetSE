package com.example.vetse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class cadastrar_endereco extends AppCompatActivity {
    private ImageButton bt_voltar;
    private Button bt_cadastrar_endereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_endereco);

        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_voltar = (ImageButton) findViewById(R.id.bt_voltar);
                Intent b = new Intent(cadastrar_endereco.this, enderecos_cadastrados.class);
            }
        });


        bt_cadastrar_endereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_cadastrar_endereco = (Button) findViewById(R.id.bt_cadastrar_endereco);
                Intent b = new Intent(cadastrar_endereco.this, home.class);
            }
        });
    }
}