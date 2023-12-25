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

public class SignIn extends AppCompatActivity implements View.OnClickListener {
    private Bundle usuarioNuevo = new Bundle();
    private Usuario usuarioPrueba;
    private EditText textoNombre;
    private EditText textoCorreo;
    private EditText textoContrasena;
    private EditText textoConfirmarContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Bundle usuario = getIntent().getExtras();
        usuarioPrueba = usuario.getParcelable("usuario");

        MaterialToolbar encabezado = findViewById(R.id.encabezadoSignIn);
        textoNombre = findViewById(R.id.editTextNombreSignIn);
        textoCorreo = findViewById(R.id.editTextCorreoSignIn);
        textoContrasena = findViewById(R.id.editTextContrasenaSignIn);
        textoConfirmarContrasena = findViewById(R.id.editTextConfirmarContrasenaSignIn);
        MaterialButton botonRegistrarse = findViewById(R.id.botonRegistrarseSignIn);

        encabezado.setNavigationOnClickListener(this);
        botonRegistrarse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.botonRegistrarseSignIn) {
            String nombre = textoNombre.getText().toString();
            String correo = textoCorreo.getText().toString();
            String contrasena = textoContrasena.getText().toString();
            String confirmarContrasena = textoConfirmarContrasena.getText().toString();
            if (nombre.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || confirmarContrasena.isEmpty()) {
                Toast.makeText(SignIn.this, R.string.errorTextosVacíos, Toast.LENGTH_SHORT).show();
            } else if (usuarioPrueba.getCorreo().equals(correo)) {
                Toast.makeText(SignIn.this, R.string.errorCorreoYaExistente, Toast.LENGTH_SHORT).show();
            } else if (contrasena.equals(confirmarContrasena)) {
                usuarioNuevo.putParcelable("usuario", new Usuario(nombre, correo, contrasena));
                Intent actividadMenuPrincipal = new Intent(SignIn.this, MenuPrincipal.class);
                actividadMenuPrincipal.putExtras(usuarioNuevo);
                startActivity(actividadMenuPrincipal);
            } else {
                Toast.makeText(this, R.string.errorContrasenaYConfirmacionErroneas, Toast.LENGTH_SHORT).show();
            }
        } else {
            Intent actividadLogin = new Intent(SignIn.this, Login.class);
            startActivity(actividadLogin);
        }
    }
}