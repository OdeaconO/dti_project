package com.example.pointsbin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.zxing.integration.android.IntentIntegrator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public class MainActivity extends AppCompatActivity {

            private TextView valueTextView;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                Button scanButton = findViewById(R.id.scan_button);
                scanButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Launch the QR scanner
                        IntentIntegrator integrator = new IntentIntegrator(MainActivity.this);
                        integrator.initiateScan();

                        // Add 50 to the value TextView
                        int currentValue = Integer.parseInt(valueTextView.getText().toString());
                        valueTextView.setText(String.valueOf(currentValue + 50));
                    }
                });

                valueTextView = findViewById(R.id.value_textview);
            }

            @Override
            protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                super.onActivityResult(requestCode, resultCode, data);

                // Handle the QR scan result
                IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
                if (result != null) {
                    String contents = result.getContents();

                    // Do something with the scanned data (e.g. display it in a TextView)
                    valueTextView.setText(contents);
                }
            }
        }
    }
}