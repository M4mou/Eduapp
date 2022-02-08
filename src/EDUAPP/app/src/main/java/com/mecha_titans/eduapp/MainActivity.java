package com.mecha_titans.eduapp;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import lecho.lib.hellocharts.listener.PieChartOnValueSelectListener;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;

import lecho.lib.hellocharts.view.PieChartView;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity implements PieChartOnValueSelectListener{

    PieChartView pieChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChartView = findViewById(R.id.chart);

        final List pieData = new ArrayList<>();
        pieData.add(new SliceValue(15, Color.CYAN).setLabel("Engineering"));
        pieData.add(new SliceValue(25, Color.GRAY).setLabel("Computer Science"));
        pieData.add(new SliceValue(10, Color.RED).setLabel("Medical Science"));
        pieData.add(new SliceValue(60, Color.MAGENTA).setLabel("Music"));

        final PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData.setHasCenterCircle(true).setCenterText1("Top 5 best majors for you:").setCenterText1FontSize(17).setCenterText1Color(Color.parseColor("#444444"));
        pieChartView.setPieChartData(pieChartData);
        pieChartView.setOnValueTouchListener(this);
        /*pieChartView.setOnValueTouchListener(new PieChartOnValueSelectListener() {
            @Override
            public void onValueDeselected() {

            }

            @Override
            public void onValueSelected(int arcIndex, SliceValue value) {
                    char[] slice = pieChartView.getPieChartData().getValues().get(arcIndex).getLabelAsChars();
                System.out.println("arr: " + Arrays.toString(slice));
                 String a = "Engineering";
                 String b = "Medical Science";
                 String c = "Music";
                 String d = "Computer Science";
                 String s = new String(slice);

               /*if (s.equals(a)){
                   System.out.print(a);
                   } else if (s.equals(b)) {
                   System.out.print(b);
                   } else if(s.equals(c)) {
                   System.out.print(c);
                   } else if(s.equals(d)){
                   System.out.print(s);
                   }


                /*if (firstmajor.length != slice.length) {
                    System.out.println("False.they are not equal");
                } else {
                    boolean isEqual = true;
                    for (int i = 0; i < firstmajor.length; i++) {
                        if (firstmajor[i] != slice[i]) {
                            System.out.println("False.they are not equal");
                            isEqual = false;
                            break;
                        }
                    }
                    if (isEqual)
                        System.out.println(b);*/


                }

    @Override
    public void onValueSelected(int arcIndex, SliceValue value) {
        char[] slice = pieChartView.getPieChartData().getValues().get(arcIndex).getLabelAsChars();
        System.out.println("arr: " + Arrays.toString(slice));
        String a = "Engineering";
        String b = "Medical Science";
        String c = "Music";
        String d = "Computer Science";
        String s = new String(slice);

        if (s.equals(a)){
                   System.out.print(a);
                   } else if (s.equals(b)) {
                   System.out.print(b);
                   } else if(s.equals(c)) {
                   System.out.print(c);
                   } else if(s.equals(d)){
                   System.out.print(s);
                   }

    }

    @Override
    public void onValueDeselected() {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }}


