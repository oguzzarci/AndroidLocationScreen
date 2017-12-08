package com.app.diceroid.nerede.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.app.diceroid.nerede.R;

public class KidsActivity extends AppCompatActivity {

    private String[] myKids =
            {"Alber", "Eşref", "Ozan", "Ogün", "Feyyaz", "Esa", "Aykut", "Batu", "Alex", "Guard", "Read", "Gladi", "Run Or Dead"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> dataAdaptor = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, myKids);
        listView.setAdapter(dataAdaptor);
    }


    public void onClickBtnKidsAdd(View view) {

        //internet control
        //olumsuz toast
        // dolu bos
        // login oldu mu
        // olumlu olumsuz
        // intent ac
        kidsAdd();
        // mesaj goster

    }


    private void kidsAdd() {
        Intent intent = new Intent(KidsActivity.this, KidsAddActivity.class);
        startActivity(intent);

    }
}
