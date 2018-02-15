package com.example.jorge.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.hardware.Camera;

public class Main3Activity extends AppCompatActivity {

    Camera camera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        camera = Camera.open();


        Button onButton =(Button)findViewById(R.id.buttonTorch);
        onButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Camera.Parameters param = camera.getParameters();
                param.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                camera.setParameters(param);
                camera.startPreview();

            }
        });

        Button offButton =(Button)findViewById(R.id.buttonOff);
        offButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                camera.release();

            }
        });

        Button inicio = (Button) findViewById(R.id.button5);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inicio = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(inicio);
            }
        });
    }
}
