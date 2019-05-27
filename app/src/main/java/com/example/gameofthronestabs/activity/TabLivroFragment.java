package com.example.gameofthronestabs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.gameofthronestabs.R;
import com.example.gameofthronestabs.adapter.LivrosOfflineAdapter;
import com.example.gameofthronestabs.banco.BDSQLiteHelper;
import com.example.gameofthronestabs.model.Livro;

import java.util.ArrayList;

public class TabLivroFragment extends Fragment {
    private BDSQLiteHelper bd;
    ArrayList<Livro> listaLivros;
    SearchView search = null ;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_livro,
                container,
                false);
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AdicionarLivroActivity.class);
                startActivity(intent);
            }
        });
        bd = new BDSQLiteHelper(getActivity());

        ListView lista = (ListView)  view.findViewById(R.id.lvLivros);
        listaLivros = bd.getAllLivros();
        final LivrosOfflineAdapter adapter = new LivrosOfflineAdapter(getActivity(),  listaLivros);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(getActivity(), EditarLivroActivity.class);

                intent.putExtra("ID", listaLivros.get(position).getId());
                startActivity(intent);
            }
        });


        return view;

    }

}