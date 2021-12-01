package com.example.vetse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VetSE_Bem_Vindo extends AppCompatActivity {
    private ImageButton bt_bem_vindo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vet_se_bem_vindo);

        bt_bem_vindo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_bem_vindo = (ImageButton) findViewById(R.id.bt_bem_vindo);
                Intent b = new Intent(VetSE_Bem_Vindo.this, VetSELogin.class);
            }
        });
    }
}