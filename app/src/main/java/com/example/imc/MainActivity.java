package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIMC, btnCalculadora, btnSairIMC, btnBhaskaraPrincipal, btnNomeCompleto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSairIMC = findViewById(R.id.btnSairIMC);

        btnSairIMC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });

        btnIMC = findViewById(R.id.btnIMC);
        btnIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IMC = new Intent(getApplicationContext(),com.example.imc.MainActivity2.class);
                startActivity(IMC);
            }
        });

        btnCalculadora = findViewById(R.id.btnCalculadora);
        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Calculadora = new Intent(getApplicationContext(),com.example.imc.MainActivity3.class);
                startActivity(Calculadora);
            }
        });

        btnBhaskaraPrincipal = findViewById(R.id.btnBhaskaraPrincipal);
        btnBhaskaraPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bhaskara = new Intent(getApplicationContext(), com.example.imc.MainActivity4.class);
                startActivity(Bhaskara);
            }
        });

        btnNomeCompleto = findViewById(R.id.btnNomeCompleto);
        btnNomeCompleto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NomeCompleto = new Intent(getApplicationContext(), com.example.imc.MainActivity5.class);
                startActivity(NomeCompleto);
            }
        });
    }
}