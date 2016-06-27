package com.example.m.pra1;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.util.Log;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Created by m on 2016-06-27.
 */
public class DialogHandler extends DialogFragment
{


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        Log.d("Uwaga","14");
        int minute =calendar.get(Calendar.MINUTE);
        Log.d("Uwaga","124");
        TimeSettings timeSettings = new TimeSettings(getActivity());
        Log.d("Uwaga","1334");
        TimePickerDialog pickerDialog = new TimePickerDialog(getActivity(),timeSettings,hour,minute, android.text.format.DateFormat.is24HourFormat(getActivity()));
        Log.d("Uwaga","133");
        return pickerDialog;
    }
}
