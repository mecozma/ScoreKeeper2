package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Variables
     */

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    /**
     * Touchdown method team A
     */

    public void sixPointsTeamA(View v) {
        scoreTeamA += 6;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * Field goal method +3 points team A
     */

    public void threePointsTeamA(View v) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * Extra point method +2 points team A
     */

    public void twoPointsTeamA(View v) {
        scoreTeamA +=2;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * Touchdown method team B
     */

    public void sixPointsTeamB(View v) {
        scoreTeamB += 6;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * Field goal method +3 points team B
     */

    public void threePointsTeamB(View v) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * Extra point method +2 points team B
     */

    public void twoPointsTeamB(View v) {
        scoreTeamB +=2;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * Reset score method
     */

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * This method displays the score for team A
     */

    public void displayScoreTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the score for team B
     */

    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
