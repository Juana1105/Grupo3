package com.example.grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EditarPerfil extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);

        MaterialToolbar encabezado = findViewById(R.id.encabezadoEditarPerfil);
        FloatingActionButton botonCambios = findViewById(R.id.botonCambiosEditarPerfil);

        encabezado.setNavigationOnClickListener(this);
        botonCambios.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent actividadPerfil = new Intent(EditarPerfil.this, Perfil.class);
        if (v.getId() == R.id.botonCambiosEditarPerfil) {
            startActivity(actividadPerfil);
        } else {
            startActivity(actividadPerfil);
        }
    }
}