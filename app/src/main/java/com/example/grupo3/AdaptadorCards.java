package com.example.grupo3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import Tablas.Tarea;

public class AdaptadorCards extends ArrayAdapter<Modulo> {

    private ArrayList<Modulo> lista;

    public AdaptadorCards(Context contexto, ArrayList<Modulo> lista) {
        super(contexto, R.layout.cards, lista);
        this.lista=lista;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater mostrado= LayoutInflater.from(getContext());
        View elemento= mostrado.inflate(R.layout.cards, parent, false);


        ImageView imagenModulo =(ImageView) elemento.findViewById(R.id.imagenModulo);
        TextView nombreModulo= (TextView) elemento.findViewById(R.id.nombreModulo);
        TextView cicloModulo= (TextView) elemento.findViewById(R.id.ciclo);
        TextView cursoModulo= (TextView) elemento.findViewById(R.id.curso);

        //asociamos elementos


        imagenModulo.setImageResource(lista.get(position).getFoto());
        nombreModulo.setText(lista.get(position).getNombre());
        cicloModulo.setText(lista.get(position).getCiclo());
        cursoModulo.setText(String.valueOf(lista.get(position).getCurso()));



        return elemento;
    }
}
