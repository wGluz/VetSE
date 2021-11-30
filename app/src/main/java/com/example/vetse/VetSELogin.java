package com.example.vetse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VetSELogin extends AppCompatActivity {

    private TextView text_cadastre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vetse_login);


        getSupportActionBar().hide();

        IniciarComponentes();

        text_cadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VetSELogin.this,VetseCrieUmaConta.class);
                startActivity(intent);
            }
        });


    }

    private void IniciarComponentes(){
        text_cadastre = findViewById(R.id.cadastre);

}


}
