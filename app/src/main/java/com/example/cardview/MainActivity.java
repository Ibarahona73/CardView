package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCantante;
    private RecyclerViewAdapter adapterCantante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCantante=(RecyclerView) findViewById(R.id.recicleCantante);
        recyclerViewCantante.setLayoutManager(new LinearLayoutManager(this));

        adapterCantante = new RecyclerViewAdapter(obtenerCantantes());
        recyclerViewCantante.setAdapter(adapterCantante);
    }

    public List<Cantante> obtenerCantantes() {
        List<Cantante> cantante = new ArrayList<>();
        cantante.add(new Cantante("Enrique Iglesias","Español",R.drawable.enrique_iglesias_pr));
        cantante.add(new Cantante("Laura Pausini","Italiana",R.drawable.lp));
        cantante.add(new Cantante("Michael Jackson","Estadounidense",R.drawable.michael));
        return cantante;
    }

}