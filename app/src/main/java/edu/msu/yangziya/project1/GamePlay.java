package edu.msu.yangziya.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GamePlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);
    }

    public void onRestart(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onShowRules(View view){
        Intent intent = new Intent(this, Rules.class);
        startActivity(intent);
    }

    public void onQuit(View view){
        Intent intent = new Intent(this, GameOver.class);
        startActivity(intent);
    }
}
