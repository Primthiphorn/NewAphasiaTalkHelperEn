package com.newaphasiatalkhelper.AphasiaTalkHelperEng.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.newaphasiatalkhelper.AphasiaTalkHelperEng.R;

/**
 * Created by Tum on 9/24/2017 AD.
 */

public class ItemImage extends FrameLayout {

    ImageView imageView;
    TextView textView;
    View frame;

    public ItemImage(@NonNull Context context) {
        super(context);
        init();
    }


    public ItemImage(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ItemImage(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ItemImage(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    //เอามาแปะ
    private void init() {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_item_image, this);
        frame = findViewById(R.id.item_frame);
        imageView = (ImageView) findViewById(R.id.item_image);
        textView = (TextView) findViewById(R.id.item_text);
    }

    public void setItemText(String str) {
        if (str == null) {
            textView.setVisibility(INVISIBLE);

        } else {
            textView.setVisibility(VISIBLE);
            textView.setText(str);
        }
    }

    public void setItemImage(Drawable img) {
        if (img == null) {
            imageView.setVisibility(INVISIBLE);
        } else {
            imageView.setVisibility(VISIBLE);
            imageView.setImageDrawable(img);
        }

    }

    //Frequence of color
    public void setBgColor(int level, String type) {
        if ("want".equals(type)) {
            if (level == 2) {
                frame.setBackgroundColor(getResources().getColor(R.color.bg_want_dark));
            } else {
                frame.setBackgroundColor(getResources().getColor(R.color.bg_want_light));
            }

        }
        else{
            if (level == 2) {
                frame.setBackgroundColor(getResources().getColor(R.color.bg_feel_dark));
            } else {
                frame.setBackgroundColor(getResources().getColor(R.color.bg_feel_light));
            }
        }
    }
}
