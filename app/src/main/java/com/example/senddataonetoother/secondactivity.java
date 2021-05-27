package com.example.senddataonetoother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {
    TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        txt1=findViewById(R.id.getusername);
        txt2=findViewById(R.id.getuseremail);
        txt3=findViewById(R.id.getuseraddress);
        Intent intent=getIntent();
        String name=intent.getStringExtra("Username");
        String email=intent.getStringExtra("Email");
        String address=intent.getStringExtra("Address");
        txt1.setText(name);
        txt2.setText(email);
        txt3.setText(address);
    }
}