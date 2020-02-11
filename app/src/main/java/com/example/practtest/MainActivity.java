package com.example.practtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button EUDO, DO, EULI, LI;
    EditText editTextNum;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EUDO = findViewById(R.id.buttonEUaDO);
        DO = findViewById(R.id.buttonDOaEU);
        EULI = findViewById(R.id.buttonEUaLI);
        LI = findViewById(R.id.buttonLIaEU);
        editTextNum = findViewById(R.id.editTextNumero);
        textViewResultado = findViewById(R.id.textViewResultado);
        final Conversor conversor = new Conversor();

        EUDO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewResultado.setText(conversor.eurosADolares(editTextNum.getText().toString()));

            }
        });
        DO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                textViewResultado.setText(conversor.dolaresAEuros(editTextNum.getText().toString()));


            }
        });
        EULI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                textViewResultado.setText(conversor.eurosALibras(editTextNum.getText().toString()));

            }
        });
        LI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                textViewResultado.setText(conversor.librasAEuros(editTextNum.getText().toString()));


            }
        });

    }


}
