package com.example.apptester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton songImage = (ImageButton) findViewById(R.id.songImage);
        ListView songList = (ListView) findViewById(R.id.songList);

        String[] namesOfSongs = {"Ak-Im not Selfish", "Eminem-Venom", "Emkidncp-Dont Go", "Sugar Sean-Goat Talk", "Lil Wayne-Back From the 80s", "Nasty C-Switched Up"};// array for names of songs
        int[] songImages = {R.drawable.akimnotselfish, R.drawable.eminemvenom, R.drawable.emkidncdontgo, R.drawable.goattalksugarsean, R.drawable.lilwaynebackfromthe80s, R.drawable.nastycswitchedup}; //arrays for song images

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, namesOfSongs);

        songList.setAdapter(arrayAdapter);

        songList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int itemPoint, long l) {
                int index =0;
                while(index < namesOfSongs.length)
                {
                    if(itemPoint == index)
                    {
                        songImage.setImageResource(songImages[index]);
                    }
                    index++;
                }
            }
        });

    }
}