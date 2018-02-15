package com.example.jorge.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Vibrator;


public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button vibButton =(Button)findViewById(R.id.button_vibrate);
        vibButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //Set the pattern for vibration
                long pattern[]={0,200,100,300,400};
                Vibrator vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
                vibrator.vibrate(pattern, -1);


            }
        });

        Button inicio = (Button) findViewById(R.id.button4);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inicio = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(inicio);
            }
        });
    }

}
