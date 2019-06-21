package com.example.picrecstack;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] headers;
    private final String[] descriptions;
    private final Integer[] imageIds;

    public MyListAdapter(Activity context, String[] headers, String[] descriptions, Integer[] imageIds) {
        super(context, R.layout.mylist_item, headers);

        this.context = context;
        this.headers = headers;
        this.descriptions = descriptions;
        this.imageIds = imageIds;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist_item, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        titleText.setText(headers[position]);
        imageView.setImageResource(imageIds[position]);
        subtitleText.setText(descriptions[position]);
        return rowView;
    };
}

