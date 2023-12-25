package com.example.grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

import Tablas.Usuario;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private Usuario usuarioPrueba;
    private Bundle usuario;
    private EditText textoCorreo;
    private EditText textoContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuarioPrueba = new Usuario("Jose", "jose@gmail.com", "123456");

        usuario = new Bundle();
        usuario.putParcelable("usuario", usuarioPrueba);

        textoCorreo = findViewById(R.id.editTextCorreoLogin);
        textoContrasena = findViewById(R.id.editTextContrasenaLogin);
        MaterialButton botonIniciarSesion = findViewById(R.id.botonIniciarSesionLogin);
        MaterialButton botonRegistrarse = findViewById(R.id.botonRegistrarseLogin);

        botonIniciarSesion.setOnClickListener(this);
        botonRegistrarse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.botonIniciarSesionLogin) {
            String correo = textoCorreo.getText().toString();
            String contrasena = textoContrasena.getText().toString();
            if (correo.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(Login.this, R.string.errorTextosVacíos, Toast.LENGTH_SHORT).show();
            } else if (usuarioPrueba.getCorreo().equals(correo) && usuarioPrueba.getContrasena().equals(contrasena)) {
                Intent actividadMenuPrincipal = new Intent(Login.this, MenuPrincipal.class);
                actividadMenuPrincipal.putExtras(usuario);
                startActivity(actividadMenuPrincipal);
            } else {
                Toast.makeText(Login.this, R.string.errorInsertarDatosIniciarSesion, Toast.LENGTH_SHORT).show();
            }
        } else if (v.getId() == R.id.botonRegistrarseLogin) {
            Intent actividadSignIn = new Intent(Login.this, SignIn.class);
            actividadSignIn.putExtras(usuario);
            startActivity(actividadSignIn);
        }
    }
}