package com.example.android.musicparty;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Insane on 5/19/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {

        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the current song object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name
        TextView songName = (TextView) listItemView.findViewById(R.id.song_name);

        songName.setText(currentSong.getSongName());

        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_name);

        artistName.setText(currentSong.getArtistName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.artist_image);
        // Get the image resource ID from the current song object and
        // set the image to iconView
        iconView.setImageResource(currentSong.getImageResourceId());
        return listItemView;
    }
}
