package com.example.urgentnyathi.transportation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView show = (TextView)findViewById(R.id.textView);
        show.setText(getIntent().getExtras().getString("email").toString());
    }
}
