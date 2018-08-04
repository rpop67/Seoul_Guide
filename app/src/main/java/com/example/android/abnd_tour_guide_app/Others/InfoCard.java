package com.example.android.abnd_tour_guide_app.Others;

/**
 * Created by Akanksha_Rajwar on 31-07-2018.
 */

public class InfoCard {
    private String imgRes;
    private String location;
    private String whatCuisine;
    private String whereLocation;


    private static final String NO_IMG_PROVIDED = "NO";
    private String costStatement = NO_IMG_PROVIDED;
    private String cuisineFlag = NO_IMG_PROVIDED;
    private String locationFlag = NO_IMG_PROVIDED;


    public InfoCard(String loc, String res) {
        imgRes = res;
        location = loc;

    }

    public InfoCard(String loc, String res, String cost) {
        imgRes = res;
        location = loc;
        costStatement = cost;
    }

    public InfoCard(String loc, String res, String cost, String cuisine, String whereAt) {
        imgRes = res;
        location = loc;
        costStatement = cost;
        whereLocation = whereAt;
        whatCuisine = cuisine;
        cuisineFlag = cuisine;
        locationFlag = whereAt;

        //To check if content is sent as parameter or not

    }

    public String getWhereLocation() {
        return whereLocation;
    }

    public String getWhatCuisine() {
        return whatCuisine;
    }

    public String getResourceID() {
        return imgRes;
    }

    public String getLocation() {
        return location;
    }

    public String getCostStatement() {
        return costStatement;
    }

    public boolean hasCost() {
        return costStatement != NO_IMG_PROVIDED;
    }

    public boolean hasCuisine() {
        return cuisineFlag != NO_IMG_PROVIDED;
    }

    public boolean hasLocation() {
        return locationFlag != NO_IMG_PROVIDED;
    }
}
