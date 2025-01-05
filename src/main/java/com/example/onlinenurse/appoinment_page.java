package com.example.onlinenurse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class appoinment_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appoinment_page);
        Button login_button = findViewById(R.id.ok);

        // Set an OnClickListener on the button
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to the next activity
                Intent intent = new Intent(appoinment_page.this, Home_page.class);
                startActivity(intent); // Start the next activity
            }
        });
    }
}