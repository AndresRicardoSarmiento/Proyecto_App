package com.example.ingreso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_registrar;
    Button btn_inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_inicio = (Button) findViewById(R.id.btn_iniciar);
        btn_inicio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intenBien = new Intent(MainActivity.this, Bienvenido.class);
                MainActivity.this.startActivity(intenBien);
            }
        });




        tv_registrar = (TextView) findViewById(R.id.txt_reg);

        tv_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentReg = new Intent(MainActivity.this, Registrarse.class);
                MainActivity.this.startActivity(intentReg);
            }
        });



    }
}