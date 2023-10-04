package com.example.appliancesapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {

    // Set the duration of the splash screen in milliseconds
    private static final long SPLASH_DELAY = 5000; // 3 seconds

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Find the button by its ID
        Button btn1c = findViewById(R.id.btn1c);

        // Set an OnClickListener for the button
        btn1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the SignupActivity
                Intent intent = new Intent(SplashActivity.this, Signup.class);
                startActivity(intent);

                // Finish the splash activity
                finish();
            }
        });

        // Use a Handler to delay the start of the SignupActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the SignupActivity
                Intent intent = new Intent(SplashActivity.this, Signup.class);
                startActivity(intent);

                // Finish the splash activity
                finish();
            }
        }, SPLASH_DELAY);
    }
}
