package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void onclick2(View view){
        double height=0;
        double weight=0;
        String detail=null;
        EditText he=(EditText) findViewById(R.id.height);
        EditText we=(EditText) findViewById(R.id.weight);
        TextView bi=(TextView) findViewById(R.id.bmvalue);
        TextView de=(TextView) findViewById(R.id.detail);

        height=Double.parseDouble(he.getText().toString());
        weight=Double.parseDouble(we.getText().toString());
        double bm = weight / (height * height);
        bi.setText("BM value = "+String.valueOf(bm));

        if(bm<=18.5){
            detail="UnderWeight ! , eat some foods...! ";
        }else if(18.5<bm && bm<25){
            detail="Situation is normal";
        }else if(bm>=25){
            detail="OverWeight ! , stop eat food so much..! ";

        }else{
            detail="Cant measure";
        }
        de.setText(detail);

    }
}
