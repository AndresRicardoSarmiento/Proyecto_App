package com.example.ingreso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registrarse extends AppCompatActivity   {

    EditText etnombre, etusuario, etpassword, etpeso;
    Button btn_registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        etnombre = (EditText) findViewById(R.id.edi_txtnombre);
        etusuario = (EditText) findViewById(R.id.edi_txtusuario);
        etpassword = (EditText) findViewById(R.id.edi_txtpass);
        etpeso = (EditText) findViewById(R.id.edi_txtpeso);

        btn_registrar = (Button) findViewById(R.id.btn_registrar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombres = etnombre.getText().toString();
                String usu = etusuario.getText().toString();
                String pass = etpassword.getText().toString();
                String pes = etpeso.getText().toString();

                Intent i = new Intent(Registrarse.this, Ingreso.class);
                i.putExtra("name", nombres);
                i.putExtra("usu", usu);
                i.putExtra("pass", pass);
                i.putExtra("pes", pes);

                Registrarse.this.startActivity(i);



            }
        });
    }

}