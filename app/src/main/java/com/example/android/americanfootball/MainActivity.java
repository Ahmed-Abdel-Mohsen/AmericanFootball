package com.example.android.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addSixForTeamA(View view) {
        displayForTeamA(6);
    }

    public void addThreeForTeamA(View view) {
        displayForTeamA(3);
    }

    public void addTwoForTeamA(View view) {
        displayForTeamA(2);
    }

    public void addOneForTeamA(View view) {
        displayForTeamA(1);
    }

    private void displayForTeamA(int value) {
        TextView A_Score = (TextView) findViewById(R.id.textview_scoreA);
        scoreTeamA += value;
        A_Score.setText("" + scoreTeamA);
    }

    public void addSixForTeamB(View view) {
        displayForTeamB(6);
    }

    public void addThreeForTeamB(View view) {
        displayForTeamB(3);
    }

    public void addTwoForTeamB(View view) {
        displayForTeamB(2);
    }

    public void addOneForTeamB(View view) {
        displayForTeamB(1);
    }

    private void displayForTeamB(int value) {
        TextView B_Score = (TextView) findViewById(R.id.textview_scoreB);
        scoreTeamB += value;
        B_Score.setText("" + scoreTeamB);
    }

    public void Reset(View view) {
        TextView A_Score = (TextView) findViewById(R.id.textview_scoreA);
        TextView B_Score = (TextView) findViewById(R.id.textview_scoreB);
        scoreTeamA = 0;
        scoreTeamB = 0;
        A_Score.setText("" + scoreTeamA);
        B_Score.setText("" + scoreTeamB);
    }
}
