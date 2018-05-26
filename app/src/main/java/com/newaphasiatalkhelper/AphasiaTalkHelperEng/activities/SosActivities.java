package com.newaphasiatalkhelper.AphasiaTalkHelperEng.activities;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.newaphasiatalkhelper.AphasiaTalkHelperEng.R;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.FirebaseModel;

public class SosActivities extends AppCompatActivity {

    View btnStop;
    VideoView vv;
    MediaPlayer mediaPlayer;
    FirebaseModel fb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fb = new FirebaseModel(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos_activities);
        mediaPlayer = MediaPlayer.create(this,R.raw.sirensound);
        mediaPlayer.start();
        fb.sosActivity();



        btnStop = findViewById(R.id.btn_stop);

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();


            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        vv = (VideoView) findViewById(R.id.video_view);
        vv.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.giphy);
        vv.setMediaController(new MediaController(this));
        vv.start();

        vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {

                vv.start();

            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.stop();
    }
}
