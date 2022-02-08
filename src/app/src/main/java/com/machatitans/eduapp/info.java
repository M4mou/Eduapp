package com.machatitans.eduapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class info extends Activity {
    EditText text , text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        text = (EditText) findViewById(R.id.addictestdiscription);
        text1 = (EditText) findViewById(R.id.mechadescription);
    }
}
