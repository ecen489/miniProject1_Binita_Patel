package com.mycompany.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

public class vegan extends AppCompatActivity {
    int[] images = {R.drawable.avacado_toast,R.drawable.sandwich,R.drawable.tofu};
    String[] names ={"Avacado Toast", "Sandwich", "Tofu"};
    String[] description = {"Mini Avacdo Toast","Roasted Veggies and Hummus Sandwich","Tofu & Snow Pea stir fry with peanut sauce"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegan);
        ListView listView = (ListView)findViewById(R.id.veganList);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myIntent = new Intent(vegan.this,veganVideo1.class);
                    startActivity(myIntent);
                }
                if(position==1){
                    Intent myIntent1 = new Intent(vegan.this,veganVideo2.class);
                    startActivity(myIntent1);
                }
                if(position==2){
                    Intent myIntent2 = new Intent(vegan.this,veganVideo3.class);
                    startActivity(myIntent2);
                }
            }
        });

    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.veganfood,null);
            ImageView imageView = (ImageView)convertView.findViewById(R.id.imageView);
            TextView textView_name = (TextView)convertView.findViewById(R.id.textView_name);
            TextView textView_description = (TextView)convertView.findViewById(R.id.textView_description);
            imageView.setImageResource(images[position]);
            textView_name.setText(names[position]);
            textView_description.setText(description[position]);
            return convertView;
        }
    }
}
