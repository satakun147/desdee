package com.example.speedcalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button checkButton = findViewById(R.id.clearbutton);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText distance = findViewById(R.id.editTextDistance);
                EditText time = findViewById(R.id.editTexttime);
                String textdis = distance.getText().toString();
                double dis = Double.parseDouble(textdis);
                String texttime = time.getText().toString();
                double ti = Double.parseDouble(texttime);
                double count = 0;
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                if (textdis.equals(null) || texttime.equals(null)) {
                    Toast t = Toast.makeText(MainActivity.this, "@string/req", Toast.LENGTH_LONG);
                    t.show();
                } else if (ti == 0) {
                    Toast t = Toast.makeText(MainActivity.this, "@string/zero", Toast.LENGTH_LONG);
                    t.show();
                } else {
                    count = (dis / ti) * 60 * 60 / 1000;
                }
                String str = String.format(
                        Locale.getDefault(), "%.2f", count;
                );

                if (count > 80) {
                    dialog.setTitle("SPEED CALCULATOR");
                    dialog.setMessage("@string/over");
                    dialog.setPositiveButton("OK", null);
                    dialog.show();
                }
            }
        });
    }
}