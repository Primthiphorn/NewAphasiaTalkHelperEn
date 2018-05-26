package com.newaphasiatalkhelper.AphasiaTalkHelperEng.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.newaphasiatalkhelper.AphasiaTalkHelperEng.R;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.dao.SentenceDao;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.dao.ItemDao;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.helpers.Speaker;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.FavoriteModel;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.FeelListModel;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.FirebaseModel;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.FrequencyModel;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.ListModel;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.WantListModel;

public class ItemActivity extends BaseActivity {

    LinearLayout mainLayout;
    ListModel model;
    View speak, btnHome;
    TextView title;
    ImageView img,addFav;
    FavoriteModel favoriteModel;
    FrequencyModel frequencyModel;
    boolean isFav;

    FirebaseModel fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        initToolbar();

        fb = new FirebaseModel(this);

        frequencyModel = new FrequencyModel(this);
        favoriteModel = new FavoriteModel(this);
        speak = findViewById(R.id.btn_speech);
        addFav = (ImageView) findViewById(R.id.btn_add_fav);
        title = (TextView) findViewById(R.id.item_text);
        img = (ImageView) findViewById(R.id.item_image);
        btnHome = findViewById(R.id.btn_home);
        mainLayout = (LinearLayout) findViewById(R.id.main_layout);






        int index = getIntent().getIntExtra("index", -1);
        int subId = getIntent().getIntExtra("subId", -1);

        String type = getIntent().getStringExtra("type");

        if(index==-1){
            finish();
        }

        if("want".equals(type)){
            model = WantListModel.getInstance();
            mainLayout.setBackgroundResource(R.color.bg_want);
        }
        else if("feel".equals(type)){
            model = FeelListModel.getInstance();
            mainLayout.setBackgroundResource(R.color.bg_feel);
        }


        final ItemDao item = subId>0? model.getsub(subId, index): model.get(index);

        title.setText(item.speech);
        fb.enterItemActivity(item.speech);

        img.setImageDrawable(getResources().getDrawable(item.icon));
        SentenceDao dao = favoriteModel.search(item.speech);
        if(dao == null){
            isFav = false;
            addFav.setImageDrawable(getResources().getDrawable(R.mipmap.icon_btnaddfav));
        }
        else{
            isFav = true;
            addFav.setImageDrawable(getResources().getDrawable(R.mipmap.icon_btnunfav));
        }
        addFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SentenceDao dao = favoriteModel.search(item.speech);
                if(isFav){
                    favoriteModel.remove(dao.id);
                    addFav.setImageDrawable(getResources().getDrawable(R.mipmap.icon_btnaddfav));
                    Toast.makeText(ItemActivity.this,"Remove from favorites" , Toast.LENGTH_SHORT).show();
                    fb.deletefavItemActivity(item.speech);
                }
                else{
                    favoriteModel.add(item.speech);
                    addFav.setImageDrawable(getResources().getDrawable(R.mipmap.icon_btnunfav));
                    Toast.makeText(ItemActivity.this,"Add to favorites" , Toast.LENGTH_SHORT).show();
                    fb.addfavItemActivity(item.speech);
                }
                isFav=!isFav;
            }
        });


        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // frequencyModel.incrementFreq(item.speech);
                Speaker.speak(item.speech);
                fb.speechItemActivity(item.speech);
            }
        });


        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fb.backhomeActivity();
                Speaker.speak("Home page");
                Intent intent = new Intent(ItemActivity.this, MainActivity.class);
                intent.putExtra("loading",0);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Speaker.onStart(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Speaker.onStop();
    }
}
