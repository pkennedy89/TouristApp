package com.example.android.touristapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CultureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("King John's Castle", "Limerick City", R.drawable.kingjohns));
        locations.add(new Location("The Hunt Museum", "Limerick City", R.drawable.hunt_museum));
        locations.add(new Location("Desmond Banqueting Hall", "Newcastlewest", R.drawable.desmond));
        locations.add(new Location("Adare Castle", "Adare", R.drawable.adare_castle));
        locations.add(new Location("Belltable Arts Centre", "Limerick City", R.drawable.belltable));
        locations.add(new Location("Lime Tree Theatre", "Limerick City", R.drawable.limetree));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
