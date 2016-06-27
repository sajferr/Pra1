package com.example.m.pra1;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Uwaga","132");
        setContentView(R.layout.activity_main);

    }
    public void click(View v){
        DialogHandler handler = new DialogHandler();
        Log.d("Uwaga","131");
        handler.show(getSupportFragmentManager(),"time_picker");

    };
}
