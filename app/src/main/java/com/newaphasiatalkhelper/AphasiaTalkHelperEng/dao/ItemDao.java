package com.newaphasiatalkhelper.AphasiaTalkHelperEng.dao;

import android.support.annotation.NonNull;

/**
 * Created by Tum on 11/19/2017 AD.
 */

public class ItemDao implements Comparable<ItemDao>{

    public static final int NO_IMG = -1;
    public int id;
    public String title;
    public String speech;
    public Integer icon;
    public int freq;
    public Integer subId = null;

    public ItemDao() {

    }

    public ItemDao(int id, String title, Integer icon) {
        this.id = id;
        this.title = title;
        this.speech = title;
        this.icon = icon;
        freq = 0;
    }


    public ItemDao(int id, String title, String speech, Integer icon) {
        this.id = id;
        this.title = title;
        this.speech = speech;
        this.icon = icon;
        freq = 0;
    }


    public ItemDao(int id, String title, Integer icon, int subId) {
        this.id = id;
        this.title = title;
        this.icon = icon;
        freq =0;
        this.subId = subId;
    }

    public  boolean isOk(){
        return id>0 && title!= null && icon!= null;
    }


    public ItemDao speech(String speech){
        this.speech = speech;
        return this;
    }


    @Override
    public int compareTo(@NonNull ItemDao o) {
        return -(freq - o.freq);
    }
}
