package com.newaphasiatalkhelper.AphasiaTalkHelperEng.helpers;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.speech.tts.TextToSpeech;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Tum on 12/24/2017 AD.
 */

//Text to Speech
public class Speaker {

    static TextToSpeech tts;
    static ArrayList<String> q;

    public static void onStart(final Context context){
        q = new ArrayList<>();
        tts = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS){
                    tts.setLanguage(new Locale("EN"));
                    while(!q.isEmpty()){
                        speak(q.get(0));
                        q.remove(0);
                    }
                }
                else if(context instanceof Activity) {
                    new AlertDialog.Builder(context)
                            .setTitle("TextToSpeech Engine Not Found")
                            .setMessage("Dowload At Play Store")
                            .setPositiveButton("Install Now", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Activity a = (Activity) context;
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse("market://details?id=com.google.android.tss"));
                                    a.startActivity(intent);
                                }
                            })
                            .setNegativeButton("later",null)
                            .show();
                }
            }
        });
    }

    public static void onStop(){
       // tts.shutdown();
       // tts =null;
       // q = null;
    }

    public static void speak(final String msg){
        if(tts == null){
            q.add(msg);
        }else{
            tts.speak(msg, TextToSpeech.QUEUE_ADD,null);
        }

    }

}
