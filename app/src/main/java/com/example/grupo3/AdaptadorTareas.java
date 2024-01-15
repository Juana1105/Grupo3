package com.example.grupo3;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Calendar;

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


        TextView nombreModulo = elemento.findViewById(R.id.moduloTareas);
        TextView nombreTarea = elemento.findViewById(R.id.nombreTarea);
        TextView fechaSeleccionada = elemento.findViewById(R.id.fechaEntregaTarea);

        //asociamos elementos
        nombreModulo.setText(lista.get(position).getModulo());
        nombreTarea.setText(lista.get(position).getModulo());
        fechaSeleccionada.setText(lista.get(position).getTarea());


        return elemento;
    }
}
