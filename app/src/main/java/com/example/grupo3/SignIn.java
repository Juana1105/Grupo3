package com.example.grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.appbar.MaterialToolbar;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        MaterialToolbar encabezado = findViewById(R.id.encabezadoRegistro);
        setSupportActionBar(encabezado);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        EditText textoNombre = findViewById(R.id.editTextNombreRegistro);
        EditText textoCorreo = findViewById(R.id.editTextCorreoRegistro);
        EditText textoContrasena = findViewById(R.id.editTextContrasenaRegistro);
        EditText textoConfirmarContrasena = findViewById(R.id.editTextConfirmarContrasenaRegistro);

        encabezado.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}