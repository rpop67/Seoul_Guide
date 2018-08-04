package com.example.android.abnd_tour_guide_app.Others;

/**
 * Created by Akanksha_Rajwar on 31-07-2018.
 */

public class languageCard {
    private String korean;
    private String english;
    private int soundRes;

    public languageCard(String kor, String eng, int res) {
        korean = kor;
        english = eng;
        soundRes = res;
    }

    public String getKorean() {
        return korean;
    }

    public String getEnglish() {
        return english;
    }

    public int getSoundRes() {
        return soundRes;
    }


}
