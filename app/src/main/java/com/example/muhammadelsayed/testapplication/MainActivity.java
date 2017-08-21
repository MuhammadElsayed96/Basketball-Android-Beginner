package com.example.muhammadelsayed.testapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamH_totalScore = 0;
    int teamG_totalScore = 0;
    TextView teamH_scoreLabel;
    TextView teamG_scoreLabel;
    Button teamH_addThree, teamH_addTwo, teamH_freeThrow;
    Button teamG_addThree, teamG_addTwo, teamG_freeThrow;
    Button resetEverything_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //HOST TEAM
        teamH_scoreLabel = (TextView) findViewById(R.id.teamH_score_label);
        teamH_addThree = (Button) findViewById(R.id.teamH_addThree_btn);
        teamH_addTwo = (Button) findViewById(R.id.teamH_addTwo_btn);
        teamH_freeThrow = (Button) findViewById(R.id.teamH_FreeThrow_btn);
        resetEverything_btn = (Button) findViewById(R.id.resetAll_btn);

        teamH_addThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamH_totalScore += 3;
                teamH_scoreLabel.setText(Integer.toString(teamH_totalScore));   //or String.valueOf(totalScore)
            }
        });


        teamH_addTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamH_totalScore += 2;
                teamH_scoreLabel.setText(Integer.toString(teamH_totalScore));   //or String.valueOf(totalScore)
            }
        });

        teamH_freeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamH_totalScore += 1;
                teamH_scoreLabel.setText(Integer.toString(teamH_totalScore));   //or String.valueOf(totalScore)
            }
        });


        //GUEST TEAM
        teamG_scoreLabel = (TextView) findViewById(R.id.teamG_score_label);
        teamG_addThree = (Button) findViewById(R.id.teamG_addThree_btn);
        teamG_addTwo = (Button) findViewById(R.id.teamG_addTwo_btn);
        teamG_freeThrow = (Button) findViewById(R.id.teamG_freeThrow_btn);

        teamG_addThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamG_totalScore += 3;
                teamG_scoreLabel.setText(String.valueOf(teamG_totalScore));
            }
        });

        teamG_addTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamG_totalScore += 2;
                teamG_scoreLabel.setText(String.valueOf(teamG_totalScore));
            }
        });

        teamG_freeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamG_totalScore += 1;
                teamG_scoreLabel.setText(String.valueOf(teamG_totalScore));
            }
        });

        //RESET EVERYTHING
        resetEverything_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamH_totalScore = 0;
                teamG_totalScore = 0;
                teamH_scoreLabel.setText(String.valueOf(teamH_totalScore));
                teamG_scoreLabel.setText(String.valueOf(teamG_totalScore));
            }
        });
    }
}
