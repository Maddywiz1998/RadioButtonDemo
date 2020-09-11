package com.example.karan.radiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup RadioGP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGP = findViewById(R.id.rdGp);
        //Event Handling OF Radio Button
        RadioGP.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.maleRadio:
                        Toast.makeText(MainActivity.this, "Male Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.femaleRadio:
                        Toast.makeText(MainActivity.this, "Female Selected", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
