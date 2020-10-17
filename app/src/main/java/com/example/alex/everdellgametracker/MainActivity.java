package com.example.alex.everdellgametracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openGameCreator(View view) {
        Intent intent = new Intent(this, GameCreator.class);
        startActivity(intent);
    }

    public void openAppointmentCreator(View view) {
        Intent intent = new Intent(this, AppointmentCreator.class);
        startActivity(intent);
    }
}
