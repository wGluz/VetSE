package com.example.vetse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class agendar_consulta3 extends AppCompatActivity {
    private ImageButton bt_voltar;
    private Button bt_agenda_consulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar_consulta3);
        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_voltar = (ImageButton) findViewById(R.id.bt_voltar);
                Intent b = new Intent(agendar_consulta3.this, agendar_consulta2.class);
            }
        });


        bt_agenda_consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_agenda_consulta = (Button) findViewById(R.id.bt_agenda_consulta);
                Intent b = new Intent(agendar_consulta3.this, pronto.class);
            }
        });
    }
}