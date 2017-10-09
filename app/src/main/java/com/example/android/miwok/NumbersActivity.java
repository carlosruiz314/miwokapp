package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Declare and initialize word array
        ArrayList<String> englishWords = new ArrayList<>();
        englishWords.add("one");
        englishWords.add("two");
        englishWords.add("three");
        englishWords.add("four");
        englishWords.add("five");
        englishWords.add("six");
        englishWords.add("seven");
        englishWords.add("eight");
        englishWords.add("nine");
        englishWords.add("ten");

        // Reference the parent view
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for (int i = 0; i < englishWords.size(); i++) {

            // Inflate new TextView
            TextView wordView = new TextView(this);
            // Set text
            wordView.setText(englishWords.get(i));
            // Add it to the parent view
            rootView.addView(wordView);

            Log.v("NumbersActivity", englishWords.get(i));

        }
    }
}
