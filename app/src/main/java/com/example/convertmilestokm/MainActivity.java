package com.example.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConvKmToMiles =(Button) findViewById(R.id.buttonKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxKm=(EditText) findViewById(R.id.editTextKm);
                EditText textBoxMiles=(EditText) findViewById(R.id.editTextMiles);
                double vKm=Double.valueOf(textBoxKm.getText().toString());
                double vMiles = vKm/1.609;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMiles));
            }
        });

        Button buttonConvMilesToKm = findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxKm=(EditText) findViewById(R.id.editTextKm);
                EditText textBoxMiles=(EditText) findViewById(R.id.editTextMiles);
                double vMiles=Double.valueOf(textBoxMiles.getText().toString());
                Double vKm= vMiles/0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKm));
            }
        });

    }
}