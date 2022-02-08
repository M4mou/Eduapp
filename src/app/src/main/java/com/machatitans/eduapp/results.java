package com.machatitans.eduapp;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;

import lecho.lib.hellocharts.listener.PieChartOnValueSelectListener;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;

import lecho.lib.hellocharts.view.PieChartView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;


public class results extends AppCompatActivity implements PieChartOnValueSelectListener{

    PieChartView pieChartView;
    TextView Title1,Title2,Title3,Title4,Title5,Text1,Text2,Text3,Text4,Text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_act);
        Title1 = (TextView)findViewById(R.id.title1);
        Title2 = (TextView)findViewById(R.id.title2);
        Title3 = (TextView)findViewById(R.id.title3);
        Title4 = (TextView)findViewById(R.id.title4);
        Title5 = (TextView)findViewById(R.id.title5);
        Text1 = (TextView)findViewById(R.id.text1);
        Text2 = (TextView)findViewById(R.id.text2);
        Text3 = (TextView)findViewById(R.id.text3);
        Text4 = (TextView)findViewById(R.id.text4);
        Text5 = (TextView)findViewById(R.id.text5);



        pieChartView = findViewById(R.id.chart);

        final List pieData = new ArrayList<>();
        pieData.add(new SliceValue(15, Color.CYAN).setLabel("Engineering"));
        pieData.add(new SliceValue(25, Color.GRAY).setLabel("Computer Science"));
        pieData.add(new SliceValue(10, Color.RED).setLabel("Medical Studies"));
        pieData.add(new SliceValue(60, Color.MAGENTA).setLabel("Arts"));

        final PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData.setHasCenterCircle(true).setCenterText1("Top 5 best majors for you:").setCenterText1FontSize(17).setCenterText1Color(Color.parseColor("#444444"));
        pieChartView.setPieChartData(pieChartData);
        pieChartView.setOnValueTouchListener(this);
    }

        @Override
        public void onValueSelected(int arcIndex, SliceValue value) {
            char[] slice = pieChartView.getPieChartData().getValues().get(arcIndex).getLabelAsChars();
            System.out.println("" + Arrays.toString(slice));
            String line = "";
            String Final = "";
            boolean title;
            boolean o = true;
            String a = "Engineering";
            String b = "Medical Science";
            String c = "Arts";
            String d = "Computer Science";
            String s = new String(slice);

            if (s.equals(a)) {
                System.out.print(a);
            } else if (s.equals(b)) {
                System.out.print(b);
            } else if (s.equals(c)) {
                System.out.print(c);
            } else if (s.equals(d)) {
                System.out.print(s);
            }
            try {
                FileInputStream in = openFileInput("base.unv");
                InputStreamReader inputStreamReader = new InputStreamReader(in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    line = bufferedReader.readLine();
                    mainloop:
                    while (o) {
                        if (line != null) {
                            if (line.substring(Math.min(1, line.length()), Math.min(s.length() + 1, line.length())).equals(s)) {
                                for (int i = 0; i < 5; i++) {
                                    line = bufferedReader.readLine();
                                    title = true;
                                    Final = "";
                                    for (int n = 1; n < line.length(); n++) {
                                        if (line.charAt(n) == '#') {
                                            if (title) {
                                                switch (i) {
                                                    case 0:
                                                        Title1.setText(Final);
                                                        break;
                                                    case 1:
                                                        Title2.setText(Final);
                                                        break;
                                                    case 2:
                                                        Title3.setText(Final);
                                                        break;
                                                    case 3:
                                                        Title4.setText(Final);
                                                        break;
                                                    case 4:
                                                        Title5.setText(Final);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                title = false;
                                                Final = "";
                                            }else Final = Final +"\n";

                                        } else {
                                            Final = Final + line.charAt(n);
                                        }
                                    }
                                    switch (i) {
                                        case 0:
                                            Text1.setText(Final);
                                            break;
                                        case 1:
                                            Text2.setText(Final);
                                            break;
                                        case 2:
                                            Text3.setText(Final);
                                            break;
                                        case 3:
                                            Text4.setText(Final);
                                            break;
                                        case 4:
                                            Text5.setText(Final);
                                            break mainloop;
                                            default:
                                                break;
                                    }
                                }

                            } else line = bufferedReader.readLine();

                        } else line = bufferedReader.readLine();
                    }

                } catch (IOException ie) {
                }
            } catch (FileNotFoundException e) {
            }
        }

    @Override
    public void onValueDeselected() {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }}


