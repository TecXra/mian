package com.example.fasigujar.copyproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Mian Mohsin on 10/17/2016.
 */
public class Menus_Item extends AppCompatActivity {
    private int id;
    private  String Id;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent= getIntent();
       Id=intent.getStringExtra("Id");
    }
}
