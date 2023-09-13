package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtNome, txtIdade, txtAltura, txtPeso;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNome = findViewById(R.id.txtNome);
        txtIdade = findViewById(R.id.txtIdade);
        txtAltura = findViewById(R.id.txtAltura);
        txtPeso = findViewById(R.id.txtPeso);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = txtNome.getText().toString();
                Integer idade = Integer.parseInt(txtIdade.getText().toString());
                Double altura = Double.parseDouble(txtAltura.getText().toString());
                Double peso = Double.parseDouble(txtPeso.getText().toString());

                Double imc = peso/(altura*altura);

                TextView resultado = findViewById(R.id.txtResultado);
                resultado.setText("Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nAltura: " + altura + "\nIMC: " + imc);
            }
        });
    }
}