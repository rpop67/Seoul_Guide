package com.example.android.abnd_tour_guide_app.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.abnd_tour_guide_app.FinalActivity;
import com.example.android.abnd_tour_guide_app.Others.InfoAdapter;
import com.example.android.abnd_tour_guide_app.Others.InfoCard;
import com.example.android.abnd_tour_guide_app.R;

import java.net.URL;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Hotels extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attractions, container, false);

        final ArrayList<InfoCard> songPlayList = new ArrayList<InfoCard>();

        String url1 = "https://pix10.agoda.net/hotelImages/692/6922/6922_17021022280050918857.jpg?s=1024x768";
        String url2 = "https://s-ec.bstatic.com/images/hotel/max1024x768/901/90144318.jpg";
        String url3 = "https://pix10.agoda.net/hotelImages/432/43230/43230_16072515290044909595.jpg?s=1024x768";
        String url4 = "http://tmarkhotel.com/wp-content/uploads/2017/08/%ED%8B%B0%EB%A7%88%ED%81%AC2111.jpg";
        String url5 = "https://d1nabgopwop1kh.cloudfront.net/hotel-asset/10000001003069503_wh_5";
        String url6 = "https://exp.cdn-hotels.com/hotels/6000000/5450000/5441000/5440963/5440963_108_z.jpg";
        String url7 = "https://media-cdn.tripadvisor.com/media/photo-s/04/c8/8d/a2/caption.jpg";


        final String[] Address = new String[7];
        Address[0] = "322 Sowol-ro, Hannam-dong, Yongsan-gu, Seoul, South Korea";
        Address[1] = "12 Sapyeong-daero 58-gil, Seocho-dong, Seocho-gu, Seoul, South Korea";
        Address[2] = "61 Myeongdong-gil, Myeongdong 1(il)-ga, Jung-gu, Seoul, South Korea";
        Address[3] = "15 Chungmu-ro, Chungmuro 3(sam)-ga, Jung-gu, Seoul, South Korea";
        Address[4] = "362 Samil-daero, Myeong-dong, Jung-gu, Seoul, South Korea";
        Address[5] = "22 Myeongdong 9-gil, Euljiro 2(i)-ga, Jung-gu, Seoul, South Korea";
        Address[6] = "2 Toegye-ro 20-gil, Namsandong 2(i)-ga, Jung-gu, Seoul, South Korea";

        songPlayList.add(new InfoCard("Grand Hyatt", url1, "Rs 16000", "Near Namsan Tower", "Namsangongwon-gil"));
        songPlayList.add(new InfoCard("OCloud Hotel", url2, "Rs 7000", "Near Geyonbukgong Palace", "161 Sajik-ro"));
        songPlayList.add(new InfoCard("Royal Hotel Seoul", url3, "Rs 6500", "Near Myeong Dong market", "Jung-gu"));
        songPlayList.add(new InfoCard("T-Mark Hotel", url4, "Rs 8500", "Near Seoul city wall", "Hanyangdoseong"));
        songPlayList.add(new InfoCard("Lotte City Hotel", url5, "Rs 9000", "Near Cheonggyecheon", "Sinseol-dong"));
        songPlayList.add(new InfoCard("Hotel Skypark", url6, "Rs 11800", "Near DongDaemun Design", "281 Eulji-ro"));
        songPlayList.add(new InfoCard("Pacific Hotel", url7, "Rs 14000", "Near Banpo Bridge", "Banpodong"));

        final String[] phoneArray = new String[7];
        phoneArray[0] = "82-2-006-8248";
        phoneArray[1] = "42-0-733-5358";
        phoneArray[2] = "86-5-675-5348";
        phoneArray[3] = "72-1-576-1348";
        phoneArray[4] = "92-2-130-0348";
        phoneArray[5] = "82-8-755-2248";
        phoneArray[6] = "81-2-450-5648";

        final String[] opens = new String[7];
        opens[0] = "Always Open";
        opens[1] = "Counter open at 7 am";
        opens[2] = "Always Open";
        opens[3] = "Counter open at 6 am";
        opens[4] = "Always Open";
        opens[5] = "Counter open at 5 am";
        opens[6] = "Always Open";

        //songAdapter object
        InfoAdapter adapter = new InfoAdapter(getContext(), songPlayList);
        final ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                // Getting listview click value into String variable.
                String url = songPlayList.get(position).getResourceID();
                String Title = songPlayList.get(position).getLocation();
                String cost = songPlayList.get(position).getCostStatement();
                String sendContent = "NO";
                String sendPhone = phoneArray[position];
                String sendOpens = opens[position];
                int siteIndex = position;
                String sendAddress = Address[position];

                Intent intent = new Intent(getActivity(), FinalActivity.class);

                // Sending value to another activity using intent.
                intent.putExtra("urlTake", url);
                intent.putExtra("titleTake", Title);
                intent.putExtra("costTake", cost);
                intent.putExtra("contentTake", sendContent);
                intent.putExtra("phoneTake", sendPhone);
                intent.putExtra("openTake", sendOpens);
                intent.putExtra("addTake", sendAddress);
                intent.putExtra("siteTake", siteIndex);

                startActivity(intent);

            }
        });

        return view;
    }

}
