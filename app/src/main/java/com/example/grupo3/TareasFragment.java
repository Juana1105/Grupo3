package com.example.grupo3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import Tablas.Tarea;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TareasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TareasFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TareasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TareasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TareasFragment newInstance(String param1, String param2) {
        TareasFragment fragment = new TareasFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tareas, container, false);


        ArrayList<Tarea> listaTareas=new ArrayList<>();
        listaTareas.add(new Tarea(1, 2, "Actividades Tema 1", "Sumas y Restas", "2024/01/12"));
        listaTareas.add(new Tarea(2,3,"Actividades Tema 5", "Origen Universo", "2024/02/10"));
        listaTareas.add(new Tarea(3,2,"Actividades Tema 3","Reading 1", "2024/02/20"));
        listaTareas.add(new Tarea(4,4,"Actividades Tema 2", "Charlie le chat", "2024/03/20"));
        listaTareas.add(new Tarea(5,5,"Actividades Tema 6","Dios bb", "2024/01/15"));
        listaTareas.add(new Tarea(6,3,"Actividades Tema 2", "El arte del gusano", "2024/01/22"));
        listaTareas.add(new Tarea(7,4,"Actividades Tema 1", "Edad Media", "2024/01/24"));
        listaTareas.add(new Tarea(8,7,"Actividades Tema 3", "Numeros binarios", "2024/01/25"));

        ListView contenedorVista = view.findViewById(R.id.listaTareas);


        AdaptadorTareas miAdaptador = new AdaptadorTareas(contenedorVista.getContext(),listaTareas);
        contenedorVista.setAdapter(miAdaptador);

        return view;
    }
}