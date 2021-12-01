package com.example.vetse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EsqueceuSuaSenha extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueceu_sua_senha);
        getSupportActionBar().hide();
    }
}