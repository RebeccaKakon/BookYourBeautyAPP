package com.example.bookyourbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Client extends  AppCompatActivity{
    public String id_db;
    private String email;
    private String first_name;
    private String last_name;
    private String phone;
    private String date_birth;
    private boolean female;
    private boolean male;
    private String password;
    //private Button save;

public Client (String id,String email,String first_name, String last_name,String date_birth, boolean female,
               boolean male, String password,String phone){
    this.id_db=id;
    this.first_name=first_name;
    this.email=email;
    this.last_name=last_name;
    this.phone= phone;
    this.date_birth=date_birth;
    this.female= female;
    this.male=male;
    this.password=password;
}
public Client(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinet);
    }
}