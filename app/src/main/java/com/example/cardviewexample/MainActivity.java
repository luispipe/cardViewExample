package com.example.cardviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Forma básica
        MaterialButton action2= findViewById(R.id.buttonAct2);
        MaterialButton action1= findViewById(R.id.buttonAct1);

        action1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Action 1 Started",Toast.LENGTH_LONG).show();
            }
        });

        action2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Action 2 Started",Toast.LENGTH_LONG).show();
            }
        });


        //Forma Buenas prácticas del manejo de android
    }
}