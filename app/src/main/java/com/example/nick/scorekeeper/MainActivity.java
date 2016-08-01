package com.example.nick.scorekeeper;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends ActionBarActivity {

    public int kills1 = 0;
    public int forts1 = 0;
    public int deaths1 =0;

    public int kills2 = 0;
    public int forts2 = 0;
    public int deaths2 =0;






    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void addKillsTeamOne(View view)
    {
        kills1 = kills1 + 1;
        deaths2 = deaths2 +1;
        TextView kills1_view = (TextView) findViewById(R.id.kills1_score);
        TextView deaths2_view = (TextView) findViewById(R.id.deaths2_score);
        kills1_view.setText(Integer.toString(kills1));
        deaths2_view.setText(Integer.toString(deaths2));

    }

    public void resetScores(View view)
    {
        kills1 = 0;
        forts1 = 0;
        deaths1 =0;
        kills2 = 0;
        forts2 = 0;
        deaths2 =0;

        TextView kills1_view = (TextView) findViewById(R.id.kills1_score);
        TextView forts1_view = (TextView) findViewById(R.id.forst1_score);
        TextView deaths1_view = (TextView) findViewById(R.id.deaths1_score);
        TextView kills2_view = (TextView) findViewById(R.id.kills2_score);
        TextView forts2_view = (TextView) findViewById(R.id.forts2_score);
        TextView deaths2_view = (TextView) findViewById(R.id.deaths2_score);

        kills1_view.setText(Integer.toString(kills1));
        forts1_view.setText(Integer.toString(forts1));
        deaths1_view.setText(Integer.toString(deaths1));
        kills2_view.setText(Integer.toString(kills2));
        forts2_view.setText(Integer.toString(forts2));
        deaths2_view.setText(Integer.toString(deaths2));
    }

}
