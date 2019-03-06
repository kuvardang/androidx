package com.dang.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class kuvarrAdapter extends ArrayAdapter {

        Context context;
        int resource;
        ArrayList<kuvarr> objects;

    public kuvarrAdapter(@NonNull Context context, int resource, ArrayList<kuvarr> objects) {
        super(context, resource, objects);

            this.context = context;
            this.resource =resource;
            this.objects = objects;
        }


        public View getView (int position, View convertView, ViewGroup parent){

        View view = LayoutInflater.from(context).inflate(resource, parent, false);

            ImageView imageView = view.findViewById(R.id.imageView);
            TextView textTitle = view.findViewById(R.id.textView);
            TextView textURL = view.findViewById(R.id.textView2);

            kuvarr news = objects.get(position);

            imageView.setBackgroundResource(news.image);
            textTitle.setText(news.title);
            textURL.setText(news.url);

            return view;

        }
}
