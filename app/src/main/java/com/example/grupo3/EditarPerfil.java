package com.example.grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import Tablas.Usuario;

public class EditarPerfil extends AppCompatActivity implements View.OnClickListener {
    private Bundle usuario;
    private Usuario datosUsuario;
    private EditText textoNombre;
    private EditText textoCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);

        usuario = getIntent().getExtras();
        datosUsuario = usuario.getParcelable("usuario");

        MaterialToolbar encabezado = findViewById(R.id.encabezadoEditarPerfil);
        textoNombre = findViewById(R.id.editTextNombreEditarPerfil);
        textoCorreo = findViewById(R.id.editTextCorreoEditarPerfil);
        FloatingActionButton botonCambios = findViewById(R.id.botonCambiosEditarPerfil);

        textoNombre.setText(datosUsuario.getNombre());
        textoCorreo.setText(datosUsuario.getCorreo());

        encabezado.setNavigationOnClickListener(this);
        botonCambios.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent actividadPerfil = new Intent(EditarPerfil.this, Perfil.class);
        if (v.getId() == R.id.botonCambiosEditarPerfil) {
            String nombre = textoNombre.getText().toString();
            String correo = textoCorreo.getText().toString();
            if (nombre.isEmpty() || correo.isEmpty()) {
                Toast.makeText(this, R.string.errorTextosVacíos, Toast.LENGTH_SHORT).show();
            } else {
                datosUsuario.setNombre(nombre);
                datosUsuario.setCorreo(correo);
                usuario.putParcelable("usuario", datosUsuario);
                actividadPerfil.putExtras(usuario);
                startActivity(actividadPerfil);
            }
        } else {
            actividadPerfil.putExtras(usuario);
            startActivity(actividadPerfil);
        }
    }
}