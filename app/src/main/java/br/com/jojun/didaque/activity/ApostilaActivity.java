package br.com.jojun.didaque.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import br.com.jojun.didaque.R;
import br.com.jojun.didaque.adapter.ApostilaAdapter;
import br.com.jojun.didaque.util.ApostilaUtil;

/**
 * Created by Josafá on 23/06/2016.
 */
public class ApostilaActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apostila);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_apostila);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new GridLayoutManager(this, 1);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)

        mAdapter = new ApostilaAdapter(this, ApostilaUtil.getApostilas());
        mRecyclerView.setAdapter(mAdapter);
    }
}
