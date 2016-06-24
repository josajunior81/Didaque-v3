package br.com.jojun.didaque.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import br.com.jojun.didaque.R;
import br.com.jojun.didaque.activity.ApostilaActivity;
import br.com.jojun.didaque.model.Apostila;
import br.com.jojun.didaque.model.Licao;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by Josafá on 23/06/2016.
 */
public class ApostilaAdapter extends RecyclerView.Adapter<ApostilaAdapter.ViewHolder> {

    private List<Licao> mDataset;
    private static Context context;
    private static Activity activity;

    public ApostilaAdapter(ApostilaActivity apostilaActivity, List<Apostila> apostilas) {
        activity = apostilaActivity;
        context = apostilaActivity;
        mDataset = apostilas.get(0).licoes;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvTitulo;
        public TextView tvTexto;
        public ViewHolder(View v) {
            super(v);
            tvTitulo = (TextView) v.findViewById(R.id.text_titulo_ponto);
            tvTexto = (TextView) v.findViewById(R.id.text_conteudo_ponto);
        }
    }

    @Override
    public ApostilaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_apostila, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ApostilaAdapter.ViewHolder holder, int position) {
        holder.tvTitulo.setText(mDataset.get(position).titulo);
        holder.tvTexto.setText(mDataset.get(position).texto);
    }

    @Override
    public int getItemCount()  {
        return mDataset.size();
    }
}
