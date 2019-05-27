package com.example.gameofthronestabs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.gameofthronestabs.R;
import com.example.gameofthronestabs.banco.BDSQLiteHelper;
import com.example.gameofthronestabs.model.Livro;


public class AdicionarLivroActivity extends AppCompatActivity {

    private BDSQLiteHelper bd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_livro);
        bd = new BDSQLiteHelper(this);

        final EditText url = (EditText) findViewById(R.id.etURL );
        final EditText name = (EditText) findViewById(R.id.etName );
        final EditText isbn = (EditText) findViewById(R.id.etIsbn );
        final EditText country = (EditText) findViewById(R.id.etCountry );
        final EditText publisher = (EditText) findViewById(R.id.etPublisher );
        final EditText mediatype = (EditText) findViewById(R.id.etMediaType );
        final EditText released = (EditText) findViewById(R.id.etReleased );
        final EditText numberofpages = (EditText) findViewById(R.id.etNumberOfPages );

        Button novo = (Button) findViewById(R.id.btnAdd);
        novo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Livro livro = new Livro();
                livro.setUrl(url.getText().toString());
                livro.setName(name.getText().toString());
                livro.setIsbn(isbn.getText().toString());
                livro.setCountry(country.getText().toString());
                livro.setPublisher(publisher.getText().toString());
                livro.setMediaType(mediatype.getText().toString());
                livro.setReleased(released.getText().toString());
                livro.setNumberOfPages(Integer.parseInt(numberofpages.getText().toString()));
                bd.addLivro(livro);
                Intent intent = new Intent(AdicionarLivroActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
