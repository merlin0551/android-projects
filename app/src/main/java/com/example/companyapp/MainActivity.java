package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText et1, et2;
    String getNum1, getNum2;
    Integer num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.login);
        et1 = (EditText) findViewById(R.id.uname);
        et2 = (EditText) findViewById(R.id.pass);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1 = et1.getText().toString();
                getNum2 = et2.getText().toString();
                String correctuname = "admin";
                String correctpassword = "1234";

                if (getNum1.equals(correctuname) && getNum2.equals(correctpassword)) {

                    Intent obj = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(obj);
                } else {
                    Toast.makeText(getApplicationContext(), "invalid username or password", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}