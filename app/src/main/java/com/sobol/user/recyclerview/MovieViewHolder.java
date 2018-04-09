package com.sobol.user.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    TextView titleTextView;
    ImageView titleImageView;

    public MovieViewHolder(View itemView) {
        super(itemView);

        titleTextView = itemView.findViewById(R.id.text);
        titleImageView = itemView.findViewById(R.id.image);

    }
}
