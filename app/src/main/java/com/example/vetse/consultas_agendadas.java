package com.example.vetse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class consultas_agendadas extends AppCompatActivity {
    private ImageButton bt_voltar;
    private Button bt_cancelar_consulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas_agendadas);

        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_voltar = (ImageButton) findViewById(R.id.bt_voltar);
                Intent b = new Intent(consultas_agendadas.this, home.class);
            }
        });


        bt_cancelar_consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt_cancelar_consulta = (Button) findViewById(R.id.bt_cancelar_consulta);
                Intent b = new Intent(consultas_agendadas.this, confirmar_cancelamento.class);
            }
        });
    }
}