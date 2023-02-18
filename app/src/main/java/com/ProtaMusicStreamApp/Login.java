package com.ProtaMusicStreamApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //remove actionbar
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();}

        ImageView signInButton = findViewById(R.id.signIn);

        //create onclick listener move to main activity with authentication
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailTxt = findViewById(R.id.signupUsername);
                String signEmail = emailTxt.getText().toString();
                EditText passwordTxt = findViewById(R.id.signUpPassword);
                String signPassword = passwordTxt.getText().toString();
                if(signEmail.equals("swanhtetaung@gmail.com") && signPassword.equals("123")){
                    Intent intent =new Intent(Login.this, MainActivity.class);
                    startActivity(intent);}
                else {
                    Toast.makeText(Login.this, "incorrect email/password", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    //To move to signup
    public void moveToSignUp(View view){
        Intent intent=new Intent(Login.this, Signup.class);
        startActivity(intent);
    };
}