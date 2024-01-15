package com.example.grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

import Tablas.Modulo;

public class ActivityNuevoModulo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_modulo);

        MaterialButton botonRegistrar = findViewById(R.id.botonRegistrarModulo);
        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder=new AlertDialog.Builder(v.getContext());

                builder.setTitle("Mensaje Informativo");
                builder.setMessage("Estás a punto de guardar un nuevo módulo, si estás seguro haz clic en 'aceptar'");
                builder.setIcon(android.R.drawable.btn_star_big_on);

                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Modulo m=new Modulo();
                        String nombre=String.valueOf((EditText)findViewById(R.id.nombreModulo));
                        String ciclo=String.valueOf((EditText)findViewById(R.id.ciclo));
                        String usuario=String.valueOf((EditText)findViewById(R.id.usuario));

                        m.setModulo(nombre);
                        m.setCiclo(ciclo);
                        m.setUsuario(usuario);


                        //DatabaseReference dbRef= FirebaseDatabase.getInstance().getReference().child("Modulos");
                        //dbRef.push().setValue(m);

                        Intent pantallaPrincipal=new Intent(ActivityNuevoModulo.this, MenuPrincipal.class);
                        startActivity(pantallaPrincipal);
            }
        });
                builder.setNegativeButton("No aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        View padre=(View) v.getParent();
                        Snackbar barra= Snackbar.make(padre,"Si no aceptas modifica algún campo",Snackbar.LENGTH_SHORT);
                        barra.show();
                    }
                });

                builder.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        View padre=(View) v.getParent();
                        Snackbar barra= Snackbar.make(padre,"Has cancelado el registro",Snackbar.LENGTH_SHORT);
                        barra.show();
                    }
                });
                AlertDialog cuadroDialogo = builder.create();
                cuadroDialogo.show();

            }
        });

    }
}