package com.newaphasiatalkhelper.AphasiaTalkHelperEng.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.newaphasiatalkhelper.AphasiaTalkHelperEng.R;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.FirebaseModel;

/**
 * Created by Tum on 10/29/2017 AD.
 */
//Create Toolbar

public class BaseActivity extends AppCompatActivity {
    protected Toolbar toolbar;
    View logo, btnSos,btnInfo, userProfile, goHome;
    FirebaseModel fb;

    public void initToolbar() {
        fb = new FirebaseModel(this);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        userProfile = findViewById(R.id.btn_user_profile);
        goHome = findViewById(R.id.btn_gohome);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        final Activity a = this;
        logo = findViewById(R.id.iv_toolbar_logo);
        btnSos = findViewById(R.id.btn_sos);
        btnInfo = findViewById(R.id.btn_info);
        logo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(a, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                fb.logoaphasiaActivity();
            }
        });

        goHome.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(a, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                fb.gohomefromToolbarActivity();
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BaseActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });
        btnSos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BaseActivity.this, SosActivities.class);
                startActivity(intent);
            }
        });

        userProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BaseActivity.this, UserHome.class);
                startActivity(intent);
            }
        });
    }

        public void hideUserProfileIcon(){
            userProfile.setVisibility(View.GONE);
    }


    @Override
    protected void onStart() {
        super.onStart();
        fb.init();
    }
}
