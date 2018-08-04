package com.example.android.abnd_tour_guide_app.Others;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.android.abnd_tour_guide_app.R;

import java.util.ArrayList;

/**
 * Created by Akanksha_Rajwar on 31-07-2018.
 */

public class InfoAdapter extends ArrayAdapter<InfoCard> {
    public InfoAdapter(Context context, ArrayList<InfoCard> infoCards) {
        super(context, 0, infoCards);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_info, parent, false);
        }
        InfoCard currentWord = getItem(position);
        //Typecasting is no longer required form API 26
        TextView locTextView = listItemView.findViewById(R.id.locationName);
        locTextView.setText(currentWord.getLocation());

        ImageView thumbnailView = listItemView.findViewById(R.id.thumbnail);
        //thumbnailView.setImageResource(currentWord.getResourceID());
        Glide.with(this.getContext())
                .load(currentWord.getResourceID())
                .apply(new RequestOptions()
                        .placeholder(R.drawable.loading))
                .into(thumbnailView);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        TextView costTextView = listItemView.findViewById(R.id.costText);
        TextView locationTextView = listItemView.findViewById(R.id.whereAt);
        TextView cuisineTextView = listItemView.findViewById(R.id.cuisine);

        if (currentWord.hasCost()) {
            costTextView.setText(currentWord.getCostStatement());
            costTextView.setVisibility(View.VISIBLE);
        } else {
            costTextView.setVisibility(View.GONE);
        }

        if (currentWord.hasLocation()) {
            locationTextView.setText(currentWord.getWhereLocation());
            locationTextView.setVisibility(View.VISIBLE);

        } else {
            locationTextView.setVisibility(View.GONE);

        }
        if (currentWord.hasCuisine()) {
            cuisineTextView.setText(currentWord.getWhatCuisine());
            cuisineTextView.setVisibility(View.VISIBLE);

        } else {
            cuisineTextView.setVisibility(View.GONE);

        }


        return listItemView;
    }


}
