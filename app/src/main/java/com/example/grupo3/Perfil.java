package com.example.grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import Tablas.Usuario;

public class Perfil extends AppCompatActivity implements View.OnClickListener {
    private Bundle usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        usuario = getIntent().getExtras();
        Usuario datosUsuario = usuario.getParcelable("usuario");

        MaterialToolbar encabezado = findViewById(R.id.encabezadoPerfil);
        TextView textoNombre = findViewById(R.id.textViewNombrePerfil);
        TextView textoCorreo = findViewById(R.id.textViewCorreoPerfil);
        FloatingActionButton botonEditarPerfil = findViewById(R.id.botonEditarPerfil);
        ExtendedFloatingActionButton botonCambiarContrasena = findViewById(R.id.botonCambiarContrasena);

        textoNombre.setText(datosUsuario.getNombre());
        textoCorreo.setText(datosUsuario.getCorreo());

        encabezado.setNavigationOnClickListener(this);
        botonEditarPerfil.setOnClickListener(this);
        botonCambiarContrasena.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.botonEditarPerfil) {
            Intent actividadEditarPerfil = new Intent(Perfil.this, EditarPerfil.class);
            actividadEditarPerfil.putExtras(usuario);
            startActivity(actividadEditarPerfil);
        } else if (v.getId() == R.id.botonCambiarContrasena) {
            Intent actividadCambiarContrasena = new Intent(Perfil.this, CambioContrasena.class);
            actividadCambiarContrasena.putExtras(usuario);
            startActivity(actividadCambiarContrasena);
        } else {
            Intent actividadMenuPrincipal = new Intent(Perfil.this, MenuPrincipal.class);
            actividadMenuPrincipal.putExtras(usuario);
            startActivity(actividadMenuPrincipal);
        }
    }
}