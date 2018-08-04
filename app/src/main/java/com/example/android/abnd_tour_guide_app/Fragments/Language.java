package com.example.android.abnd_tour_guide_app.Fragments;


import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.abnd_tour_guide_app.FinalActivity;
import com.example.android.abnd_tour_guide_app.Others.InfoAdapter;
import com.example.android.abnd_tour_guide_app.Others.InfoCard;
import com.example.android.abnd_tour_guide_app.Others.languageAdapter;
import com.example.android.abnd_tour_guide_app.Others.languageCard;
import com.example.android.abnd_tour_guide_app.R;

import java.io.IOException;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Language extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attractions, container, false);
        Toast.makeText(getActivity(),
                "Click on Korean phrases to listen to pronunciation", Toast.LENGTH_LONG).show();


        //About
        final ArrayList<languageCard> songPlayList = new ArrayList<languageCard>();


        songPlayList.add(new languageCard("Annyeong·haseyo", "Hello", R.raw.audio1));
        songPlayList.add(new languageCard("Na·neun kir·eur ireo·seumnida", "I am lost", R.raw.audio10));
        songPlayList.add(new languageCard("Yeongeo·reur har su iseumni·kka?", "Can you speak English?", R.raw.audio6));
        songPlayList.add(new languageCard("Ye / ne", "Yes", R.raw.audio19));
        songPlayList.add(new languageCard("Aniyo", "No", R.raw.audio20));
        songPlayList.add(new languageCard("Hyeon·geum·inchulgi", "ATM?", R.raw.audio11));
        songPlayList.add(new languageCard("Eoneu jjok?", "Which way?", R.raw.audio14));
        songPlayList.add(new languageCard("Kamsamnida", "Thank you", R.raw.audio2));
        songPlayList.add(new languageCard("Shillye·hamnida", "Excuse me?", R.raw.audio18));
        songPlayList.add(new languageCard("Choesong·hamnida", "I am sorry", R.raw.audio3));
        songPlayList.add(new languageCard("Keugeos·eun eolmaimni·kka?", "How much is it?", R.raw.audio4));
        songPlayList.add(new languageCard("Hwajangshir·eun eodie iseumni·kka?", "Where is the bathroom?", R.raw.audio5));
        songPlayList.add(new languageCard("Towajuseyo!", "Help", R.raw.audio9));
        songPlayList.add(new languageCard("Gga·ggajushi·ge·sseoyo?", "Can you give me a discount?", R.raw.audio8));
        songPlayList.add(new languageCard("Yeogiseo inteones·eur iyong·har su iseumni·kka?", "Can I get internet access here?", R.raw.audio7));
        songPlayList.add(new languageCard("Ihaehar su eop·seumnida", "I don't understand", R.raw.audio12));
        songPlayList.add(new languageCard("Kyeong·chal", "Police", R.raw.audio13));
        songPlayList.add(new languageCard("Cheoneun …-eseo wa·seumnida", "I am from..", R.raw.audio15));
        songPlayList.add(new languageCard("Sajineur jjigeodo toemni·kka?", "Can I take a photo?", R.raw.audio16));
        songPlayList.add(new languageCard("Mueos·eur chucheon·hashimni·kka?", "What do you recommend?", R.raw.audio17));


        //songAdapter object
        languageAdapter adapter = new languageAdapter(getContext(), songPlayList);
        final ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int res = songPlayList.get(position).getSoundRes();
                // TODO Auto-generated method stub
                MediaPlayer translator = new MediaPlayer();
                translator = MediaPlayer.create(getActivity(), res);
                translator.start();
            }
        });

        return view;
    }

}
