package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity4 extends AppCompatActivity {

    TextView txtA, txtB, txtC, txtResultadoDelta, txtResultadoCoef, txtRaiz;
    Button btnBhaskara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtC = findViewById(R.id.txtC);

        btnBhaskara.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Integer coefA = Integer.parseInt(txtA.getText().toString());
                Integer coefB = Integer.parseInt(txtB.getText().toString());
                Integer coefC = Integer.parseInt(txtC.getText().toString());

                Integer delta = (coefB * coefB) + (-4 * (coefA * coefC));

                TextView resultadoDelta = findViewById(R.id.txtResultadoDelta);
                resultadoDelta.setText("Delta: " + delta);


                if (delta >= 0) {
                    Double x1 = ((-(coefB) + Math.sqrt(delta)) / 2 * coefA);
                    Double x2 = ((-(coefB) + Math.sqrt(delta)) / 2 * coefA);

                    TextView resultadoCoef = findViewById(R.id.txtResultadoCoef);
                    resultadoCoef.setText("x1 = " + x1 + "\nx2 = " + x2);
                } else {
                    TextView raiz = findViewById(R.id.txtRaiz);
                }
            }
        });
    }
}