package com.dang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList <kuvarr> newsList;
    kuvarrAdapter kuvarrrAdapter;
    void initViews(){
        listView= findViewById(R.id.listView);

        newsList = new ArrayList<>();

        kuvarr news1 = new kuvarr(R.drawable.digg,"NDTV", "https://www.ndtv.in");
        kuvarr news2 = new kuvarr(R.drawable.moonphase,"AAJ tak","www.aajtak.in");
        kuvarr news3 = new kuvarr(R.drawable.moonrover,"ABP News","www.abpnews.in");
        kuvarr news4 = new kuvarr(R.drawable.myspace,"BBC News","www.bbcnews.com");
        kuvarr news5 = new kuvarr(R.drawable.xing,"Fastway News","www.fastway.com");

        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
        newsList.add(news5);

        kuvarrrAdapter = new kuvarrAdapter(this,R.layout.handa,newsList);
        listView.setAdapter(kuvarrrAdapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
}
