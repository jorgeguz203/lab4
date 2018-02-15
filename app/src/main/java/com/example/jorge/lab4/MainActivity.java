package com.example.jorge.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Child1 = (Button) findViewById(R.id.button);
        Button Child2 = (Button) findViewById(R.id.button2);
        Button Child3 = (Button) findViewById(R.id.button3);

        Child1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagina1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(pagina1);
            }
        });

        Child2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagina2 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(pagina2);
            }
        });

        Child3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagina3 = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(pagina3);
            }
        });
    }
}
