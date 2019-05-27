package com.example.gameofthronestabs.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.gameofthronestabs.R;

public class MainActivity extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabLivroFragment(), "Livros");
        adapter.addFragment(new TabPersonagemFragment(), "Personagens");
        adapter.addFragment(new TabCasaFragment(), "Casas");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }


}