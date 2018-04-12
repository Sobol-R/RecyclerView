package com.sobol.user.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import static java.lang.System.load;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    Context context;
    public MovieAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.image, parent, false);
        MovieViewHolder vH = new MovieViewHolder(view);
        return vH;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.titleTextView.setText(DataBase.MOVIES[position].title);

        Glide
                .with(this.context)
                .load(DataBase.MOVIES[position].postrepath)
                .into(holder.titleImageView);

        final Movie movie = DataBase.MOVIES[position];
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMovieAtivity(movie);
            }
        });
    }
    private void startMovieAtivity(Movie movie) {
        Intent intent = new Intent(context, Main2Activity.class);
        intent.putExtra("MOVIE", movie);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return DataBase.MOVIES.length;
    }
}
