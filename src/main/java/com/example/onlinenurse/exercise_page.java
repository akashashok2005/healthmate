package com.example.onlinenurse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.onlinenurse.R;

public class exercise_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_page);

        // Set up click listeners for each exercise image
        ImageView imageExercise1 = findViewById(R.id.imageExercise1);
        ImageView imageExercise2 = findViewById(R.id.imageExercise2);
        ImageView imageExercise3 = findViewById(R.id.imageExercise3);
        ImageView imageExercise4 = findViewById(R.id.imageExercise4);

        // Assign YouTube video links to each image
        imageExercise1.setOnClickListener(v -> openYouTubeVideo("https://youtu.be/laIWV6qJWbk?si=2O7fuLEYN7G8lEPk"));
        imageExercise2.setOnClickListener(v -> openYouTubeVideo("https://youtu.be/mQLzNf8VOIc?si=d2WLjPtlDaczzzp2"));
        imageExercise3.setOnClickListener(v -> openYouTubeVideo("https://youtu.be/bO6NNfX_1ns?si=D_ePcKjPv-D-DQOP"));
        imageExercise4.setOnClickListener(v -> openYouTubeVideo("https://youtu.be/E2YqFYFLSbE?si=GsCu4tEFpz7z_i0x"));
    }

    /**
     * Opens the given YouTube video link in a browser or YouTube app.
     *
     * @param url The URL of the YouTube video.
     */
    private void openYouTubeVideo(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
