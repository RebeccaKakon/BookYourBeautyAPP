package com.example.bookyourbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener    {
    private EditText email;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setEditText();
        listenButtons();
    }
    private void setEditText() {
        email= (EditText)findViewById(R.id.EmailAddress);
        password= (EditText) findViewById(R.id.Password);
        login= (Button) findViewById(R.id.Login);

    }
    private void listenButtons() {
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==login){
            Intent i = new Intent(this,ClientOptionActivity.class);
            startActivity(i);
        }
    }


}






