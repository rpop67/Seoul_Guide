package com.example.android.abnd_tour_guide_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.android.abnd_tour_guide_app.Fragments.Attractions;
import com.example.android.abnd_tour_guide_app.Fragments.FoodJoints;
import com.example.android.abnd_tour_guide_app.Fragments.HomeGuide;
import com.example.android.abnd_tour_guide_app.Fragments.Hotels;
import com.example.android.abnd_tour_guide_app.Fragments.Language;
import com.example.android.abnd_tour_guide_app.Fragments.Shopping;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    //adding trial
    ImageView b1;
    ImageView b2;
    ImageView b3;
    ImageButton b4;
    ImageButton b5;

    //trial

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //adding trial
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new Attractions();
                getSupportFragmentManager().beginTransaction().replace(R.id.layoutMain, mFragment).commit();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new FoodJoints();
                getSupportFragmentManager().beginTransaction().replace(R.id.layoutMain, mFragment).commit();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new Hotels();
                getSupportFragmentManager().beginTransaction().replace(R.id.layoutMain, mFragment).commit();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new Shopping();
                getSupportFragmentManager().beginTransaction().replace(R.id.layoutMain, mFragment).commit();

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new Attractions();
                getSupportFragmentManager().beginTransaction().replace(R.id.layoutMain, mFragment).commit();

            }
        });


        String urlShopping = "http://www.thetummytrain.com/wp-content/uploads/2017/03/SHOPPING.jpg";
        String urlAttractions = "https://saranghaetravel.files.wordpress.com/2016/07/the-ultimate-guide-10-amazing-things-to-do-in-seoul-south-korea-sabrina-iovino-via-just1wayticket.jpg";
        String urlHotel = "https://www.boboandchichi.com/wp-content/uploads/Where-to-stay-in-seoul-cover-787x525.jpg";
        String urlFood = "https://burpple-1.imgix.net/boxes/image/24-bestkorean-41-png_505902_original";


        Glide.with(this)
                .load(urlFood)
                .into(b2);
        Glide.with(this)
                .load(urlHotel)
                .into(b3);
        Glide.with(this)
                .load(urlAttractions)
                .into(b5);
        Glide.with(this)
                .load(urlShopping)
                .into(b4);


        //adding trial
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_food) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.layoutMain, new FoodJoints());
            ft.commit();

        } else if (id == R.id.nav_home) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.layoutMain, new HomeGuide());
            ft.commit();

        } else if (id == R.id.nav_attractions) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.layoutMain, new Attractions());
            ft.commit();

        } else if (id == R.id.nav_hotels) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.layoutMain, new Hotels());
            ft.commit();


        } else if (id == R.id.nav_shopping) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.layoutMain, new Shopping());
            ft.commit();


        } else if (id == R.id.nav_language) {
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.layoutMain, new Language());
            ft.commit();


        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
