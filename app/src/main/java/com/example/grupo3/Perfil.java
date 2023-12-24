package com.example.grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Perfil extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        MaterialToolbar encabezado = findViewById(R.id.encabezadoPerfil);
        FloatingActionButton botonEditarPerfil = findViewById(R.id.botonEditarPerfil);
        ExtendedFloatingActionButton botonCambiarContrasena = findViewById(R.id.botonCambiarContrasena);

        encabezado.setNavigationOnClickListener(this);
        botonEditarPerfil.setOnClickListener(this);
        botonCambiarContrasena.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.botonEditarPerfil) {
            Intent actividadEditarPerfil = new Intent(Perfil.this, EditarPerfil.class);
            startActivity(actividadEditarPerfil);
        } else if (v.getId() == R.id.botonCambiarContrasena) {
            Intent actividadCambiarContrasena = new Intent(Perfil.this, CambioContrasena.class);
            startActivity(actividadCambiarContrasena);
        } else {
            Intent actividadMenuPrincipal = new Intent(Perfil.this, MenuPrincipal.class);
            startActivity(actividadMenuPrincipal);
        }
    }
}