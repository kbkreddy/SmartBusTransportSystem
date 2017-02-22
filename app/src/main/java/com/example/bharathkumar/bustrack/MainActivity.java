package com.example.bharathkumar.bustrack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void mapstart (View view)
    {
        EditText inputTxt;
        inputTxt= (EditText)findViewById(R.id.busNumberSearch);

            String str=inputTxt.getText().toString();
        Intent intent = new Intent(MainActivity.this,MapsActivity.class);
        intent.putExtra("busnumber",str);
        startActivity(intent);
    }

}
