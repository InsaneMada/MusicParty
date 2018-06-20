package com.example.android.musicparty;

/**
 * Created by Insane on 5/19/2018.
 */

public class Song {
    // Song name
    private String mSongName;

    // Artist name
    private String mArtistName;

    // Artist Image
    private int mImageResourceId;

    public Song(String songName, String artistName) {

        mSongName = songName;
        mArtistName = artistName;
    }

    public Song(String songName, String artistName, int imageResourceId) {

        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
