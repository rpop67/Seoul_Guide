package com.example.android.abnd_tour_guide_app.Others;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
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

public class languageAdapter extends ArrayAdapter<languageCard> {
    public languageAdapter(Context context, ArrayList<languageCard> infoCards) {
        super(context, 0, infoCards);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_guide, parent, false);
        }
        languageCard currentWord = getItem(position);

        //Typecasting is no longer required form API 26
        TextView koreanTextView = listItemView.findViewById(R.id.kTranslateView);
        koreanTextView.setText(currentWord.getKorean());


        TextView englishTextView = listItemView.findViewById(R.id.eTranslateView);
        englishTextView.setText(currentWord.getEnglish());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView


        return listItemView;
    }


}
