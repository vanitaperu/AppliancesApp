package com.example.appliancesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(Second_Activity.this, ApplianceCategoryActivity.class);
                    startActivity(intent);
                }


            }
        };
        ListView listView = (ListView)  findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}