/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

//        // Create a fake list of earthquake locations.
//        ArrayList<EarthquakeActivity> earthquakes = new ArrayList<EarthquakeActivity>();
//        earthquakes.add(new EarthquakeActivity("1.64", "San Francisco", "Jan 1, 2010"));
//        earthquakes.add(new EarthquakeActivity("5.40", "London", "Mar 18, 2009"));
//        earthquakes.add(new EarthquakeActivity("9.20", "Tokyo", "April 9, 2006"));
//        earthquakes.add(new EarthquakeActivity("2.50", "Mexico City", "Dec 3, 2011"));
//        earthquakes.add(new EarthquakeActivity("3.70", "Moscow", "Dec 4, 2013"));
//        earthquakes.add(new EarthquakeActivity("8.89", "Rio de Janeiro", "May 9, 2003"));
//        earthquakes.add(new EarthquakeActivity("4.50", "Paris", "Aug 4, 2014"));

        ArrayList<EarthquakeActivity> earthquakes = QueryUtils.extractEarthquakes();
        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        CustomAdapter earthquake = new CustomAdapter(this, earthquakes);
        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(earthquake);

    }
}
