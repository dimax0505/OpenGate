package com.example.maximovd.opengate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        Intent call1 = new Intent(Intent.ACTION_CALL);
        call1.setData(Uri.parse("tel:" + "89636968648"));
        try {
            startActivity(call1);}
        catch (SecurityException e){

        }


    }


    public void onClick2(View view) {
        Intent call2 = new Intent(Intent.ACTION_CALL);
        call2.setData(Uri.parse("tel:" + "89636967014"));
        try {
            startActivity(call2);}
        catch (SecurityException e){

        }
    }
}
