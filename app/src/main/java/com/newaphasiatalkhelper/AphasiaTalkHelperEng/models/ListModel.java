package com.newaphasiatalkhelper.AphasiaTalkHelperEng.models;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.newaphasiatalkhelper.AphasiaTalkHelperEng.MainApplication;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.dao.ItemDao;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tum on 11/19/2017 AD.
 */

public class ListModel {

    private static ListModel instance;
    public static ListModel getInstance(){
        if (instance==null){
            instance = new ListModel(MainApplication.context);
        }
        return instance;
    }

    WantListDb helper;
    ItemDao[] data;
    Map<Integer, ItemDao[]> dataSub= new HashMap<>();



    public ListModel(Context context){
    /*    helper = new WantListDb(context );
        Map<Integer,Integer> f = helper.getAllIdAndFrequency();
        for (ItemDao item : data){
            item.freq = f.get(item.id);
        }
        Arrays.sort(data);
     */
    }

    public ItemDao[] getAll(){
        return data;
    }


    public ItemDao[] getSubAll(int subId){
        return dataSub.get(subId);
    }


    public ItemDao get(int index){
        return data[index];
    }

    public ItemDao getsub(int subId, int index){
        return dataSub.get(subId)[index];
    }

    public void IncrementFrequency(ItemDao item){

    }

    //DatabaseWantList
    public class WantListDb extends SQLiteOpenHelper{

        public WantListDb(Context context) {
            super(context, null, null, 1);
        }

        //CreateTableForWantList

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE WantListDb (id INTERGER PRIMARY KEY, freq INTERGER)");
            for (ItemDao item : getAll()){
                db.execSQL("INSERT INTO WantListDb VALUES(" + item.id + ", 0)");
            }

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS WantListDb");
            onCreate(db);

        }

        public Map<Integer,Integer> getAllIdAndFrequency(){
            SQLiteDatabase db = getWritableDatabase();

            Cursor cursor = db.query("WantListDb", null, null, null, null, null, "freq");

            Map<Integer,Integer> ids = new HashMap<>();

            if (cursor != null){
                cursor.moveToFirst();
            }

            while(!cursor.isAfterLast()){

                int id = cursor.getInt(0);
                int freq = cursor.getInt(1);
                ids.put(id, freq);
                cursor.moveToNext();
            }
            db.close();

            return ids;
        }
    }
}
