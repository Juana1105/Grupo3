package com.example.grupo3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import Tablas.Modulo;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ModuloFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ModuloFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    //instanciamos el contenedor
    private ListView contenedorVista;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ModuloFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AsignaturasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ModuloFragment newInstance(String param1, String param2) {
        ModuloFragment fragment = new ModuloFragment();
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
        //Inflamos los dos layouts
        View view = inflater.inflate(R.layout.fragment_asignaturas, container, false);
       // View cardsView = inflater.inflate(R.layout.cards, container, false);
        //Quitamos de momento que sea clicable porque falla y falta pensar la parte visual
        ArrayList<Modulo> listaModulos=new ArrayList<>();
        listaModulos.add(new Modulo("Programacion","DAM","Jose"));
        listaModulos.add(new Modulo("Acceso datos","DAW", "Jose"));
        listaModulos.add(new Modulo("PSP","DAM", "Jose"));
        listaModulos.add(new Modulo("Bases de datos","DAW", "Jose"));
        listaModulos.add(new Modulo("Desarrollo interfaces","DAM", "Jose"));
        listaModulos.add(new Modulo("Ingles","DAW", "Jose"));
        listaModulos.add(new Modulo("Sistemas gestion","DAM", "Jose"));

        contenedorVista = view.findViewById(R.id.listaCards);
        AdaptadorCards miAdaptador = new AdaptadorCards(contenedorVista.getContext(),listaModulos);
        contenedorVista.setAdapter(miAdaptador);

        //ID de la CardView dentro de cardsView (cards.xml)
       /* CardView contenedorCard=cardsView.findViewById(R.id.contenedorCard);
        contenedorCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaModuloActivity= new Intent(view.getContext(), ModuloActivity.class);
                startActivity(pantallaModuloActivity);
            }
        });

        // Agrega cardsView al contenedor de fragment_asignaturas.xml
       ViewGroup mainLayout = view.findViewById(R.id.layoutAsignaturas);
        mainLayout.addView(cardsView);*/



        FloatingActionButton botonNuevoModulo=(FloatingActionButton) view.findViewById(R.id.floatingABmodulo);
        botonNuevoModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaNuevoModulo=new Intent(getContext(), ActivityNuevoModulo.class);
                startActivity(pantallaNuevoModulo);
            }
        });




        return view;
    }

}
