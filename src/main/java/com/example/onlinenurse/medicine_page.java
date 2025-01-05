package com.example.onlinenurse;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class medicine_page extends AppCompatActivity {

    private EditText medicineNameEditText, medicineTimeEditText;
    private Button submitButton;
    private TextView displayTextView;
    public StringBuilder medicinesList = new StringBuilder(); // To store and display the list of medicines

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_page);

        // Initialize views
        medicineNameEditText = findViewById(R.id.medicineNameEditText);
        medicineTimeEditText = findViewById(R.id.medicineTimeEditText);
        submitButton = findViewById(R.id.submitButton);
        displayTextView = findViewById(R.id.displayTextView);

        // Set OnClickListener for the Submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text input from both EditText views
                String medicineName = medicineNameEditText.getText().toString().trim();
                String medicineTime = medicineTimeEditText.getText().toString().trim();



                // Check if the inputs are valid
                if (!medicineName.isEmpty() && !medicineTime.isEmpty()) {
                    // Add the medicine and time to the list
                    medicinesList.append("Medicine: ").append(medicineName)
                            .append(", Time: ").append(medicineTime).append("\n");

                    // Display the updated list in the TextView
                    displayTextView.setText(medicinesList.toString());

                    // Show a toast with the medicine name and time
                    Toast.makeText(medicine_page.this,
                            "Medicine: " + medicineName + " is scheduled for " + medicineTime,
                            Toast.LENGTH_LONG).show();

                    // Clear the input fields
                    medicineNameEditText.setText("");
                    medicineTimeEditText.setText("");
                } else {
                    // Show error message if inputs are empty
                    Toast.makeText(medicine_page.this, "Please fill in both fields", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
