package com.example.appliancesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeDecor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_decor2);

        Button button1 = findViewById(R.id.btn5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if some condition is met (e.g., email and password are not empty)
                if (isConditionMet()) {
                    // Display a toast message
                    Toast.makeText(HomeDecor.this, "Condition is met", Toast.LENGTH_SHORT).show();

                    // Create an Intent to open the second activity
                    Intent intent = new Intent(HomeDecor.this, Second_Activity.class);
                    startActivity(intent);
                } else {
                    // Condition is not met, display a different toast message
                    Toast.makeText(HomeDecor.this, "Condition is not met", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Replace this method with your actual condition check
    private boolean isConditionMet() {
        // You can add your condition check logic here
        // For example, checking if email and password are not empty
        return true; // Return true if the condition is met, otherwise return false
    }
}
