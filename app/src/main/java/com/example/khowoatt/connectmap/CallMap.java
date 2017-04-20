package com.example.khowoatt.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {//Main Method


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);
    }
    public void runCallMap(View view){
        //initial view
        EditText latitude = (EditText) findViewById(R.id.mapLat);
        EditText longtitude = (EditText) findViewById(R.id.mapLong);
        EditText labal = (EditText) findViewById(R.id.mapLabel);


        String lat = latitude.getText().toString().trim();//แปลงค่าจาก EditText เป็น String, trim คือการตัดช่องว่างเวลาพิมแล้วนำมาเก็บข้อมูล
        String lng = longtitude.getText().toString().trim();
        String mlabal = labal.getText().toString().trim();
        Uri Location = Uri.parse("http://maps.google.com/maps?q=loc:"+lat+","+lng+"("+mlabal+")");

        Intent mapIntent= new Intent(Intent.ACTION_VIEW,Location);
        //mapIntent.setPackage("com.google.android.apps.maps");//set เพื่อให้ใช้ google map โดยตรง ถ้าในเครื่องมีแอพแมพหลายตัว , ใช้เทสด้วย Genymotion ไม่ได้
        startActivity(mapIntent);

    }//runCallmap
}//Main Class
