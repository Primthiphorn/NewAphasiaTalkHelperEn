package com.newaphasiatalkhelper.AphasiaTalkHelperEng.models;

import android.content.Context;

import com.newaphasiatalkhelper.AphasiaTalkHelperEng.MainApplication;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.R;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.dao.ItemDao;

/**
 * Created by Tum on 11/19/2017 AD.
 */

public class FeelListModel extends ListModel{

    private static FeelListModel instance;

    public FeelListModel(Context context) {
        super(context);
    }

    public static FeelListModel getInstance(){
        if (instance==null){
            instance = new FeelListModel(MainApplication.context);
        }
        return instance;
    }


    {
        data = new ItemDao[]{
                new ItemDao(1, "pain", R.mipmap.feel_pain,2001),
                new ItemDao(2, "poo", R.mipmap.feel_khee).speech("I feel poo."),
                new ItemDao(3, "pee", R.mipmap.feel_pee).speech("I feel pee"),
                new ItemDao(4, "hungry", R.mipmap.feel_hungry).speech("I feel hungry."),
                new ItemDao(5, "tried", R.mipmap.feel_tired).speech("I feel tried."),
                new ItemDao(6, "hot", R.mipmap.feel_hot).speech("I feel hot."),
                new ItemDao(7, "cold", R.mipmap.feel_cold).speech("I feel cold."),
                new ItemDao(8, "stress", R.mipmap.feel_stress).speech("I feel stress."),
                new ItemDao(9, "sleepy", R.mipmap.feel_sleepy).speech("I feel sleepy."),
                new ItemDao(10, "happy", R.mipmap.feel_happy).speech("I feel happy."),
                new ItemDao(11, "sad", R.mipmap.feel_sad).speech("I feel sad."),
                new ItemDao(12, "scare", R.mipmap.feel_scare).speech("I feel scare."),
                new ItemDao(13, "angry", R.mipmap.feel_angry).speech("I feel angry."),
                new ItemDao(14, null, null),
                new ItemDao(15, "itchy", R.mipmap.feel_scratch).speech("I feel itchy"),
                new ItemDao(16, null, null),

        };


        dataSub.put(2001,new ItemDao[]{
                new ItemDao(200101, "head", R.mipmap.feel_pain_head).speech("I have a headache."),
                new ItemDao(200102, "eye", R.mipmap.feel_pain_eye).speech("I have an eyeache."),
                new ItemDao(200103, "ear", R.mipmap.feel_pain_ear).speech("I have an earache."),
                new ItemDao(200104, "nose", R.mipmap.feel_pain_nose).speech("I have a nasal pain."),
                new ItemDao(200105, "teeth", R.mipmap.feel_pain_teeth).speech("I have a toothache."),
                new ItemDao(200106, "neck", R.mipmap.feel_pain_neck).speech("I have a neck pain."),
                new ItemDao(200107, "chest", R.mipmap.feel_pain_chest).speech("I have a chest pain."),
                new ItemDao(200108, "shoulder", R.mipmap.feel_pain_shoulder).speech("I have a shoulder pain."),
                new ItemDao(200109, "back", R.mipmap.feel_pain_back).speech("I have a backache."),
                new ItemDao(200110, "arm", R.mipmap.feel_pain_arm).speech("I have an arm ache."),
                new ItemDao(200111, "elbow", R.mipmap.feel_pain_elbow).speech("I have an elbow pain."),
                new ItemDao(200112, "hand", R.mipmap.feel_pain_hand).speech("I have a hand pain."),
                new ItemDao(200113, "stomach", R.mipmap.feel_pain_stomach).speech("I have a stomachache."),
                new ItemDao(200114, "waist", R.mipmap.feel_pain_waist).speech("I have a waist pain."),
                new ItemDao(200115, "hip", R.mipmap.feel_pain_sapoke).speech("I have a hip pain."),
                new ItemDao(200116, "bottom", R.mipmap.feel_pain_bottom).speech("I have a bottom pain."),
                new ItemDao(200117, "leg", R.mipmap.feel_pain_leg).speech("I have a leg pain."),
                new ItemDao(200118, "knee", R.mipmap.feel_pain_knee).speech("I have a knee ache."),
                new ItemDao(200119, "foot", R.mipmap.feel_pain_feet).speech("I have a foot pain."),
                new ItemDao(200120, null, null),});
    }


}
