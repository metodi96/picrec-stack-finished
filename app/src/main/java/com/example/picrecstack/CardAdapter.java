package com.example.picrecstack;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class CardAdapter extends ArrayAdapter<Integer> {
    public CardAdapter(Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = convertView.findViewById(R.id.picture_id);
        imageView.setImageResource(getItem(position));
        imageView.setClipToOutline(true);
        return convertView;
    }
}
