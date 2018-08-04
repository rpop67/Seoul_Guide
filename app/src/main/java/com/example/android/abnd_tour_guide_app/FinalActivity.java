package com.example.android.abnd_tour_guide_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.net.MalformedURLException;
import java.net.URL;

public class FinalActivity extends AppCompatActivity {

    ImageView imgView;
    TextView textView;
    TextView contentView;
    TextView costView;
    RatingBar ratingView;
    TextView phoneView;
    TextView openView;
    TextView addView;
    TextView hotelView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);


        String Title = getIntent().getStringExtra("titleTake");
        String url = getIntent().getStringExtra("urlTake");
        String cost = getIntent().getStringExtra("costTake");
        Integer flagValue = getIntent().getIntExtra("flagTake", -1);
        String content = getIntent().getStringExtra("contentTake");
        String phone = getIntent().getStringExtra("phoneTake");
        String opens = getIntent().getStringExtra("openTake");
        int siteIndex=getIntent().getIntExtra("siteTake",0);

        imgView = findViewById(R.id.final_image);
        textView = findViewById(R.id.final_title);
        ratingView = findViewById(R.id.ratingBar);
        contentView = findViewById(R.id.final_content);
        costView = findViewById(R.id.final_cost);
        phoneView = findViewById(R.id.final_phone);
        openView = findViewById(R.id.final_open);
        addView = findViewById(R.id.final_address);
        hotelView = findViewById(R.id.final_content_hotel);

        String buf = getIntent().getStringExtra("addTake");

        SpannableString spanStr = new SpannableString(buf);
        spanStr.setSpan(new UnderlineSpan(), 0, spanStr.length(), 0);
        addView.setText(spanStr);

        addView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="
                        + addView.getText().toString()));
                startActivity(geoIntent);
            }
        });

        if (phone == "NO") {
            phoneView.setVisibility(View.GONE);
        } else {
            phoneView.setText(phone);
            phoneView.setVisibility(View.VISIBLE);
        }

        if (flagValue == 1) {

            costView.setText(cost);
        } else {
            costView.setVisibility(View.GONE);
        }

        if (content.equals("NO")==true) {
            hotelView.setVisibility(View.VISIBLE);
            contentView.setVisibility(View.GONE);
             //add hotel site here

            String text="Click here";
            if(siteIndex==0)
            {
                text = "<a href=\"https://seoul.grand.hyatt.com/en/hotel/home.html\">Book your room now</a>";
            }
            else if(siteIndex==1)
            {
               text="<a href=\"http://www.ocloudhotel.com/html/main.asp \">Book your room now</a>";

            }
            else if(siteIndex==2)
            {
                text="<a href=\"http://www.royal.co.kr/\">Book your room now</a>";
            }
            else if(siteIndex==3)
            {
                text="<a href=\"http://tmarkhotel.com/en/\">Book your room now</a>";
            }
            else if(siteIndex==4)
            {
                text="<a href=\"http://www.lottehotel.com/city/guro/en/Default.asp\">Book your room now</a>";
            }
            else if(siteIndex==5)
            {
                text="<a href=\"https://www.skyparkhotel.com/html/accommdation/accom1_tab1_01.asp\">Book your room now</a>";
            }
            else if(siteIndex==6)
            {
                text="<a href=\"http://pacific.seoultophotels.com/en/\">Book your room now</a>";
            }

            hotelView.setText(Html.fromHtml(text));
            hotelView.setMovementMethod(LinkMovementMethod.getInstance());

        } else {
            contentView.setVisibility(View.VISIBLE);
            hotelView.setVisibility(View.GONE);
            contentView.setText(content);
        }
        textView.setText(Title);
        openView.setText(opens);
        imgView = findViewById(R.id.final_image);
        Glide.with(this)
                .load(url)
                .into(imgView);
    }


}
