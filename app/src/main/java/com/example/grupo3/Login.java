package com.example.grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MaterialButton botonIniciarSesion = findViewById(R.id.botonIniciarSesionLogin);
        MaterialButton botonRegistrarse = findViewById(R.id.botonRegistrarseLogin);

        botonIniciarSesion.setOnClickListener(this);
        botonRegistrarse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.botonIniciarSesionLogin) {
            Intent actividadMenuPrincipal = new Intent(Login.this, MenuPrincipal.class);
            startActivity(actividadMenuPrincipal);
        } else if (v.getId() == R.id.botonRegistrarseLogin) {
            Intent actividadSignIn = new Intent(Login.this, SignIn.class);
            startActivity(actividadSignIn);
        }
    }
}