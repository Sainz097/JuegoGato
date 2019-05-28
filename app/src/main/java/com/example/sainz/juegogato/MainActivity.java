package com.example.sainz.juegogato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button cruz=(Button) findViewById(R.id.btnCruz);
        final Button O=(Button) findViewById(R.id.btnO);
        final Button empezar=(Button) findViewById(R.id.btnInicio);
        final TextView txt1=(TextView) findViewById(R.id.textView);
        final EditText entrada=(EditText) findViewById(R.id.editText);

        empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent juego=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(juego);

            }
        });
    }
}
