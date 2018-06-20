package com.example.android.musicparty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of Songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Don't let me down", "The chainsomkers ft. Daya", R.drawable.daya));
        songs.add(new Song("Not Afraid", "Eminem", R.drawable.notafraid));
        songs.add(new Song("Shape of you", "Ed Sheeran", R.drawable.shape));
        songs.add(new Song("I bust the windows out your car", "Jazmine sullivan", R.drawable.jazmine));
        songs.add(new Song("On the floor", "Jennifer Lopez", R.drawable.floor));
        songs.add(new Song("Don't you need somebody ?", "RedOne ft. Enrique Iglesias, Aseel and Shaggy", R.drawable.dyns));
        songs.add(new Song("Rockabye", "feat. Sean Paul & Anne-Marie", R.drawable.rockabye));
        songs.add(new Song("Treat you better", "Shawn Mendes", R.drawable.treat));
        songs.add(new Song("The Greatest", "sia_ft._kendrick_lamar", R.drawable.thegreatest));
        songs.add(new Song("Closer", "The Chainsmokers", R.drawable.closer));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
