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

public class AdaptadorTareas extends ArrayAdapter<Tarea> {

    private ArrayList<Tarea> lista;

    public AdaptadorTareas(Context contexto, ArrayList<Tarea> lista) {
        super(contexto, R.layout.tareas, lista);
        this.lista=lista;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater mostrado = LayoutInflater.from(getContext());
        View elemento = mostrado.inflate(R.layout.tareas, parent, false);



        TextView nombreModulo = (TextView) elemento.findViewById(R.id.moduloTareas);
        TextView nombreTarea = (TextView) elemento.findViewById(R.id.nombreTarea);
        TextView fecha = (TextView) elemento.findViewById(R.id.fechaEntregaTarea);

        //asociamos elementos

        nombreModulo.setText(String.valueOf(lista.get(position).getModulo()));
        nombreTarea.setText(lista.get(position).getTarea());
        //fecha.setText(String.valueOf(lista.get(position).getFechaEntrega()));


        return elemento;
    }
}
