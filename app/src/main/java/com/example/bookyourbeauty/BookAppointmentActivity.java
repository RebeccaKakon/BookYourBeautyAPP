package com.example.bookyourbeauty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Spinner;

public class BookAppointmentActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner treatmentOptionSpinner;
    Spinner dateOptionSpinner;
    Spinner startTimeSpinner;
    Spinner endTimeSpinner;
    Button search;
    EditText dateOption;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_appointment);

        treatmentOptionSpinner = (Spinner) findViewById(R.id.treatmentOption_spinner);
//        dateOptionSpinner = (Spinner) findViewById(R.id.dateOption_Spinner);
        startTimeSpinner = (Spinner) findViewById(R.id.startTime_Spinner);
        endTimeSpinner = (Spinner) findViewById(R.id.endTime_Spinner);
        search = (Button) findViewById(R.id.Search);
        dateOption=(EditText) findViewById(R.id.DateOption);

        String[] treatmentOptionArray= {"treatmentOption","nails gel polish", "Eyebrow wax"};
        ArrayAdapter<String> adp= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,treatmentOptionArray);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        treatmentOptionSpinner.setAdapter(adp);

        //date
//        String[] dateOptionArray= {"date Option","?", "??"};
//        ArrayAdapter<String> adp2= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,dateOptionArray);
//        adp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        dateOptionSpinner.setAdapter(adp2);

        //start time
        String[] startTimeArray= {"start Time","7:00","8:00", "9:00","10:00","11:00","12:00","13:00",
                "14:00","15:00","16:00"};
        ArrayAdapter<String> adp3= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,startTimeArray);
        adp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        startTimeSpinner.setAdapter(adp3);

        //end time
        String[] endTimeArray= {"end Time","8:00", "9:00","10:00","11:00","12:00","13:00",
                "14:00","15:00","16:00"};
        ArrayAdapter<String> adp4= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,endTimeArray);
        adp4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        endTimeSpinner.setAdapter(adp4);
    }

    @Override
    public void onClick(View v) {
        if(v==search){
            String choosenTreatment = treatmentOptionSpinner.getTransitionName().toString().trim();
            String  choosenDate= dateOption.getText().toString().trim();
            String choosenStartTime = startTimeSpinner.getTransitionName().toString().trim();
            String choosenEndTime = endTimeSpinner.getTransitionName().toString().trim();
            searchApointment(choosenTreatment, choosenDate, choosenStartTime,choosenEndTime);
        }

    }

    private void searchApointment(String choosenTreatment, String choosenDate,
                                  String choosenStartTime, String choosenEndTime) {


    }
}