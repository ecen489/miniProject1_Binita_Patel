package com.mycompany.miniproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class veganVideo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegan_video1);
        TextView myTextView = (TextView)findViewById(R.id.text);
        myTextView.setMovementMethod(new ScrollingMovementMethod());
        String data = "";
        StringBuffer buffer = new StringBuffer();
        InputStream is = this.getResources().openRawResource(R.raw.toast);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        if(is != null){
            try {
                while ((data = reader.readLine()) != null){
                    buffer.append(data + "\n");
                }
                myTextView.setText(buffer);
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
