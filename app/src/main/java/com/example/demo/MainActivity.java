package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int loginClickCounter;
    int logoutClickCounter;
    private Button loginButton;
    private Button logoutButton;
    private Button resetButton;
    private TextView textViewLogin;
    private TextView textViewLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);
        logoutButton = findViewById(R.id.logoutButton);

        resetButton = findViewById(R.id.resetButton);

        textViewLogin = findViewById(R.id.loginButtonClickedText);
        textViewLogout = findViewById(R.id.logoutButtonClickedText);

    }

    public void showMessage(View view) {

        //        when login button is clicked
        if(view.getId() == R.id.loginButton) {
            loginClickCounter++;
            if(loginClickCounter <= 1) {
                textViewLogin.setText("LOGIN button clicked " + loginClickCounter + " time.");
            }
            else {
                textViewLogin.setText("LOGIN button clicked " + loginClickCounter + " times.");
            }
        }

        //        when logout button is clicked
        else if(view.getId() == R.id.logoutButton) {
            logoutClickCounter++;
            if(logoutClickCounter <= 1) {
                textViewLogout.setText("LOGOUT button clicked " + logoutClickCounter + " time.");
            }
            else {
                textViewLogout.setText("LOGOUT button clicked " + logoutClickCounter + " times.");
            }
        }

        //        when reset button is clicked
        else if(view.getId() == R.id.resetButton) {
            loginClickCounter = 0;
            logoutClickCounter = 0;


            //  Toast notification
            Toast toast = Toast.makeText(MainActivity.this, R.string.counterResetToast, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM, 0,0);
            toast.show();
//            Toast.makeText(MainActivity.this, "Counter has been reset", Toast.LENGTH_SHORT).show();

            textViewLogin.setText("LOGIN button clicked " + loginClickCounter + " time.");
            textViewLogout.setText("LOGOUT button clicked " + logoutClickCounter + " time.");
        }
    }
}