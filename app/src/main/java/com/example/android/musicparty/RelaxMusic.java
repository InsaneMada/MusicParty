package com.example.android.musicparty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RelaxMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of Songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("pirates of the caribbean","Violin",R.drawable.pirates));
        songs.add(new Song("Awakening","Violin",R.drawable.awakening));
        songs.add(new Song("The Avengers","Violin",R.drawable.avangers));
        songs.add(new Song("The last of the mohicans","soundtrack",R.drawable.mohicans));
        songs.add(new Song("The rains of Castamere","soundtrack",R.drawable.rains));
        songs.add(new Song("Impossible Shontelle ?","Piano",R.drawable.shontelle));
        songs.add(new Song("Beethoven-7th symphony","Beethoven",R.drawable.beethoven));
        songs.add(new Song("interstellar","soundtrack",R.drawable.interstellar));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}