package com.example.gameofthronestabs.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.gameofthronestabs.R;
import com.example.gameofthronestabs.model.Livro;

import java.util.ArrayList;
import java.util.Locale;


public class LivrosOfflineAdapter extends ArrayAdapter<Livro> {

    private final Context context;
    private final ArrayList<Livro> elementos;

    public LivrosOfflineAdapter(Context context, ArrayList<Livro> elementos) {
        super(context, R.layout.item_livro, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_livro, parent, false);
        TextView titulo = (TextView) rowView.findViewById(R.id.txtName);
        TextView isbn = (TextView) rowView.findViewById(R.id.txtIsbn);
        TextView url = (TextView) rowView.findViewById(R.id.txtURL);
        TextView numberofpages = (TextView) rowView.findViewById(R.id.txtnumberofpages);
        titulo.setText(elementos.get(position).getName());
        isbn.setText(elementos.get(position).getIsbn());
        url.setText(elementos.get(position).getUrl());
        numberofpages.setText(Integer.toString(elementos.get(position).getNumberOfPages()));
        return rowView;
    }
}

