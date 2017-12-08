package com.app.diceroid.nerede.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.app.diceroid.nerede.R;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public  void onClickBtnLogin(View view){

        //internet control
        //olumsuz toast
        // dolu bos
        // login oldu mu
        // olumlu olumsuz
        // intent ac
        showKidsActivity();
        // mesaj goster

    }


    private void showKidsActivity(){
        Intent intent = new Intent(LoginActivity.this,KidsActivity.class);
        startActivity(intent);

    }

}
