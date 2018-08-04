package com.example.android.abnd_tour_guide_app.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.android.abnd_tour_guide_app.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeGuide extends Fragment {
    ImageView b1;
    ImageView b2;
    ImageView b3;
    ImageButton b4;
    ImageButton b5;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_guide, container, false);

        b1 = view.findViewById(R.id.button1);
        b2 = view.findViewById(R.id.button2);
        b3 = view.findViewById(R.id.button3);
        b4 = view.findViewById(R.id.button4);
        b5 = view.findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new Attractions();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.layoutMain, mFragment).commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new FoodJoints();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.layoutMain, mFragment).commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new Hotels();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.layoutMain, mFragment).commit();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new Shopping();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.layoutMain, mFragment).commit();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new Language();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.layoutMain, mFragment).commit();
            }
        });


        String urlShopping = "http://www.thetummytrain.com/wp-content/uploads/2017/03/SHOPPING.jpg";
        String urlHotel = "https://www.boboandchichi.com/wp-content/uploads/Where-to-stay-in-seoul-cover-787x525.jpg";
        String urlFood = "https://burpple-1.imgix.net/boxes/image/24-bestkorean-41-png_505902_original";


        Glide.with(this)
                .load(urlFood)
                .into(b2);
        Glide.with(this)
                .load(urlHotel)
                .into(b3);

        Glide.with(this)
                .load(urlShopping)
                .into(b4);

        return view;
    }
}
