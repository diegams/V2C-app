package com.example.janin.v2c_app;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Janin on 04.11.15.
 */
public class ImageAdapter extends BaseAdapter {
    private Context context;


    public ImageAdapter (Context c) {
        this.context = c;
    }

    public View getView (int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            gridView = new View (context);
            gridView = inflater.inflate(R.layout.grid_main, null);

            TextView textView = (TextView) gridView.findViewById(R.id.grid_item_label);

            ImageView imageView = (ImageView) gridView.findViewById(R.id.grid_item_image);

            imageView.setImageResource(mThumbIds[position]);
        } else {
            gridView = convertView;
        }
        return gridView;
    }

    private Integer[] mThumbIds = {
            R.drawable.icon1, R.drawable.icon2,R.drawable.icon3, R.drawable.icon4, R.drawable.icon1, R.drawable.icon2,R.drawable.icon3, R.drawable.icon4, R.drawable.icon1, R.drawable.icon2,R.drawable.icon3, R.drawable.icon4
    };

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId (int position) {
        return 0;
    }

}
