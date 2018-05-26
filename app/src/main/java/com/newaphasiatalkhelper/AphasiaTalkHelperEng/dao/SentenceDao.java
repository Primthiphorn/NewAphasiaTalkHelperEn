package com.newaphasiatalkhelper.AphasiaTalkHelperEng.dao;

/**
 * Created by blinkblinkk on 1/2/2018 AD.
 */

public class SentenceDao {
    public String sentence ="";
    public int id=0, freq=0;

    public SentenceDao() {
    }

    public SentenceDao(String sentence, int id, int freq) {
        this.sentence = sentence;
        this.id = id;
        this.freq = freq;
    }
}
