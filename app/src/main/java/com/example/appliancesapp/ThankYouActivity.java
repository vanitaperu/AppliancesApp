package com.example.appliancesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ThankYouActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);

        Button button1 = findViewById(R.id.btn9);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if some condition is met (e.g., email and password are not empty)
                if (isConditionMet()) {
                    // Display a toast message
                    Toast.makeText(ThankYouActivity.this, "Thank You", Toast.LENGTH_SHORT).show();

                    // Create an Intent to open the second activity
                    Intent intent = new Intent(ThankYouActivity.this, SplashActivity.class);
                    startActivity(intent);
                } else {
                    // Condition is not met, display a different toast message
                    Toast.makeText(ThankYouActivity.this, "Thank You ", Toast.LENGTH_SHORT).show();
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
