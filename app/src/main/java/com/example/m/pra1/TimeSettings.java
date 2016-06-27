package com.example.m.pra1;

import android.app.TimePickerDialog;
import android.content.Context;
import android.util.Log;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by m on 2016-06-27.
 */
public class TimeSettings implements TimePickerDialog.OnTimeSetListener {
    Context context;

    public TimeSettings(Context context) {
        Log.d("Uwaga","10");
        this.context = context;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Log.d("Uwaga","12");
        Toast.makeText(context,"Ustawione",Toast.LENGTH_LONG).show();
    }
}
