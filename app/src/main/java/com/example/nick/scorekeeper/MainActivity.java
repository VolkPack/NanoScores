package com.example.nick.scorekeeper;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    private int kills1 = 0;
    private int forts1 = 0;
    private int deaths1 =0;
    private int kills2 = 0;
    private int forts2 = 0;
    private int deaths2 =0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds Kills to TeamOne and Deaths to TeamTwo
     * Updates the Views accordingly
     * @param view
     */
    public void addKillsTeamOne(View view)
    {
        kills1 = kills1 + 1;
        deaths2 = deaths2 +1;
        TextView kills1_view = (TextView) findViewById(R.id.kills1_score);
        TextView deaths2_view = (TextView) findViewById(R.id.deaths2_score);
        kills1_view.setText(Integer.toString(kills1));
        deaths2_view.setText(Integer.toString(deaths2));
    }

    /**
     * Adds kills to TeamTwo and Deaths to TeamOne
     * Updates Views accordingly
     * @param view
     */
    public void addKillsTeamTwo(View view)
    {
        kills2 = kills2 + 1;
        deaths1 = deaths1 + 1;
        TextView kills2_view = (TextView) findViewById(R.id.kills2_score);
        TextView deaths1_view = (TextView) findViewById(R.id.deaths1_score);
        kills2_view.setText(Integer.toString(kills2));
        deaths1_view.setText(Integer.toString(deaths1));
    }

    /**
     * Adds Forts kills to team One.
     * Checks if number of Forts destroyed is 7
     * if Number of Forts destoyed is 7
     * displays Victory for TeamOne in Blue
     * and locks buttons preventing further scoring.
     * @param view
     */
    public void addFortsTeamOne(View view)
    {
        forts1 = forts1 + 1;
        TextView forts1_view = (TextView) findViewById(R.id.forts1_score);
        forts1_view.setText(Integer.toString(forts1));
        if(forts1 == 7)
        {
            TextView victory_view = (TextView) findViewById(R.id.victory_string);
            victory_view.setText(R.string.victory);
            victory_view.setTextColor(getResources().getColor(R.color.team1_name));
            lockButtons();
        }
    }

    /**
     * Adds Forts kills to team Two.
     * Checks if number of Forts destroyed is 7
     * if Number of Forts destoyed is 7
     * displays Victory for TeamOne in Red
     * and locks buttons preventing further scoring.
     * @param view
     */
    public void addFortsTeamTwo(View view)
    {
        forts2 = forts2 + 1;
        TextView forts2_view = (TextView) findViewById(R.id.forts2_score);
        forts2_view.setText(Integer.toString(forts2));
        if(forts2 == 7)
        {
            TextView victory_view = (TextView) findViewById(R.id.victory_string);
            victory_view.setText(R.string.victory);
            victory_view.setTextColor(getResources().getColor(R.color.team2_name));
            lockButtons();
        }
    }

    /**
     * Locks Buttons preventing Using
     */
    public void lockButtons()
    {
        ImageButton kills1 = (ImageButton) findViewById(R.id.kills1_button);
        ImageButton forts1 = (ImageButton) findViewById(R.id.forst1_button);
        ImageButton deaths1 = (ImageButton) findViewById(R.id.deaths1_button);

        ImageButton kills2 = (ImageButton) findViewById(R.id.kills2_button);
        ImageButton forts2 = (ImageButton) findViewById(R.id.forst2_button);
        ImageButton deaths2 = (ImageButton) findViewById(R.id.deaths2_button);

        kills1.setClickable(false);
        forts1.setClickable(false);
        deaths1.setClickable(false);
        kills2.setClickable(false);
        forts2.setClickable(false);
        deaths2.setClickable(false);
    }

    /**
     * Unlocks score buttons allowing use
     */
    public void unlockButtons()
    {
        ImageButton kills1 = (ImageButton) findViewById(R.id.kills1_button);
        ImageButton forts1 = (ImageButton) findViewById(R.id.forst1_button);
        ImageButton deaths1 = (ImageButton) findViewById(R.id.deaths1_button);

        ImageButton kills2 = (ImageButton) findViewById(R.id.kills2_button);
        ImageButton forts2 = (ImageButton) findViewById(R.id.forst2_button);
        ImageButton deaths2 = (ImageButton) findViewById(R.id.deaths2_button);

        kills1.setClickable(true);
        forts1.setClickable(true);
        deaths1.setClickable(true);
        kills2.setClickable(true);
        forts2.setClickable(true);
        deaths2.setClickable(true);
    }


    /**
     * Resets Kills, Deaths and Forts for Both Teams
     * Unlocks Buttons
     * Clears Victory From screen
     * @param view
     */
    public void resetScores(View view)
    {
        kills1 = 0;
        forts1 = 0;
        deaths1 =0;
        kills2 = 0;
        forts2 = 0;
        deaths2 =0;

        TextView kills1_view = (TextView) findViewById(R.id.kills1_score);
        TextView forts1_view = (TextView) findViewById(R.id.forts1_score);
        TextView deaths1_view = (TextView) findViewById(R.id.deaths1_score);
        TextView kills2_view = (TextView) findViewById(R.id.kills2_score);
        TextView forts2_view = (TextView) findViewById(R.id.forts2_score);
        TextView deaths2_view = (TextView) findViewById(R.id.deaths2_score);
        TextView victory_view = (TextView) findViewById(R.id.victory_string);

        kills1_view.setText(Integer.toString(kills1));
        forts1_view.setText(Integer.toString(forts1));
        deaths1_view.setText(Integer.toString(deaths1));
        kills2_view.setText(Integer.toString(kills2));
        forts2_view.setText(Integer.toString(forts2));
        deaths2_view.setText(Integer.toString(deaths2));
        victory_view.setText("");

        unlockButtons();
    }

    /**
     * Links to disclaimer activity
     * @param view
     */
    public void info(View view)
    {
        Intent disclaimer = new Intent(MainActivity.this, Disclaimer.class);
        MainActivity.this.startActivity(disclaimer);
    }

}
