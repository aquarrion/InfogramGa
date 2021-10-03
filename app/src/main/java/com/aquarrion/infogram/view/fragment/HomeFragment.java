package com.aquarrion.infogram.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.aquarrion.infogram.R;
import com.aquarrion.infogram.adapter.CardViewAdapter;
import com.aquarrion.infogram.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //toolbar
        showToolBar(getString(R.string.title_home_fragment), false, view);

        //recyclerView
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        //layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //adapter
        CardViewAdapter cardViewAdapter = new CardViewAdapter(buidImages(), R.layout.cardview_image, getActivity());
        recyclerView.setAdapter(cardViewAdapter);


        return view;
    }
    public void showToolBar(String titulo, boolean botonSubir, View view){
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);


        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }

    //creamos la lista de imagene
    public ArrayList<Image> buidImages(){
        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("https://th.bing.com/th/id/R.26bf1225572d805b6055d680528ce180?rik=6vL3Qxu0wKKiVA&riu=http%3a%2f%2ffotos.e-veracruz.mx%2fturismo_23.jpg&ehk=240UYp7RFdkOg9FozN46fJ%2fMzcMKPQQm6n4J%2fV4%2bWgU%3d&risl=&pid=ImgRaw&r=0","Carlos Valdivia","2 dias","1 me gusta"));
        images.add(new Image("https://th.bing.com/th/id/R.58dc196848c318e0f30c06e555df9004?rik=KAYuaL0peNg%2fmw&pid=ImgRaw&r=0","Luis Perez","3 dias","6 me gusta"));
        images.add(new Image("https://www.aseguratuviaje.com.mx/images/Lugares-turisticos-de-China.jpg","Fernando Torrico","5 dias","3 me gusta"));
        images.add(new Image("https://negociosperu.pe/assets/sources/articulos/contenido/junio%202019/turismo%20y%20gastronomia/destacados07-06-19.jpg","Maria Torrez","7 dias","4 me gusta"));
        images.add(new Image("https://th.bing.com/th/id/R.ed5bddcd18fbadfc823aa769e266aaf7?rik=%2f9vBqrmE%2fkd6zA&riu=http%3a%2f%2fwww.planetacurioso.com%2fwp-content%2fuploads%2f2014%2f10%2fdiaynoche-imagenes-720x420.jpg&ehk=edNhsPmTS5fXo99uQ0HoQectwS9rlbd7EIXsSmnqV08%3d&risl=&pid=ImgRaw&r=0","Rolando Morales","1 dias","5 me gusta"));
        images.add(new Image("https://th.bing.com/th/id/R.839df82660d8d68046ea539a6e93ef35?rik=bz0voPtC%2bnc%2bDQ&pid=ImgRaw&r=0","William Jaimes","4 dias","12 me gusta"));
        images.add(new Image("https://th.bing.com/th/id/R.ffa7d7ebb9a9521f5cf71e23479668a0?rik=Ziipz6fkHvfqPg&pid=ImgRaw&r=0","Roberto Paniagua","3 dias","13 me gusta"));
        images.add(new Image("https://th.bing.com/th/id/R.647f59704b38f5cb87d9b37dd99b70b5?rik=ABrckDzjKEZ45Q&pid=ImgRaw&r=0","Lorena Herrera","6 dias","15 me gusta"));
        images.add(new Image("https://th.bing.com/th/id/R.ef2bc6c95fc7211e56bdf375a7aa8b70?rik=%2fdYUBKzUZ2J%2f3A&pid=ImgRaw&r=0","Gary Aguilar","5 dias","33 me gusta"));
        images.add(new Image("https://th.bing.com/th/id/R.9b82e5229c844d022bf865f03c16c419?rik=Up3qebNuyxwx2Q&riu=http%3a%2f%2frh-destinations.com%2fes%2fwp-content%2fuploads%2fsites%2f6%2f2014%2f06%2fParisFrancia_RoyalHoliday.jpg&ehk=%2fF0GfC%2fblis5PdloqBEqXOBwHCcREaytDD7fIB0olQ4%3d&risl=&pid=ImgRaw&r=0","Sara Ralde","4 dias","50 me gusta"));


        return images;
    }
}