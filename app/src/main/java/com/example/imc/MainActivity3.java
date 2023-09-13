package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView txtN1, txtN2, txtN3;
    Button btnSomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtN1 = findViewById(R.id.txtN1);
        txtN2 = findViewById(R.id.txtN2);
        txtN3 = findViewById(R.id.txtN3);
        btnSomar = findViewById(R.id.btnSomar);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(txtN1.getText().toString());
                int n2 = Integer.parseInt(txtN2.getText().toString());
                int n3 = Integer.parseInt(txtN3.getText().toString());

                int soma = n1+n2+n3;

                TextView resultado = findViewById(R.id.txtResultadoSoma);
                resultado.setText(String.valueOf(soma));
            }
        });
    }
}