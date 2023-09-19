package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    TextView txtNome5, txtSobrenome5;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        txtNome5 = findViewById(R.id.txtNome5);
        txtSobrenome5 = findViewById(R.id.txtSobrenome5);

        btnEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent Pagina2 = new Intent(getApplicationContext(), com.example.imc.MainActivity5Tela2.class);
            }
        });
    }
}