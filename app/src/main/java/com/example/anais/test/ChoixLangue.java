package com.example.anais.test;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ChoixLangue extends AppCompatActivity {

    private Button anglais;
    private Button francais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.choixlangue_vertical);
                anglais = findViewById(R.id.boutonanglais);
                anglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite(); }
                });

                francais = findViewById(R.id.boutonfrancais);
                francais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.chambre_horizontal);
                anglais = findViewById(R.id.boutonanglais);
                anglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });

                francais = findViewById(R.id.boutonfrancais);
                francais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });
                break;
        }
    }


    // protected void onConfigurationChanged (Bundle savedInstanceState) {

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.choixlangue_horizontal);

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.choixlangue_vertical);

        }
        anglais = findViewById(R.id.boutonanglais);
        francais = findViewById(R.id.boutonfrancais);
        anglais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite();

            }
        });

        francais = findViewById(R.id.boutonfrancais);
        francais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite2();
            }
        });
    }

    private void visualiser_la_suite() {
        Intent intent = new Intent(ChoixLangue.this, MenuPrincipalAnglais.class);
        startActivity(intent);

    }


    private void visualiser_la_suite2() {
            Intent intent2 = new Intent(ChoixLangue.this, MenuPrincipalFrancais.class);
        startActivity(intent2);
    }

}











