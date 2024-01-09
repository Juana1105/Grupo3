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
        super(contexto, R.layout.fragment_tareas, lista);
        this.lista=lista;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater mostrado = LayoutInflater.from(getContext());
        View elemento = mostrado.inflate(R.layout.tareas, parent, false);



        TextView nombreAsignatura = (TextView) elemento.findViewById(R.id.asignaturaTareas);
        TextView nombreTarea = (TextView) elemento.findViewById(R.id.nombreTarea);
        TextView fecha = (TextView) elemento.findViewById(R.id.fechaEntregaTarea);

        //asociamos elementos

        nombreAsignatura.setText(String.valueOf(lista.get(position).getAsignatura()));
        nombreTarea.setText(lista.get(position).getTituloTarea());
        fecha.setText(String.valueOf(lista.get(position).getFechaEntrega()));


        return elemento;
    }
}
