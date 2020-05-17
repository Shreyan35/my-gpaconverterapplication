package com.gmail.sengupta.shreyan13.gpaconverter;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WorkActivity extends AppCompatActivity {


    Button backButton;

    public void convertGpa(View view){

        Log.i("info","Button pressed");
        EditText editText = (EditText)findViewById(R.id.editText);

        String numberInPoints = editText.getText().toString();

        double numberInPointsDouble = Double.parseDouble(numberInPoints);
        numberInPointsDouble = numberInPointsDouble - 0.75;
        double numberInPerDouble = numberInPointsDouble * 10;
        @SuppressLint("DefaultLocale") String numberInPerString = String.format("%2f", numberInPerDouble);
        Toast.makeText(this, numberInPoints + "  is" + numberInPerString + "%", Toast.LENGTH_LONG).show();



        Log.i("Info",editText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        backButton= findViewById(R.id.back);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent (WorkActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
