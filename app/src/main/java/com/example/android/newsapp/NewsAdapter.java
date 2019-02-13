package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    /**constructs  a new {@link NewsAdapter}.
     * @param context of the app
     * @param news is the list of news,which is the data src of the adapter*/
    public NewsAdapter(Context context, List<News> news){
        super(context,0,news);
    }
    /**returns a list itemView that displays information about earthquake at the given position in
     * the list of earthquakes
     */
    @Override
    public View getView(int position , View convertView, ViewGroup parent) {
        //check if there is an existing list item view(called convertView) that can reuse,
        //otherwise,if convertView is null,then inflate a new list item layout
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }
        //find the news at the given position in the list of news
        News currentNews = getItem(position);
        //find the textview with View ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // set this text on the  TextView
        titleView.setText(currentNews.getmTitle());
        //find the textview with View ID title
        TextView nameView = (TextView) listItemView.findViewById(R.id.name);
        // set this text on the  TextView
        nameView.setText(currentNews.getmName());
        //find the textview with View ID title
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        SimpleDateFormat sourceDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss");
        try {
            Date dateObject = sourceDateFormat.parse(currentNews.getmDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TextView contributorView = (TextView) listItemView.findViewById(R.id.contributor);
        // set this text on the  TextView
        nameView.setText(currentNews.getmContributor());


//return the list_item_view that is now showing the appropriate data
        return listItemView;
    }
}
