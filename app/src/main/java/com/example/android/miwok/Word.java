package com.example.android.miwok;

public class Word {
    private String english_translation;
    private  String miwok_translation;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int image_resource_id;

    private int audio_resource_id;

    public Word(String english_translation, String miwok_translation, int image_resource_id, int audio_resource_id) {
        this.english_translation = english_translation;
        this.miwok_translation = miwok_translation;
        this.image_resource_id = image_resource_id;
        this.audio_resource_id = audio_resource_id;
    }

    public Word(String english_translation, String miwok_translation, int audio_resource_id) {
        this.english_translation = english_translation;
        this.miwok_translation = miwok_translation;
        this.audio_resource_id = audio_resource_id;
    }

    public int getAudio_resource_id() {
        return audio_resource_id;
    }

    public int getImage_resource_id() {
        return image_resource_id;
    }

    public void setImage_resource_id(int image_resource_id) {
        this.image_resource_id = image_resource_id;
    }

    public void setAudio_resource_id(int audio_resource_id) {
        this.audio_resource_id = audio_resource_id;
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

    public boolean hasImage() {
        return imageResourceId == NO_IMAGE_PROVIDED;
    }
}
