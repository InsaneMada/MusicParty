package com.example.android.musicparty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        // Set a click listener on that View
        final Button Songs = findViewById(R.id.songs);
        Songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Songs = new Intent(Categories.this, Songs.class);
                startActivity(Songs);
            }
        });
        // Set a click listener on that View
        final Button RelaxMusic = findViewById(R.id.music);
        RelaxMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RelaxMusic = new Intent(Categories.this, RelaxMusic.class);
                startActivity(RelaxMusic);
            }
        });
    }
}
