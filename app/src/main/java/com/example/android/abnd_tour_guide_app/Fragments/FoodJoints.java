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
public class FoodJoints extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attractions, container, false);

        final String[] phoneArray = new String[6];
        phoneArray[0] = "82-2-006-8248";
        phoneArray[1] = "42-0-776-5358";
        phoneArray[2] = "86-5-676-5348";
        phoneArray[3] = "72-1-576-1348";
        phoneArray[4] = "92-2-136-0348";
        phoneArray[5] = "82-8-756-2248";


        final String[] contentArray = new String[6];
        contentArray[0] = "\nServes Korean,Continental and Thai\n\nThis cafe is recommended to those who want to hang out with their friends over a simple cup of coffee. No doubt that their bakery is simply amazing but food is on the extremely higher priced side and the quantity does not comply with the prices." +
                "But the quantity of food is not sufficient for a single person as well !It is half of what is being offered at other good cafes .\n\nMust Try :\n" +
                "";
        contentArray[1] = "\nServes Korean food only\nNon Veg\n\nHighly recommended for tourisits who want to taste the traditional Korean food." +
                "This taste is the best place give your tongue a scrumptious of dumplings,kimchi and the famous soup meat noodles.";
        contentArray[2] = "\nServes Korean and Continental\nVeg+NonVeg\n\nIt is famous for its continental food.Irony,right? But Continental food tastes heaven.Grilled" +
                "pork sandwich and pasta sizzeler is a must eat dish from this restaurant.";
        contentArray[3] = "\nServes Italian and desserts\nVeg+Non Veg\n\nFrom ambience of this cafe to service quality.Everything is perfect. Interior is so magnificent," +
                "even the food tastes so scrumptious.There is a tradition in this restaurants that first-time customers will get Soju" +
                "(korean beer). So,yeah! Just grab the Soju along with mouth watering food.";
        contentArray[4] = "\nServes Continental\nVeg\n\nFamous for its theme and super delicious continental food.Irony,right? But Continental food tastes heaven.Grilled" +
                "pork sandwich and pasta sizzeler is a must eat dish from this restaurant";
        contentArray[5] = "\nServes Korean\nNon Veg\n\nIt serves delicious food and it is highly recommended for tourisits who want to taste the traditional Korean food." +
                "This taste is the best place give your tongue a scrumptious of dumplings,kimchi and the famous soup meat noodles.";

        final ArrayList<InfoCard> songPlayList = new ArrayList<InfoCard>();
        String url1 = "http://danielfooddiary.com/wp-content/uploads/2015/12/kyoja2.jpg";
        String url2 = "https://sethlui.com/wp-content/uploads/2014/07/20140707_135031-817x459.jpg";
        String url3 = "http://www.curiousnut.com/wp-content/uploads/2015/10/Savory-Kimchi-Pancake-Feat-T.jpg";
        String url4 = "http://sg.articles.images.travelog.me/wp-content/uploads/2016/10/17162115/13653190_490969237766110_5342625146390829115_o.jpg";
        String url5 = "http://pheurontay.com/wp-content/uploads/2014/05/2014-05-31-06.59.05-1.jpg";
        String url6 = "https://anakjajan.files.wordpress.com/2016/09/dscf8703.jpg?w=474&h=316";

        songPlayList.add(new InfoCard("Park Cafe", url4, "Cost for two: 2000", "Korean,Continental,Thai", "Yeoidio"));
        songPlayList.add(new InfoCard("Myeongdong Kyoja", url1, "Cost for two: 1900", "Korean", "29, Myeongdong"));
        songPlayList.add(new InfoCard("On the Grill", url2, "Cost for two: 2500", "Korean,Continental", "258-7 Itaewon-dong"));
        songPlayList.add(new InfoCard("Wood & Brick Jonggak", url3, "Cost for two: 1200", "Dessert,Italian", " 5-2 Jae-dong"));
        songPlayList.add(new InfoCard("Twosome Place Apgujeong", url5, "Cost for two: 2000", "Continental", "602 Sinsa-dong"));
        songPlayList.add(new InfoCard("Caffe Bene Euilji", url6, "Cost for two: 1550", "Korean", "Seongbuk-gu"));

        final String[] Address = new String[6];
        Address[0] = "22 Apgujeong-ro 60-gil, Cheongdam-dong, Gangnam-gu, Seoul, South Korea";
        Address[1] = "29 Myeongdong 10-gil, Myeongdong 2(i)-ga, Jung-gu, Seoul, South Korea";
        Address[2] = "258-7 Itaewon-dong, Yongsan-gu, Seoul, South Korea";
        Address[3] = "5-2 Jae-dong, Jongno-gu, Seoul, South Korea";
        Address[4] = "85 Saemunan-ro, Sajik-dong, Jongno-gu, Seoul, South Korea";
        Address[5] = "625-2 Donam-dong, Seongbuk-gu, Seoul, South Korea";


        final String[] opens = new String[7];
        opens[0] = "Opens 10 am – 9 pm";
        opens[1] = "Opens 1 pm - 12 am";
        opens[2] = "Opens 10:30 am - 4:30 am";
        opens[3] = "Opens 10:30 am - 11:30 pm";
        opens[4] = "Opens 5 pm - 11 pm(Except Mondays)";
        opens[5] = "Opens 9:30 am - 8:30 pm";


        //songAdapter object
        InfoAdapter adapter = new InfoAdapter(getContext(), songPlayList);
        final ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                int what;

                if (songPlayList.get(position).hasCost()) {
                    what = 1;
                } else {
                    what = -1;
                }


                // TODO Auto-generated method stub
                // Getting listview click value into String variable.
                String url = songPlayList.get(position).getResourceID();
                String Title = songPlayList.get(position).getLocation();
                String cost = songPlayList.get(position).getCostStatement();
                String sendContent = contentArray[position];
                String sendPhone = phoneArray[position];
                String sendOpens = opens[position];
                String sendAddress = Address[position];
                Intent intent = new Intent(getActivity(), FinalActivity.class);

                // Sending value to another activity using intent.
                intent.putExtra("urlTake", url);
                intent.putExtra("titleTake", Title);
                intent.putExtra("costTake", cost);
                intent.putExtra("flagTake", what);
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

