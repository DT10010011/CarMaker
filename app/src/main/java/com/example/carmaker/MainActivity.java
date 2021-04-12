package com.example.carmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner wheelsSpinner;
    private Spinner frameSpinner;
    private Spinner windowsSpinner;
    private Spinner headlightsSpinner;
    private static final String[] wheelOpt = {"Texture 1", "Texture 2", "Texture 3"};
    private static final String[] frameOpt = {"Red", "Blue", "Gray"};
    private static final String[] windowOpt = {"Clear", "Light", "Dark"};
    private static final String[] headlightOpt = {"Clear", "Light", "Dark"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Separate spinners
        wheelsSpinner = (Spinner)findViewById(R.id.wheelsSpinner);
        frameSpinner = (Spinner)findViewById(R.id.frameSpinner);
        windowsSpinner = (Spinner)findViewById(R.id.windowsSpinner);
        headlightsSpinner = (Spinner)findViewById(R.id.headlightsSpinner);
        ArrayAdapter<String> wheelsAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,wheelOpt);
        ArrayAdapter<String> frameAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,frameOpt);
        ArrayAdapter<String> windowsAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,windowOpt);
        ArrayAdapter<String> headlightsAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,headlightOpt);

        wheelsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wheelsSpinner.setAdapter(wheelsAdapter);
        wheelsSpinner.setOnItemSelectedListener(this);

        frameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        frameSpinner.setAdapter(frameAdapter);
        frameSpinner.setOnItemSelectedListener(this);

        windowsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        windowsSpinner.setAdapter(windowsAdapter);
        windowsSpinner.setOnItemSelectedListener(this);

        headlightsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        headlightsSpinner.setAdapter(headlightsAdapter);
        headlightsSpinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
                break;
            case 2:
                // Whatever you want to happen when the thrid item gets selected
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }
}
