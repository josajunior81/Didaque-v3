package br.com.jojun.didaque.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
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

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by josafasouza on 07/06/16.
 */
public class ListaApostilasAdapter extends RecyclerView.Adapter<ListaApostilasAdapter.ViewHolder> {

    private List<Apostila> mDataset;
    private static Context context;
    private static Activity activity;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ImageView mImageView;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.text_apostila);
            mImageView = (ImageView) v.findViewById(R.id.img_apostila);

            v.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    Intent intent = new Intent(activity, ApostilaActivity.class);
                    if (Build.VERSION.SDK_INT >= 21) {
                        startActivity(activity, intent,
                                ActivityOptions.makeSceneTransitionAnimation(activity).toBundle());
                    } else {
                        startActivity(activity, intent, null);
                    }
                }
            });
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ListaApostilasAdapter(Activity activity, Context context, List<Apostila> myDataset) {
        this.context = context;
        mDataset = myDataset;
        this.activity = activity;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ListaApostilasAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_lista_apostilas, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset.get(position).nome);
        holder.mImageView.setImageResource(mDataset.get(position).imagem);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
