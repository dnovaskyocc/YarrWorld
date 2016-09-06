package edu.orangecoastcollege.cs273.dnovasky.yarrworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Define the button as an instance variable
    Button speakButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Restoring user setting from a previous session
        super.onCreate(savedInstanceState);
        // Inflating (!) opening the layout called activity_main (activity_main.xml)
        setContentView(R.layout.activity_main);

        // Hook up the speak button to the one in our view
        speakButton = (Button) findViewById(R.id.toastButton);

        // Set the onClickListener and pass it a new onClickListener
        speakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Display toast when user click speakButton
                Toast.makeText(MainActivity.this, R.string.toast_message, Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
