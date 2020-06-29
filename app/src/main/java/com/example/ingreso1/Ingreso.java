package com.example.ingreso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ingreso extends AppCompatActivity {


    TextView tvnombre, tvusuario, tvpassword, tvpeso;
    Button btn_volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);


        tvnombre = (TextView) findViewById(R.id.txt_nombre);
        tvusuario = (TextView) findViewById(R.id.txt_usuario);
        tvpassword = (TextView) findViewById(R.id.txt_password);
        tvpeso = (TextView) findViewById(R.id.txt_peso);

        btn_volver=(Button) findViewById(R.id.btn_volver);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Ingreso.this, MainActivity.class);
                Ingreso.this.startActivity(in);


            }
        });



        registro();

    }

    private void registro() {
        Bundle reggistro =  this.getIntent().getExtras();
        String usuario = reggistro.getString("usu");
        String nombre = reggistro.getString("name");
        String password = reggistro.getString("pass");
        String peso  = reggistro.getString("pes");

        tvnombre.setText(nombre);
        tvusuario.setText(usuario);
        tvpassword.setText(password);
        tvpeso.setText(peso);
    }
}