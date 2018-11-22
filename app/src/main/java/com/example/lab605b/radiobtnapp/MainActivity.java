package com.example.lab605b.radiobtnapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton Paris,Rome,Beirut,Berlin,London;
    String selectedCity;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Paris = findViewById(R.id.rParis);
        Beirut = findViewById(R.id.rBeirut);
        London = findViewById(R.id.rLondon);
        Berlin = findViewById(R.id.rBerlin);
        Rome = findViewById(R.id.rRome);

        submit = findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Paris.isChecked()){
                    selectedCity = Paris.getText().toString();
                }else if(Beirut.isChecked()){
                    selectedCity = Beirut.getText().toString();
                }else if(Rome.isChecked()){
                    selectedCity = Rome.getText().toString();
                }else if(Berlin.isChecked()){
                    selectedCity = Berlin.getText().toString();
                }else if(London.isChecked()){
                    selectedCity = London.getText().toString();
                }
                Toast.makeText(getApplicationContext(), selectedCity, Toast.LENGTH_LONG).show();
            }
        });
    }
}
