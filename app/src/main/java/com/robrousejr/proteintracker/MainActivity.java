package com.robrousejr.proteintracker;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get from the SharedPreferences
        SharedPreferences settings = getApplicationContext().getSharedPreferences("Day", -1);
        int lastDay = settings.getInt("Day", -1);

        // If day is different
        if(getDayOfMonth() != lastDay)
        {
            SharedPreferences.Editor editor = settings.edit();
            editor.putInt("Day", getDayOfMonth()); // Saves day in editor
            editor.apply(); // Apply the edits
        }


    }

    // Returns integer of day of month
    public int getDayOfMonth(){
        Calendar calendar = Calendar.getInstance();
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); //TODO: Ensure this gets the day
        return dayOfMonth;
    }
}
