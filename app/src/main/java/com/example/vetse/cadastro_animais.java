package com.example.vetse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class cadastro_animais extends AppCompatActivity {
    private ImageButton bt_voltar;
    private Button bt_cadastrar_animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_animais);
        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_voltar = (ImageButton) findViewById(R.id.bt_voltar);
                Intent b = new Intent(cadastro_animais.this, home.class);
            }
        });


        bt_cadastrar_animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_cadastrar_animal = (Button) findViewById(R.id.bt_cadastrar_animal);
                Intent b = new Intent(cadastro_animais.this, cadastrar_animal.class);
            }
        });
    }
}

