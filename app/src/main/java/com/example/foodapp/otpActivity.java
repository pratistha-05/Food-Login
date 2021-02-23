package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class otpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        EditText b1=(EditText)findViewById((R.id.box1));
        EditText b2=(EditText)findViewById((R.id.box2));
        EditText b3=(EditText)findViewById((R.id.box3));
        EditText b4=(EditText)findViewById((R.id.box4));
        Button login=(Button)findViewById(R.id.button);
        Intent intent=getIntent();
        String str=intent.getStringExtra("key");
        b1.setText(Character.toString(str.charAt(0)));
        b2.setText(Character.toString(str.charAt(1)));
        b3.setText(Character.toString(str.charAt(2)));
        b4.setText(Character.toString(str.charAt(3)));
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(otpActivity.this, home.class);
                startActivity(mainIntent);
            }
        });



    }
}
