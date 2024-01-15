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

import Tablas.Modulo;

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

        TextView nombreModulo= (TextView) elemento.findViewById(R.id.nombreModulo);
        TextView cicloModulo= (TextView) elemento.findViewById(R.id.ciclo);

        nombreModulo.setText(lista.get(position).getModulo());
        cicloModulo.setText(lista.get(position).getCiclo());


        return elemento;
    }
}
