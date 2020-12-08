package com.example.bookyourbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ManegerOptionActivity extends AppCompatActivity implements View.OnClickListener{

    Button DaylySchedule;
    Button EditSales;
    Button salaryCalculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maneger_option);
        setButtons();
        listenButtons();
    }


    private void listenButtons() {
        DaylySchedule.setOnClickListener(this);
        EditSales.setOnClickListener(this);
        salaryCalculator.setOnClickListener(this);

    }

    private void setButtons() {
        DaylySchedule= (Button) findViewById(R.id.DaylySchedule);
        EditSales= (Button) findViewById(R.id.EditSales);
        salaryCalculator= (Button) findViewById(R.id.salaryCalculator);
    }


    @Override
    public void onClick(View v) {
        if(v==DaylySchedule){
            Intent ii= new Intent(this,MainActivity.class);
            startActivity(ii);
        }
        else if(v==EditSales){
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
        else if(v==salaryCalculator){
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
    }
}