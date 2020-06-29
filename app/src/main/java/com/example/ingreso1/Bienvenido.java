package com.example.ingreso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bienvenido extends AppCompatActivity {

    Button btn_salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        btn_salir=(Button) findViewById(R.id.btn_salir);
        btn_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intensalir = new Intent(Bienvenido.this, MainActivity.class);
                Bienvenido.this.startActivity(intensalir);
            }
        });

    }
}