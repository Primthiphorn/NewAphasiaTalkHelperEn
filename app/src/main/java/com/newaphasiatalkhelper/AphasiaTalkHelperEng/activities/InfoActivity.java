package com.newaphasiatalkhelper.AphasiaTalkHelperEng.activities;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.newaphasiatalkhelper.AphasiaTalkHelperEng.R;

public class InfoActivity extends AppCompatActivity {

    VideoView vdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        vdo = (VideoView) findViewById(R.id.vdo);

        vdo.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vdo);
        vdo.setMediaController(new MediaController(this));
        vdo.start();

        vdo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                vdo.start();
            }
        });

    }
}
