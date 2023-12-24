package com.example.grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

public class SignIn extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        MaterialToolbar encabezado = findViewById(R.id.encabezadoSignIn);
        MaterialButton botonRegistrarse = findViewById(R.id.botonRegistrarseSignIn);

        encabezado.setNavigationOnClickListener(this);
        botonRegistrarse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.botonRegistrarseSignIn) {
            Intent actividadMenuPrincipal = new Intent(SignIn.this, MenuPrincipal.class);
            startActivity(actividadMenuPrincipal);
        } else {
            Intent actividadLogin = new Intent(SignIn.this, Login.class);
            startActivity(actividadLogin);
        }
    }
}