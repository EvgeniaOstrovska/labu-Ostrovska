package com.example.koval42ipzlab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         spinner = (Spinner) findViewById(R.id.spinner);
         textView = (TextView)findViewById(R.id.text);

    }
    public void onClick(View view)
    {
        int position = spinner.getSelectedItemPosition();
        String[] data2 = getResources().getStringArray(R.array.data2);
        textView.setText(data2[position]);
    }
}