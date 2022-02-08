package com.machatitans.eduapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;


public class settings extends AppCompatActivity {

    CheckBox checkBox;
    Button mode, language, but;
    int md;
    int n = 0;
    int p = 0;
    String lang = "";
    ArrayList<String> lan = new ArrayList<>();
    String filename = "data.gde";
    String fileContents;
    String value;
    String line;
    String mde = "";
    TextView text;

    FileOutputStream outputStream;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        mode = (Button) findViewById(R.id.mode);
        language = (Button) findViewById(R.id.Language);
        but = (Button)findViewById(R.id.button4);
        text = (TextView)findViewById(R.id.editText);
        try {
            FileInputStream in = openFileInput(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            try {
                if ((line = bufferedReader.readLine()) != null) {
                    value = line;
                }else{
                    value = "English-1";
                }
            }catch (IOException ie){
                value = "English-1";
            }
        } catch (FileNotFoundException e) {
            value = "English-1";
        }

        for (int i = 0 ; i < value.length()  ; i++){
            if (p == 0){
                if (value.charAt(i) != '-'){
                    lang = lang + value.charAt(i);
                }else{
                    p = 1;
                }
            }else{
                mde = mde + value.charAt(i);
            }
        }
        if(mde.equals("1")){
            md = 1;
        }else{
            md = 0;
        }
        but.setText(mde + md + "-" + lang);
        if(md == 1){
            mode.setText("Light");
        }else{
            mode.setText("Dark");
        }
        language.setText("English");
        lan.add("English");
        lan.add("Français");
        lan.add("العربية");
        language.setText(lang);
        mode.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(md == 1){
                    mode.setText("Dark");
                    md = 0;
                }else{
                    md = 1;
                    mode.setText("Light");
                }
                fileContents = lang + "-" + md;

                try {
                    outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
                    outputStream.write(fileContents.getBytes());
                    outputStream.close();
                } catch (Exception e) {
                }
            }
        });
        language.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(n < lan.size()-1) {
                    n++;
                }else{
                    n = 0;
                }
                lang = lan.get(n);
                language.setText(lang);

                fileContents = lang + "-" + md;

                try {
                    outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
                    outputStream.write(fileContents.getBytes());
                    outputStream.close();
                } catch (Exception e) {
                }
            }
        });
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text.setText("");
                String line = "";
                String txt="Arts";
                String Final = "";
                boolean o = true;

                try {
                    FileInputStream in = openFileInput("base.unv");
                    InputStreamReader inputStreamReader = new InputStreamReader(in);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        line = bufferedReader.readLine();
                        while(o) {
                            if (line != null) {
                                if (line.substring(Math.min(1, line.length()), Math.min(txt.length() + 1, line.length())).equals(txt)) {
                                    for(int i =0 ; i < 5; i++){
                                        line = bufferedReader.readLine();
                                        for(int n = 1 ; n < line.length() ; n++) {
                                            if (line.charAt(n) == '#'){
                                                Final = Final + "\n";
                                            }else {
                                                Final = Final + line.charAt(n);
                                            }
                                        }
                                        Final = Final + "\n";
                                        Final = Final + "\n";
                                    }
                                    text.setText(Final);
                                    o = false;
                                    System.out.println(line.substring(1, Math.min(txt.length() + 1, line.length())));
                                    break;
                                } else {
                                        line = bufferedReader.readLine();
                                }

                            }else line = bufferedReader.readLine();
                        }


                        /*while(line == null){
                            line = bufferedReader.readLine();
                        }
                        while(o) {
                            line = bufferedReader.readLine();
                            if(line.substring(0,Math.min(text.length(),line.length())).equals(text))o=false;
                        for(int i = 0 ;i<4;i++) {
                                line = bufferedReader.readLine();
                            }
                        }*/


                    }catch (IOException ie){
                        value= "none";
                    }
                } catch (FileNotFoundException e) {
                    value= "notFound";
                }
                but.setText(value);
            }
        });
    }
}
