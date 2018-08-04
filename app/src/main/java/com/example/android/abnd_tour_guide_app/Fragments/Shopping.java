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
public class Shopping extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attractions, container, false);

        final ArrayList<InfoCard> songPlayList = new ArrayList<InfoCard>();


        String url1 = "https://zone-trt-bhxtb9xxzrrdpzhqr.netdna-ssl.com/wp-content/uploads/2016/11/Ewha-Womans-University-Shopping-Street-860x571.jpg";
        String urlnew1 = "https://anakjajan.files.wordpress.com/2017/03/dscf7634.jpg?w=474&h=316";
        String url2 = "https://skoreatravelsite.files.wordpress.com/2016/09/wpid-tumblr_m7sefrmsro1qkyzm3o1_1280.jpg?w=1280&h=768&crop=1";
        String url3 = "https://zone-trt-bhxtb9xxzrrdpzhqr.netdna-ssl.com/wp-content/uploads/2016/11/Dongdaemun-market-seoul-860x561.jpg";
        String url4 = "https://zone-trt-bhxtb9xxzrrdpzhqr.netdna-ssl.com/wp-content/uploads/2016/12/Myeongdong-seoul-shopping-860x574.jpg";
        String url5 = "https://zone-trt-bhxtb9xxzrrdpzhqr.netdna-ssl.com/wp-content/uploads/2016/12/Namdaemun-Market-seoul-860x571.jpg";
        String url6 = "https://zone-trt-bhxtb9xxzrrdpzhqr.netdna-ssl.com/wp-content/uploads/2016/12/insadong-seoul-860x573.jpg";
        String url7 = "https://d20vvx1que2zyx.cloudfront.net/wp-content/uploads/2016/01/12165841/668867_image2_1.jpg";
        String url = "http://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg";

        final String[] opens = new String[7];
        opens[0] = "Opens 12pm – 9pm";
        opens[1] = "Opens 1pm - 11pm";
        opens[2] = "Opens 10am - 5am";
        opens[3] = "Opens 10:30am - 10pm";
        opens[4] = "Opens 5pm - 11pm(Except Sundays)";
        opens[5] = "Opens 9:30am - 8:30pm";
        opens[6] = "Opens 10am - 10pm";

        final String[] phoneArray = new String[7];
        phoneArray[0] = "82-2-006-8248";
        phoneArray[1] = "42-0-733-5358";
        phoneArray[2] = "86-5-675-5348";
        phoneArray[3] = "72-1-576-1348";
        phoneArray[4] = "92-2-130-0348";
        phoneArray[5] = "82-8-755-2248";
        phoneArray[6] = "81-2-450-5648";

        final String[] Address = new String[7];
        Address[0] = "52 Ewhayeodae-gil, Sinchon-dong, Seodaemun-gu, Seoul, South Korea";
        Address[1] = "HONGDAE SHOPPING AREA";
        Address[2] = "Dongdaemun-gu, Seoul, South Korea";
        Address[3] = "Myeong-dong, Jung-gu, Seoul, South Korea";
        Address[4] = "21 Namdaemunsijang 4-gil, Namchang-dong, Jung-gu, Seoul, South Korea";
        Address[5] = "Insa-dong, Jongno-gu, Seoul, South Korea";
        Address[6] = "지하 200 Sinbanpo-ro, Banpo-dong, Seocho-gu, Seoul, South Korea";

        songPlayList.add(new InfoCard("SEWHA SHOPPING STREET", url1, "Budget Shopping", "Opens 12pm – 9pm", "10, Ewhayeodae"));
        songPlayList.add(new InfoCard("HONGDAE SHOPPING AREA", url2, "Budget shopping", "Opens 1pm-11pm", "Near Hongik University"));
        songPlayList.add(new InfoCard("DONGDAEMUN CENTRAL", url3, "Wholesale market", "Opens 10am-5am", "Dongaemun subway 4"));
        songPlayList.add(new InfoCard("MYEONGDONG", url4, "A bit expensive", "Opens 10:30am -10pm", "Myeong-dong 8-gil"));
        songPlayList.add(new InfoCard("NAMDAEMUN MARKET", url5, "General market", "Opens 5pm-11pm(Except Sundays)", "21 Namdaemunsijang"));
        songPlayList.add(new InfoCard("INSADONG", url6, "Art and antiques", "Opens 9:30am - 8:30pm", " Insadong-gil"));
        songPlayList.add(new InfoCard("GANGNAM GOTO MALL", url7, "Variety shopping", "Opens 10am - 10pm", "200 Sinbanpo-ro"));

        final String[] contentArray = new String[7];
        contentArray[0] = "\nReasonable and prices can be negotiated.\n\nA wealth of fashion choice that enhances the experience of a sophisticated shopper: The area around Ewha Womans University that forms Ewha Womans University Fashion Street is more than just a venue for cheap clothes. It also incorporates designer shops, boutique stores, shopping malls into its business life to perfect itself. So ladies, you can go there and hunt for good bargains that can please different corners of a lady inside you.";

        contentArray[1] = "\nReasonable and prices can be negotiated\n\nA place to hunt for indie fashion items: If you love sweet and feminine clothes, shop at Ewha Womans University shopping street. But if you favor indie fashion, then Hongdae Shopping Area is for you. Some compare Hongdae with Harajuku in Japan, so there must be a reason. Freedom of self-expression is the spirit of this youthful area. And indie fashion is a part of the culture there.\n\nTHINGS TO DO: \nSaturday Hongdae Free Market (2pm to 6pm) is a weekly event for hand-made products: Don’t miss out on this if you have a weekend in Seoul. Hongik University with its famous arts programmes drenches Hongdae atmosphere in art.";

        contentArray[2] = "\nIndie Shopping\n\nImagine an area with 5 shopping districts filled with 26 shopping malls, 30,000 specialty shops and a night" +
                " market. Whether you want to buy just a few items or purchase in bulk, Dongdaemun always welcomes you.\n\nTHINGS TO DO:\n\n" +
                "Pay a visit between 10pm to 5am because the best deals on clothes and shoes are waiting for you at the night market, which is bustling with activity from 10pm to 5am everyday.";

        contentArray[3] = "\nKnown for skin care products\n\nFrequently known as the mecca of skincare, this district is occupied with a dizzying array of beauty stores, with brands such as Skinfood, MISSHIA, " +
                "Etude House and many more. Korean skincare products are always available at competitive prices." +
                "Who doesn’t love free samples?! In Myeong-dong, vendors frequently lure you into their stores with free face masks, sample creams and cosmetics.\n\nTHINGS TO DO :\n\nYou" +
                "can collect free samples and try out first, then buy the best one. ";

        contentArray[4] = "\nNamdaemun Market is the largest traditional market in Korea with shops selling various goods. All products are sold at affordable prices and the stores in this area also function as wholesale markets." +
                "\n" + "Most of the goods are made directly by the storeowners. Namdaemun Market is even open overnight, from 11:00pm to 4:00am, and is crowded with retailers from all over the country. When day breaks, the site of busy shoppers bustling around the market creates a unique scene that attracts tourists worldwide. Namdaemun Market sells a variety of clothes, glasses, kitchenware, toys, mountain gear, fishing equipment, stationery, fine arts, accessories, hats, carpets, flowers, ginseng, and imported goods";

        contentArray[5] = "\nKnown for tea stalls\n\nHome to many beautiful wooden tea-houses, you cannot leave Insadong without trying a cup! Try Dawon, one of Seoul’s oldest tea-houses for an authentic" +
                " visit. \nSit on the heated floor, and sip on some of Seoul’s finest tea. Prices start at 7,000 won." +
                " \n\nBrowse through the multitude of vendors, selling Korean art, porcelain, handicrafts, pottery and traditional stationary at inexpensive prices.";


        contentArray[6] = "\nKnown for street food\n\nThe market houses a multitude of retailers that offer clothing items for all age groups at very low prices. With articles starting at only 3,000 won ($2)," +
                " you can find something for everyone in the family without breaking the bank.Drool over the lines of food-stalls, offering delicious Korean delicacies to the hungry shoppers.\nTHINGS TO DO :\n\n Quench your thirst with fresh fruit juice " +
                "(2,000 won, 1.7 dollars).\n\n Satisfy your hunger with Kalguksu (handmade noodle soup, 4,000 won, 3.4 dollars).";


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
                String sendContent = contentArray[position];
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
