package com.rosa.retos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Contador extends AppCompatActivity {
    TextView counterTextView;
    private int count;

    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        counterTextView = findViewById(R.id.counterTextView);
        count = 0;

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                if (count <= 50) {
                    counterTextView.setText(String.valueOf(count));
                    count++;
                    handler.postDelayed(this, 2000); // 2000 milliseconds = 2 seconds
                }
            }
        };

        handler.postDelayed(runnable, 2000); // Start the counter after 2 seconds
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable); // Stop the counter when the activity is destroyed
    }
}


