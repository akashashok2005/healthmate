package com.example.onlinenurse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ImageButton appoinment_btn = findViewById(R.id.imageButton);

        // Set an OnClickListener on the ImageButton
        appoinment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the next activity (NextActivity)
                Intent intent = new Intent(Home_page.this, appoinment_page.class);
                startActivity(intent);  // Start the next activity
            }
        });

        ImageButton exercise_btn = findViewById(R.id.imageButton6);

        // Set an OnClickListener on the ImageButton
        exercise_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the next activity (NextActivity)
                Intent intent = new Intent(Home_page.this, exercise_page.class);
                startActivity(intent);  // Start the next activity
            }
        });

        ImageButton medicine_btn = findViewById(R.id.imageButton7);

        // Set an OnClickListener on the ImageButton
        medicine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the next activity (NextActivity)
                Intent intent = new Intent(Home_page.this, medicine_page.class);
                startActivity(intent);  // Start the next activity
            }
        });


    }
}