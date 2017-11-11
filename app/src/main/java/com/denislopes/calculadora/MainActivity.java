package com.denislopes.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtPrimeiro;
    private EditText edtSegundo;
    private Button btnSomar;

    private double n1;
    private double n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPrimeiro =  findViewById(R.id.edt_primeiro);
        edtSegundo =  findViewById(R.id.edt_segundo);
        btnSomar = findViewById(R.id.btn_Calcular);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(edtPrimeiro.getText().toString());
                n2 = Double.parseDouble(edtSegundo.getText().toString());

                double resultado = n1 + n2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Mensagem");
                dialogo.setMessage("Resultado: " + resultado);
                dialogo.setNeutralButton("Ok",null);
                dialogo.show();

            }
        });






    }



}
