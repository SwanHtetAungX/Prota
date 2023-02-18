package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Signup extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        if (getSupportActionBar() != null){
             getSupportActionBar().hide();
            ImageView signUpButton=findViewById(R.id.signUp);
            signUpButton.setOnClickListener(new View.OnClickListener() {
                @Override
                //To move to main activity and store user input data
                public void onClick(View view) {
                    EditText usernameTxt = findViewById(R.id.signupUsername);
                    String signUpUsername = usernameTxt.getText().toString();
                    EditText emailTxt = findViewById(R.id.signUpEmail);
                    String signUpEmail = emailTxt.getText().toString();
                    EditText passwordTxt = findViewById(R.id.signUpPassword);
                    String signPassword = passwordTxt.getText().toString();
                    Toast.makeText(Signup.this, "Welcome From Prota "+signUpUsername, Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Signup.this,MainActivity.class);
                    startActivity(intent);
                }
            });



        }
    }
    public void moveToSignIn(View view){
        Intent intent=new Intent(Signup.this,Login.class);
        startActivity(intent);
    }
}