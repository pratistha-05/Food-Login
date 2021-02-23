package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
EditText phn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        phn_no=(EditText)findViewById((R.id.edit_text));
        Button btn=(Button)findViewById((R.id.button));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=phn_no.getText().toString();
                int l=str.length();
                if(l<10)
                    Toast.makeText(getApplicationContext(),"Please Enter !0 digits",Toast.LENGTH_SHORT).show();
                else {
                    str = str.substring(l - 4, l);
                    Intent intent = new Intent(loginActivity.this, otpActivity.class);
                    intent.putExtra("key", str);
                    startActivity(intent);
                }
            }
        });
    }
}
