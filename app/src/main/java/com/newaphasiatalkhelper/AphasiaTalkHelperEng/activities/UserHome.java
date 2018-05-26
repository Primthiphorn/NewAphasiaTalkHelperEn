package com.newaphasiatalkhelper.AphasiaTalkHelperEng.activities;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.newaphasiatalkhelper.AphasiaTalkHelperEng.R;
import com.newaphasiatalkhelper.AphasiaTalkHelperEng.models.FirebaseModel;

public class UserHome extends BaseActivity {
    FirebaseModel fb;
    Spinner symptom;
    LinearLayout symptomOther;
    View save;
    EditText firstname, surname,nickname,age,gender,symptomother,email,telephone;
    CheckBox accept;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fb = new FirebaseModel(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        initToolbar();
        hideUserProfileIcon();
        fb.userhomeActivity();

        final String[] symptom_array = getResources().getStringArray(R.array.symptom_array);

        symptom = (Spinner) findViewById(R.id.symptom);
        symptomOther = (LinearLayout) findViewById(R.id.symptom_other);
        save = findViewById(R.id.btnsave);
        accept = (CheckBox) findViewById(R.id.accept);

        firstname = (EditText) findViewById(R.id.firstname);
        surname = (EditText) findViewById(R.id.surname);
        nickname = (EditText) findViewById(R.id.nickname);
        age = (EditText) findViewById(R.id.age);
        gender = (EditText) findViewById(R.id.gender);
        symptomother = (EditText) findViewById(R.id.symptomother);
        email = (EditText) findViewById(R.id.email);
        telephone = (EditText) findViewById(R.id.telephone);



        SharedPreferences pref = getSharedPreferences("user_info", MODE_PRIVATE);
        firstname.setText(pref.getString("user-firstname", ""));
        surname.setText(pref.getString("user-surname",""));
        nickname.setText(pref.getString("user-nickname",""));
        age.setText(pref.getString("user-age",""));
        gender.setText(pref.getString("user-gender",""));
        symptomother.setText(pref.getString("user-symptomother",""));
        email.setText(pref.getString("carer-email",""));
        telephone.setText(pref.getString("carer-telephone",""));
        accept.setChecked(pref.getInt("allow-track", 1) == 1);
        Log.i("aaa", "pref.getInt(\"user-sypmtom\",0)= " + pref.getInt("user-sypmtom",0));

        symptom.setSelection(pref.getInt("user-symptom",0));

        if(pref.getInt("user-sypmtom",0) == symptom_array.length-1){
            symptomOther.setVisibility(View.VISIBLE);
        }
        else{
            symptomOther.setVisibility(View.GONE);
        }

        symptom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == symptom_array.length-1 ){
                    symptomOther.setVisibility(View.VISIBLE);
                }
                else symptomOther.setVisibility(View.GONE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=getSharedPreferences("user_info", MODE_PRIVATE).edit();
                editor.putString("user-firstname",firstname.getText().toString());
                editor.putString("user-surname",surname.getText().toString());
                editor.putString("user-nickname",nickname.getText().toString());
                editor.putString("user-age",age.getText().toString());
                editor.putString("user-gender",gender.getText().toString());
                editor.putString("user-sypmtomother",symptomother.getText().toString());
                editor.putString("carer-email",email.getText().toString());
                editor.putString("carer-telephone",telephone.getText().toString());
                editor.putInt("user-symptom", symptom.getSelectedItemPosition());
                editor.putInt("allow-track", accept.isChecked() ? 1 : 0);
                Log.i("aaa", "symptom.getSelectedItemPosition()= " + symptom.getSelectedItemPosition() );

                editor.commit();
                String age2 =   age.getText().toString();
                String gender2 =   gender.getText().toString();
                String symptom2 = symptom.getSelectedItemPosition() == symptom_array.length - 1 ?
                        symptomother.getText().toString() :
                        symptom_array[symptom.getSelectedItemPosition()];
                fb.putUserInfo(age2,gender2,symptom2);

                View v = UserHome.this.getCurrentFocus();
                if(v != null){
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                }
                new AlertDialog.Builder(UserHome.this)
                        .setTitle("Save Successfully!")
                        .setMessage("Your information has been saved successfully.")
                        .setPositiveButton("OK", null)
                        .show();
            }
        });

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }
}
