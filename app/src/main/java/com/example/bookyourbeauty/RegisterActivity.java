package com.example.bookyourbeauty;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    EditText email;
    EditText first_name;
    EditText last_name;
    EditText phone;
    EditText date_birth;
    RadioButton female;
    RadioButton male;
    EditText password;
    Button save;
    private FirebaseAuth mAuth;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference dbRefRoot = database.getReference();
    //dbRef= database.getReference(/....../) mikum spetsifi !!!


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setEditText();
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    private void setEditText() {
        email = (EditText) findViewById(R.id.EmailAddress);
        first_name = (EditText) findViewById(R.id.FirstName);
        last_name = (EditText) findViewById(R.id.LastName);
        phone = (EditText) findViewById(R.id.Phone);
        date_birth = (EditText) findViewById(R.id.Date);
        female = (RadioButton) findViewById(R.id.Female);
        male = (RadioButton) findViewById(R.id.Male);
        password = (EditText) findViewById(R.id.Password);
        save = (Button) findViewById(R.id.Save);
        save.setOnClickListener(this);

    }

                                    public void creatAccount(String Email, String Pass) {
                                        mAuth.createUserWithEmailAndPassword(Email, Pass)
                                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                                        if (task.isSuccessful()) {
                                                            // Sign in success, update UI with the signed-in user's information
                                                            Log.d("TAG", "createUserWithEmail:success");
                                                            FirebaseUser user = mAuth.getCurrentUser();
                                                            //updateUI(user);
                                                        } else {
                                                            // If sign in fails, display a message to the user.
                                                            Log.w("TAG", "createUserWithEmail:failure", task.getException());
//                                    Toast.makeText(, "Authentication failed.",
//                                            Toast.LENGTH_SHORT).show();
                                                            //updateUI(null);
                                                        }

                                                        // ...
                                                    }
                                                });

                                    }

    @Override
    public void onClick(View v) {
        if(v==save){
            String fName = first_name.getText().toString().trim();
            String lName = last_name.getText().toString().trim();
            String Email = email.getText().toString().trim();
            String Phone = phone.getText().toString().trim();
            String pass = password.getText().toString().trim();
            creatAccount(Email, pass);
        }

    }
}