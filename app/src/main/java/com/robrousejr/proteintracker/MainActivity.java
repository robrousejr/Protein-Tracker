package com.robrousejr.proteintracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: On launch, check day. If still current day, display current
        // protein information, if midnight or after in next day, return to 0
        

    }

    // Returns integer of day of month
    public int getDayOfMonth(){
        Calendar calendar = Calendar.getInstance();
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); //TODO: Ensure this gets the day
        return dayOfMonth;
    }
}
