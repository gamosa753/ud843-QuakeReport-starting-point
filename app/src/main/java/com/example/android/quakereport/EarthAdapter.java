package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 27.09.2017.
 */

public class EarthAdapter extends ArrayAdapter<Earth> {

    public EarthAdapter(Activity context, ArrayList<Earth> earth){
        super(context,0,earth);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Earth currentWord = getItem(position);

        TextView mag = (TextView) listItemView.findViewById(R.id.mag);
        mag.setText(currentWord.getMag());

        TextView place = (TextView) listItemView.findViewById(R.id.place);
        place.setText(currentWord.getLocation());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentWord.getDate());
        return listItemView;
    }
}
