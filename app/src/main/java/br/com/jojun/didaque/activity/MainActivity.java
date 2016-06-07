package br.com.jojun.didaque.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.jojun.didaque.R;
import br.com.jojun.didaque.adapter.ApostilasAdapter;
import br.com.jojun.didaque.model.Apostila;

public class MainActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)

        mAdapter = new ApostilasAdapter(MainActivity.this, getApostilas());
        mRecyclerView.setAdapter(mAdapter);

    }

    public List<Apostila> getApostilas() {

        List<Apostila> list = new ArrayList<>();
        list.add(new Apostila("Princípios Elementares", R.drawable.principios));
        list.add(new Apostila("Propósito Eterno de Deus", R.drawable.proposito));
        list.add(new Apostila("Vida em Cristo", R.drawable.cristo));
        list.add(new Apostila("Comunhão com Deus", R.drawable.comunhao));
        list.add(new Apostila("Evangelho do Reino", R.drawable.evangelho));
        list.add(new Apostila("Família", R.drawable.familia));
        return list;
    }
}
