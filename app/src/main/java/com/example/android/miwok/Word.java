package com.example.android.miwok;

public class Word {
    private String english_translation;
    private  String miwok_translation;

    public Word(String english_translation, String miwok_translation) {
        this.english_translation = english_translation;
        this.miwok_translation = miwok_translation;
    }


    public String getEnglish_translation() {
        return english_translation;
    }

    public void setEnglish_translation(String english_translation) {
        this.english_translation = english_translation;
    }

    public String getMiwok_translation() {
        return miwok_translation;
    }

    public void setMiwok_translation(String miwok_translation) {
        this.miwok_translation = miwok_translation;
    }
}
