package com.example.uefa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreNew = 0;
    int scoreAus = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForAus(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreAus);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForNew(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreNew);
        scoreView.setText(String.valueOf(score));
    }

    public void restScore(View view){
        scoreNew = 0;
        scoreAus = 0;
        displayForAus(scoreAus);
        displayForNew(scoreNew);
    }

    public void tryAus(View view){
        scoreAus = scoreAus + 5;
        displayForAus(scoreAus);
    }
    public void goalKickAus(View view){
        scoreAus = scoreAus + 2;
        displayForAus(scoreAus);
    }
    public void penalty(View view){
        scoreAus = scoreAus + 2;
        displayForAus(scoreAus);
    }
    public void dropGoal(View view){
        scoreAus = scoreAus + 1;
        displayForAus(scoreAus);
    }



    public void tryNew(View view){
        scoreNew = scoreNew + 5;
        displayForNew(scoreNew);
    }
    public void goalKickNew(View view){
        scoreNew= scoreNew + 2;
        displayForNew(scoreNew);
    }
    public void penaltyNew(View view){
        scoreNew = scoreNew + 2;
        displayForNew(scoreNew);
    }
    public void dropGoalNew(View view){
        scoreNew = scoreNew + 1;
        displayForNew(scoreNew);
    }


}
