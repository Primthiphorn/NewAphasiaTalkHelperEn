package com.newaphasiatalkhelper.AphasiaTalkHelperEng.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.newaphasiatalkhelper.AphasiaTalkHelperEng.R;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.dao.SentenceDao;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.helpers.Speaker;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.FavoriteModel;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.FirebaseModel;

public class FavoriteActivity extends BaseActivity {

    RecyclerView favList;
    FavoriteModel favoriteModel;
    MyRecycleAdapter adapter;
    FirebaseModel fb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        //Call function Toolbar
        initToolbar();
        fb = new FirebaseModel(this);
        favoriteModel = new FavoriteModel(this);
        favList = (RecyclerView) findViewById(R.id.fav_list);
        favList.setAdapter(adapter = new MyRecycleAdapter());
        favList.setLayoutManager(new LinearLayoutManager(this));
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

    class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder> {


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rootview = inflater.inflate(R.layout.view_fav_sentence, parent, false);
            return new MyViewHolder(rootview);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            SentenceDao item = favoriteModel.getAll()[position];
            holder.sentence.setText(item.sentence);
        }

        @Override
        public int getItemCount() {
            return favoriteModel.getAll().length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            View btnRemove, btnSpeech;
            TextView sentence;

            public MyViewHolder(View favSentence) {

                super(favSentence);
                btnRemove = favSentence.findViewById(R.id.btn_remove);
                btnSpeech = favSentence.findViewById(R.id.btn_speech);
                sentence = (TextView) favSentence.findViewById(R.id.sentence);

                btnRemove.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder dialog = new AlertDialog.Builder(FavoriteActivity.this);
                        dialog.setTitle("Confirm Deletion")
                                .setMessage("Are you sure you want to delete this item?")
                                .setPositiveButton("delete", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        int pos = getAdapterPosition();
                                        int id = favoriteModel.getAll()[pos].id;
                                        favoriteModel.remove(id);
                                        fb.deletefavoriteActivity(favoriteModel.getAll()[pos].sentence);
                                        adapter.notifyDataSetChanged();
                                    }
                                })
                                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                })
                        .show();


                    }
                });

                btnSpeech.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = getAdapterPosition();
                        String sentence = favoriteModel.getAll()[pos].sentence;
                        Speaker.speak(sentence);
                        fb.speechfavoriteActivity(sentence);
                    }
                });
            }
        }
    }
}
