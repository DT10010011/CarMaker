package com.example.carmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner wheelsSpinner;
    private Spinner frameSpinner;
    private Spinner windowsSpinner;
    // private Spinner headlightsSpinner;
    private static final String[] wheelOpt = {"Texture 1", "Texture 2", "Texture 3"};
    private static final String[] frameOpt = {"Red", "Green", "Blue"};
    private static final String[] windowOpt = {"Medium", "Dark", "Very Dark"};
    // private static final String[] headlightOpt = {"Clear", "Light", "Dark"};
    // private Object View;

    public static ImageView imageWheels;
    public static ImageView imageFrame;
    public static ImageView imageWindows;
    public static TextView info;
    public static TextView slot1Icon;
    public static TextView slot1SaveButton;
    public static TextView slot1OpenButton;
    public static TextView slot2Icon;
    public static TextView slot2SaveButton;
    public static TextView slot2OpenButton;
    public static TextView slot3Icon;
    public static TextView slot3SaveButton;
    public static TextView slot3OpenButton;

    private int[] slot1Indices = {0, 0, 0};
    private int[] slot2Indices = {0, 0, 0};
    private int[] slot3Indices = {0, 0, 0};
    private int wheelsNum = 0;
    private int frameNum = 0;
    private int windowsNum = 0;
    public int pageNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageWheels = (ImageView) findViewById(R.id.wheels);
        imageFrame = (ImageView) findViewById(R.id.frame);
        imageWindows = (ImageView) findViewById(R.id.windows);
        info = (TextView) findViewById(R.id.info);
        slot1Icon = (TextView) findViewById(R.id.slot1);
        slot1SaveButton = (TextView) findViewById(R.id.textView);
        slot1OpenButton = (TextView) findViewById(R.id.textView6); // Mixed up text view names by accident (1, 6, 4, 2, 5, 3, respectfully) and non-buttons are called "slot1", "slot" and "slot2"
        slot2Icon = (TextView) findViewById(R.id.slot);
        slot2SaveButton = (TextView) findViewById(R.id.textView4);
        slot2OpenButton = (TextView) findViewById(R.id.textView2);
        slot3Icon = (TextView) findViewById(R.id.slot2);
        slot3SaveButton = (TextView) findViewById(R.id.textView5);
        slot3OpenButton = (TextView) findViewById(R.id.textView3);

        // Separate spinners
        wheelsSpinner = (Spinner)findViewById(R.id.wheelsSpinner);
        frameSpinner = (Spinner)findViewById(R.id.frameSpinner);
        windowsSpinner = (Spinner)findViewById(R.id.windowsSpinner);
        // headlightsSpinner = (Spinner)findViewById(R.id.headlightsSpinner);
        ArrayAdapter<String> wheelsAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,wheelOpt);
        ArrayAdapter<String> frameAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,frameOpt);
        ArrayAdapter<String> windowsAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,windowOpt);

        wheelsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wheelsSpinner.setAdapter(wheelsAdapter);
        wheelsSpinner.setOnItemSelectedListener(this);

        frameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        frameSpinner.setAdapter(frameAdapter);
        frameSpinner.setOnItemSelectedListener(this);

        windowsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        windowsSpinner.setAdapter(windowsAdapter);
        windowsSpinner.setOnItemSelectedListener(this);

         wheelsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // https://stackoverflow.com/questions/20151414/how-can-i-use-onitemselected-in-android - set drawable values here

             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                 switch (position) {
//                     case 0:
//                         break;
                     case 0:
//                         Toast.makeText(parent.getContext(), "Spinner item 1!", Toast.LENGTH_SHORT).show();
                         imageWheels.setBackgroundResource(R.drawable.hondacivicwheels1cropped);
                         wheelsNum = 0;
                         break;
                     case 1:
                         imageWheels.setBackgroundResource(R.drawable.hondacivicwheels2cropped);
                         wheelsNum = 1;
                         break;
                     case 2:
                         imageWheels.setBackgroundResource(R.drawable.hondacivicwheels3cropped);
                         wheelsNum = 2;
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
                        frameNum = 0;
                        break;
                    case 1:
                        imageFrame.setBackgroundResource(R.drawable.hondacivicframegreencropped);
                        frameNum = 1;
                        break;
                    case 2:
                        imageFrame.setBackgroundResource(R.drawable.hondacivicframebluecropped);
                        frameNum = 2;
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
                        windowsNum = 0;
                        break;
                    case 1:
                        imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsdarkcropped);
                        windowsNum = 1;
                        break;
                    case 2:
                        imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsverydarkcropped);
                        windowsNum = 2;
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

    public void saveToSlot1(View v) {
        slot1Indices[0] = wheelsNum;
        slot1Indices[1] = frameNum;
        slot1Indices[2] = windowsNum;
    }

    public void saveToSlot2(View v) {
        slot2Indices[0] = wheelsNum;
        slot2Indices[1] = frameNum;
        slot2Indices[2] = windowsNum;
    }

    public void saveToSlot3(View v) {
        slot3Indices[0] = wheelsNum;
        slot3Indices[1] = frameNum;
        slot3Indices[2] = windowsNum;
    }

    public void openFromSlot1(View v) {
        wheelsNum = slot1Indices[0];
        frameNum = slot1Indices[1];
        windowsNum = slot1Indices[2];

        if (wheelsNum == 0) imageWheels.setBackgroundResource(R.drawable.hondacivicwheels1cropped);
        if (wheelsNum == 1) imageWheels.setBackgroundResource(R.drawable.hondacivicwheels2cropped);
        if (wheelsNum == 2) imageWheels.setBackgroundResource(R.drawable.hondacivicwheels3cropped);

        if (frameNum == 0) imageFrame.setBackgroundResource(R.drawable.hondacivicframeredcropped);
        if (frameNum == 1) imageFrame.setBackgroundResource(R.drawable.hondacivicframegreencropped);
        if (frameNum == 2) imageFrame.setBackgroundResource(R.drawable.hondacivicframebluecropped);

        if (windowsNum == 0) imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsnormalcropped);
        if (windowsNum == 1) imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsdarkcropped);
        if (windowsNum == 2) imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsverydarkcropped);
    }

    public void openFromSlot2(View v) {
        wheelsNum = slot2Indices[0];
        frameNum = slot2Indices[1];
        windowsNum = slot2Indices[2];

        if (wheelsNum == 0) imageWheels.setBackgroundResource(R.drawable.hondacivicwheels1cropped);
        if (wheelsNum == 1) imageWheels.setBackgroundResource(R.drawable.hondacivicwheels2cropped);
        if (wheelsNum == 2) imageWheels.setBackgroundResource(R.drawable.hondacivicwheels3cropped);

        if (frameNum == 0) imageFrame.setBackgroundResource(R.drawable.hondacivicframeredcropped);
        if (frameNum == 1) imageFrame.setBackgroundResource(R.drawable.hondacivicframegreencropped);
        if (frameNum == 2) imageFrame.setBackgroundResource(R.drawable.hondacivicframebluecropped);

        if (windowsNum == 0) imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsnormalcropped);
        if (windowsNum == 1) imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsdarkcropped);
        if (windowsNum == 2) imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsverydarkcropped);
    }

    public void openFromSlot3(View v) {
        wheelsNum = slot3Indices[0];
        frameNum = slot3Indices[1];
        windowsNum = slot3Indices[2];

        if (wheelsNum == 0) imageWheels.setBackgroundResource(R.drawable.hondacivicwheels1cropped);
        if (wheelsNum == 1) imageWheels.setBackgroundResource(R.drawable.hondacivicwheels2cropped);
        if (wheelsNum == 2) imageWheels.setBackgroundResource(R.drawable.hondacivicwheels3cropped);

        if (frameNum == 0) imageFrame.setBackgroundResource(R.drawable.hondacivicframeredcropped);
        if (frameNum == 1) imageFrame.setBackgroundResource(R.drawable.hondacivicframegreencropped);
        if (frameNum == 2) imageFrame.setBackgroundResource(R.drawable.hondacivicframebluecropped);

        if (windowsNum == 0) imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsnormalcropped);
        if (windowsNum == 1) imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsdarkcropped);
        if (windowsNum == 2) imageWindows.setBackgroundResource(R.drawable.hondacivicwindowsverydarkcropped);
    }

    public void switchPage(View v) {
//        imageWheels.setVisibility(View.INVISIBLE);
//        imageFrame.setVisibility(View.INVISIBLE);
//        imageWindows.setVisibility(View.INVISIBLE);


        if (pageNum == 1) {
            imageWheels.setVisibility(View.INVISIBLE);
            imageFrame.setVisibility(View.INVISIBLE);
            imageWindows.setVisibility(View.INVISIBLE);
            slot1Icon.setVisibility(View.INVISIBLE);
            slot1SaveButton.setVisibility(View.INVISIBLE);
            slot1OpenButton.setVisibility(View.INVISIBLE);
            slot2Icon.setVisibility(View.INVISIBLE);
            slot2SaveButton.setVisibility(View.INVISIBLE);
            slot2OpenButton.setVisibility(View.INVISIBLE);
            slot3Icon.setVisibility(View.INVISIBLE);
            slot3SaveButton.setVisibility(View.INVISIBLE);
            slot3OpenButton.setVisibility(View.INVISIBLE);
            info.setVisibility(View.VISIBLE);
            pageNum = 2;
        }
        else {
            imageWheels.setVisibility(View.VISIBLE);
            imageFrame.setVisibility(View.VISIBLE);
            imageWindows.setVisibility(View.VISIBLE);
            slot1Icon.setVisibility(View.VISIBLE);
            slot1SaveButton.setVisibility(View.VISIBLE);
            slot1OpenButton.setVisibility(View.VISIBLE);
            slot2Icon.setVisibility(View.VISIBLE);
            slot2SaveButton.setVisibility(View.VISIBLE);
            slot2OpenButton.setVisibility(View.VISIBLE);
            slot3Icon.setVisibility(View.VISIBLE);
            slot3SaveButton.setVisibility(View.VISIBLE);
            slot3OpenButton.setVisibility(View.VISIBLE);
            info.setVisibility(View.INVISIBLE);
            pageNum = 1;
        }
    }
}
