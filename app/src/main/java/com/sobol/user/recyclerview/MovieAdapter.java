package com.sobol.user.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import static java.lang.System.load;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    static final String[] MOVIES_TITLES = new String[]{"Coco", "Star Wars: The Last Jedi", "Ready Player One", "Black Panther"};
    static final String[] MOVIES_POSTERS = new String[]{"https://www.kinopoisk.ru/film/tayna-koko-2017-679486/", "/kOVEVeg59E0wsnXmF9nrh6OmWII.jpg", "/pU1ULUq8D3iRxl1fdX2lZIzdHuI.jpg", "/uxzzxijgPIY7slzFvMotPv8wjKA.jpg"};
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
        String textTitle = MOVIES_TITLES[position];
        String imageTitle = MOVIES_POSTERS[position];
        holder.titleTextView.setText(textTitle);
        Glide
                .with(this.context)
                .load(imageTitle)
                .into(holder.titleImageView);
    }

    @Override
    public int getItemCount() {
        return MOVIES_TITLES.length;
    }
}
