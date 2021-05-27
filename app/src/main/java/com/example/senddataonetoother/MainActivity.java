package com.example.senddataonetoother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText username,useremail,useraddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit=findViewById(R.id.submit);
        username=findViewById(R.id.username);
        useremail=findViewById(R.id.email);
        useraddress=findViewById(R.id.address);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,secondactivity.class);

                intent.putExtra("Username",username.getText().toString());
                intent.putExtra("Email",useremail.getText().toString());
                intent.putExtra("Address",useraddress.getText().toString());

                startActivity(intent);
            }
        });
    }
}