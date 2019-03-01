package com.mycompany.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.GridLayout;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    GridLayout mainGrid;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//get view from activity_main.xml
        //Locat the button
        button1 = (Button)findViewById(R.id.vegButton);
        button2 = (Button)findViewById(R.id.veganButton);
        //capture button clicks
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntenet = new Intent(MainActivity.this,veg.class);
                startActivity(myIntenet);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntenet1 = new Intent(MainActivity.this,vegan.class);
                startActivity(myIntenet1);
            }
        });

    }

}
