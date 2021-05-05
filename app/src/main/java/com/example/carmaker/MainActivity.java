package com.example.carmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner wheelsSpinner;
    private Spinner frameSpinner;
    private Spinner windowsSpinner;
    private Spinner headlightsSpinner;
    private static final String[] wheelOpt = {"Texture 1", "Texture 2", "Texture 3"};
    private static final String[] frameOpt = {"Red", "Green", "Blue"};
    private static final String[] windowOpt = {"Medium", "Dark", "Very Dark"};
    private static final String[] headlightOpt = {"Clear", "Light", "Dark"};
    // private Object View;

    public static ImageView imageWheels;
    public static ImageView imageFrame;
    public static ImageView imageWindows;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageWheels = (ImageView) findViewById(R.id.wheels);
        imageFrame = (ImageView) findViewById(R.id.frame);
        imageWindows = (ImageView) findViewById(R.id.windows);

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

         wheelsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // https://stackoverflow.com/questions/20151414/how-can-i-use-onitemselected-in-android - set drawable values here

             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                 switch (position) {
//                     case 0:
//                         break;
                     case 0:
//                         Toast.makeText(parent.getContext(), "Spinner item 1!", Toast.LENGTH_SHORT).show();
                         imageWheels.setBackgroundResource(R.drawable.hondacivicwheels1cropped);
                         break;
                     case 1:
                         imageWheels.setBackgroundResource(R.drawable.hondacivicwheels2cropped);
                         break;
                     case 2:
                         imageWheels.setBackgroundResource(R.drawable.hondacivicwheels3cropped);
                         break;
                 }
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {


             }
         });

        frameSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // https://stackoverflow.com/questions/20151414/how-can-i-use-onitemselected-in-android - set drawable values here

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
//                     case 0:
//                         break;
                    case 0:
//                         Toast.makeText(parent.getContext(), "Spinner item 1!", Toast.LENGTH_SHORT).show();
                        imageFrame.setBackgroundResource(R.drawable.hondacivicframeredcropped);
                        break;
                    case 1:
                        imageFrame.setBackgroundResource(R.drawable.hondacivicframegreencropped);
                        break;
                    case 2:
                        imageFrame.setBackgroundResource(R.drawable.hondacivicframebluecropped);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

        windowsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // https://stackoverflow.com/questions/20151414/how-can-i-use-onitemselected-in-android - set drawable values here

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
//                     case 0:
//                         break;
                    case 0:
//                         Toast.makeText(parent.getContext(), "Spinner item 1!", Toast.LENGTH_SHORT).show();
                        imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsnormalcropped);
                        break;
                    case 1:
                        imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsdarkcropped);
                        break;
                    case 2:
                        imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsverydarkcropped);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
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

    // @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }
}
