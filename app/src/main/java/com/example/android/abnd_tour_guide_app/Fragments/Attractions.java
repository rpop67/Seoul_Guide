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

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Attractions extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attractions, container, false);

        //urls
        String url1 = "https://thumbs.dreamstime.com/b/colorful-city-lights-cheonggyecheon-stream-park-crowd-night-seoul-south-korea-95711177.jpg";
        String url2 = "https://thumbs.dreamstime.com/b/cherry-blossom-spring-gyeongbokgung-palace-seoul-korea-69607830.jpg";
        String url3 = "https://c1.staticflickr.com/9/8165/6954838436_5177abe263_b.jpg";
        String url4 = "https://halfprice.agency/wp-content/uploads/2017/08/seoul_city_wall_1.jpg";
        String url5 = "https://images.myguide-cdn.com/seoul/companies/n-seoul-tower/large/n-seoul-tower-96031.jpg";
        String url6 = "https://failedarchitecture.com/wp-content/uploads/2016/04/ddpheader-1500x750.jpg";
        String url7 = "https://i.pinimg.com/originals/65/d1/27/65d12780128ea48c7b40e77b5070d07d.jpg";

        //url end

        //About
        final String[] Content = new String[7];
        Content[4] = "The Hanyangdoseong or literally the Seoul City Wall is a series of walls made of stone, wood and other materials, built to protect the city of Seoul against" +
                " invaders. The wall was first built in 1396 to defend and show the boundaries of the city, surrounding Hanyang \n\nTHINGS TO DO :\n\n" +
                "You can visit Seoul City Walk Museum.No charges for entry.\n\nTrick Eye Museum is just 10km away from Seoul City Wall";

        Content[0] = "It is a modern public recreation space in downtown Seoul, South Korea. The massive urban renewal project is on the site of a stream that flowed before the rapid post-war economic development caused it to be covered by transportation infrastructure. The $900 million project initially" +
                " attracted much public criticism but, after opening in 2005, has become popular among residents and tourists.\n\n" +
                "THINGS TO DO :\n\nMust attend Lantern Festival on weekends starting at 9 pm.\n\nCatch a glimpse of live entertainment";

        Content[1] = "The Namsan Tower or Seoul Tower, is a communication and observation tower located on Namsan Mountain in central Seoul, South Korea. " +
                "At 236m, it marks the second highest point in Seoul. It attracts thousands of tourists and locals every year, especially during nighttime when the" +
                " tower lights up. Photographers enjoy the panoramic view the tower offers.\n\nTHINGS TO DO :\n" +
                "The \"Locks of Love\" is a popular location for people to hang locks that symbolize eternal love, and has been depicted in many Korean television" +
                " shows, dramas, and movies for this reason.\n\nThe Wishing Pond can be found on the second floor of the tower, where people throw coins into the pond " +
                "wishing for eternal love.\nThe fifth floor houses a French restaurant known as N Grill.\n\nThe N Seoul Tower puts on many different shows, including the \"Reeds of Light\" and \"Shower of Light\" ";

        Content[3] = "Myeongdong is one of Seoul's main shopping districts featuring mid-to-high priced retail stores and international brand outlets, including Lacoste, " +
                "Polo Ralph Lauren, H&M, Zara, Forever 21, Bulgari and Louis Vuitton, as well as Korean cosmetics brands such as Nature Republic, Missha, The Face Shop and Skin Food." +
                "\nIt is a particularly popular area for young people and tourists as a center for fashion and sight-seeing.Several large shopping centers and department " +
                "stores are in the district including Lotte Department Store, Shinsegae Department Store, Migliore, M Plaza, and Noon Square.";

        Content[2] = " The largest of the Five Grand Palaces built by the Joseon dynasty, Gyeongbokgung served as the home of Kings of the Joseon dynasty, the Kings' households, " +
                "as well as the government of Joseon.It also houses the National Palace Museum of Korea and the National Folk Museum within the premises of the complex.The building uniquely shows heavy influence of Chinese architecture instead of traditional Korean palace architecture.[16] Its side walls were entirely constructed in brick, a method commonly employed by the contemporary Chinese, and its roof formations, interior screens, and " +
                "columns also show Chinese influences. Its architecture possibly was meant to give it an exotic appearance.\n\n" +
                "THINGS TO DO :\nThe royal changing of the guard ceremony is held in front of the main gate every hour from 10:00 to 15:00\n\n" +
                "From October, Gyeongbokgung starts its night season, from 7PM to 10PM.\n\nTradional Korean gardens";

        Content[5] = "The bridge is on top of Jamsu Bridge, forming the upper half of a double-deck bridge; it is the first double deck bridge built in South Korea.The Moonlight Rainbow Fountain (Korean: 달빛무지개 분수) is the world's longest bridge fountain[6] that set a Guinness " +
                "World Record with nearly 10,000 LED nozzles that run along both sides that is 1,140m long, shooting out 190 tons of water per minute.\n\nTHINGS TO DO :" +
                "\n\nMoonlight Rainbow fountain : When the clock points to eight, the fountain sprays the skies to paint a giant rainbow, and music fills the air to match the color changes.";

        Content[6] = "The landmark is the centerpiece of South Korea's fashion hub and popular tourist destination, Dongdaemun, featuring a walkable park on its roofs, " +
                "large global exhibition spaces, futuristic retail stores and restored parts of the Seoul fortress.The DDP has 3 underground levels and 4 above-ground levels, and the main building is 280 meters long. The building is equipped with " +
                "diverse public spaces including exhibition hall, conference hall, design museum, the design lab," +
                " the academy hall, media center, seminar room, Dongdaemun History and Culture Park, the designers lounge," +
                " and the design market.";
        //About-end

        final String[] phoneArray = new String[7];
        phoneArray[0] = "82-2-006-8248";
        phoneArray[1] = "42-0-733-5358";
        phoneArray[2] = "86-5-675-5348";
        phoneArray[3] = "72-1-576-1348";
        phoneArray[4] = "92-2-130-0348";
        phoneArray[5] = "82-8-755-2248";
        phoneArray[6] = "81-2-450-5648";

        final ArrayList<InfoCard> songPlayList = new ArrayList<InfoCard>();

        songPlayList.add(new InfoCard("CHEONGGYECHEON", url1, "NO", "Always open", "Sinseol-dong"));
        songPlayList.add(new InfoCard("N SEOUL TOWER", url5, "NO", "Entry: 9AM-12AM", "Namsangongwon-gil"));
        songPlayList.add(new InfoCard("GYEONGBOKGONG PALACE", url2, "NO", "Entry: 7AM-5PM", "161 Sajik-ro"));
        songPlayList.add(new InfoCard("MYEONG DONG", url3, "NO", "Entry: 10AM-5AM", "Jung-gu"));
        songPlayList.add(new InfoCard("SEOUL CITY WALL", url4, "NO", "Entry: 8AM-7PM", "Hanyangdoseong"));
        songPlayList.add(new InfoCard("BANPO BRIDGE", url7, "NO", "Entry: Always open", "Banpodong"));
        songPlayList.add(new InfoCard("DONGDAEMUN DESIGN PLAZA", url6, "NO", "Entry: 9AM-11PM", "281 Eulji-ro"));

        final String[] Address = new String[7];
        Address[0] = "Cheonggyecheon-Ro, Sinseol-Dong, Jongno-Gu, Seoul, South Korea";
        Address[1] = "105 Namsangongwon-gil, Yongsan 2(i)ga-dong, Yongsan-gu, Seoul, South Korea";
        Address[2] = "C161 Sajik-ro, Sejongno, Jongno-gu, Seoul, South Korea";
        Address[3] = "CMyeong-dong, Jung-gu, Seoul, South Korea";
        Address[4] = "283 Yulgok-ro, Jongno 6(yuk)-ga, Jongno-gu, Seoul, South Korea";
        Address[5] = "Banpo 2(i)-dong, Seoul, South Korea";
        Address[6] = "281 Eulji-ro, Euljiro 7(chil)-ga, Jung-gu, Seoul, South Korea";


        final String[] opens = new String[7];
        opens[0] = "Always open";
        opens[1] = "Timing : 9am - 12am";
        opens[2] = "Timing : 7am - 5pm";
        opens[3] = "Timing : 10am - 5am";
        opens[4] = "Timing : 8am - 7pm";
        opens[5] = "Timing : Always open";
        opens[6] = "Timing : 9am - 11pm";

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
                String sendContent = Content[position];
                String sendPhone = phoneArray[position];
                String sendOpens = opens[position];
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

                startActivity(intent);

            }
        });

        return view;
    }

}
