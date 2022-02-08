package com.machatitans.eduapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class splash2 extends Activity {
    String line;
    String value = "";
    String filename = "first.gde";

    FileOutputStream outputStream;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash2);

        int secondsDelayed = 3;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                try {
                    FileInputStream in = openFileInput(filename);
                    InputStreamReader inputStreamReader = new InputStreamReader(in);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        if ((line = bufferedReader.readLine()) != null) {
                            value = line;
                        }else{
                            value = "1";
                        }
                    }catch (IOException ie){
                        value = "1";
                    }
                } catch (FileNotFoundException e) {
                    value = "1";
                }
                if (value.equals("1")){
                    String i = "0";
                    try {
                        outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
                        outputStream.write(i.getBytes());
                        outputStream.close();
                    } catch (Exception ex) {
                    }
                    startActivity(new Intent(splash2.this, info.class));
                    finish();
                }else{
                    startActivity(new Intent(splash2.this, MainActivity.class));
                    finish();
                }
            }
        }, secondsDelayed * 1000);
    }
}
