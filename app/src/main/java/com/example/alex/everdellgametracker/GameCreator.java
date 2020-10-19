package com.example.alex.everdellgametracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GameCreator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);

    }

    public void add(View view) {
        Intent intent = new Intent(GameCreator.this, PlayerScore.class);
        startActivity(intent);
    }


    public void save(View view) {
        Intent intent = new Intent(GameCreator.this,  MainActivity.class);
        startActivity(intent);
    }
}
