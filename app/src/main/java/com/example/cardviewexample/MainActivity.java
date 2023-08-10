package com.example.cardviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.cardviewexample.databinding.ActivityMainBinding;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Forma básica
        MaterialButton action2= findViewById(R.id.buttonAct2);
        MaterialButton action1= findViewById(R.id.buttonAct1);

        //Forma Buenas prácticas del manejo de android
        MaterialButton act1= binding.buttonAct1;
        MaterialButton act2= binding.buttonAct2;

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





    }
}