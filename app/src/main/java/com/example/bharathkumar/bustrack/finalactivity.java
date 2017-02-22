package com.example.bharathkumar.bustrack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class finalactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalactivity);
    }

    public void setalarm(View v)
    {
      //  String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());


        Toast.makeText(this,"WIll be notified 10 mins before the arrival to ur nearest Bus Stop",Toast.LENGTH_SHORT).show();
    }
}
