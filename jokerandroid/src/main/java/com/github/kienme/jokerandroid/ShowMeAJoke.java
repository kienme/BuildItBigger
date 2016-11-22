package com.github.kienme.jokerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMeAJoke extends AppCompatActivity {

    public static final String JOKER_EXTRA = "JOKER_EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_me_ajoke);

        Intent intent = getIntent();
        if(intent != null && intent.hasExtra(JOKER_EXTRA)) {
            if(intent.getStringExtra(JOKER_EXTRA) != null) {
                ((TextView) findViewById(R.id.joke_text)).setText(intent.getStringExtra(JOKER_EXTRA));
            }
        }
    }
}
