package com.sobol.user.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    View itemView;
    TextView titleTextView;
    ImageView titleImageView;

    public MovieViewHolder(View itemView) {
        super(itemView);

        this.itemView = itemView;

        titleTextView = itemView.findViewById(R.id.text);
        titleImageView = itemView.findViewById(R.id.image);

    }
}
