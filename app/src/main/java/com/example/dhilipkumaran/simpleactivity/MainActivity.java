package com.example.dhilipkumaran.simpleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button)findViewById(R.id.btnLogin);
        username = (EditText)findViewById(R.id.txtUserName);
        password = (EditText)findViewById(R.id.txtPassword);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString() == "admin" && password.getText().toString() == "pass"){
                    Toast.makeText(MainActivity.this,"Logged-in successfully",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this,Main2Activity.class);
                    i.putExtra("TestData","Hi"+username.getText().toString());
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this,"Invalid login",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
