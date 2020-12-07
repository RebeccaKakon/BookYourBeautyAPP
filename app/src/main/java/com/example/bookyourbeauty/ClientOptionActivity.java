package com.example.bookyourbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClientOptionActivity extends AppCompatActivity implements View.OnClickListener  {
    Button profile;
    Button bookAppo;
    Button cancelAppo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_option);
        setButtons();
        listenButtons();
    }
    private void listenButtons() {
        profile.setOnClickListener(this);
        bookAppo.setOnClickListener(this);
        cancelAppo.setOnClickListener(this);

    }

    private void setButtons() {
        profile= (Button) findViewById(R.id.profile);
        bookAppo= (Button) findViewById(R.id.bookAppointment);
        cancelAppo= (Button) findViewById(R.id.cancelAppointment);
    }


    @Override
    public void onClick(View v) {
        if(v==profile){
            Intent iii= new Intent(this,ClientProfileActivity.class);
            startActivity(iii);
        }
        else if(v==bookAppo){
            Intent ii = new Intent(this,BookAppointmentActivity.class);
            startActivity(ii);
        }
        else if(v==cancelAppo){
            Intent i = new Intent(this,CancelAppointmentActivity.class);
            startActivity(i);
        }
    }
}