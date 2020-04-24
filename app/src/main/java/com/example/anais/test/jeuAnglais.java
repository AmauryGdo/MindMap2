package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class jeuAnglais extends AppCompatActivity {

    //Nous sommes dans la salle de jeu et elle contient 4 zones clicables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.jeu_verticalanglais);


                RelativeLayout guitare = findViewById(R.id.guitare);
                guitare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeuAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "guitare"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeuAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "tableau"); //Optional parameters
                        startActivity(i);

                    }
                });


                RelativeLayout xylophone = findViewById(R.id.table);
                xylophone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeuAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "xylophone"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout pouf = findViewById(R.id.pouf);
                pouf.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeuAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "pouf"); //Optional parameters
                        startActivity(i);

                    }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.jeu_horizontalanglais);

                guitare = findViewById(R.id.guitare);
                guitare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeuAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "guitare"); //Optional parameters
                        startActivity(i);

                    }
                });

                tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeuAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "tableau"); //Optional parameters
                        startActivity(i);

                    }
                });


                xylophone = findViewById(R.id.table);
                xylophone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeuAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "xylophone"); //Optional parameters
                        startActivity(i);

                    }
                });

                pouf = findViewById(R.id.pouf);
                pouf.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeuAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "pouf"); //Optional parameters
                        startActivity(i);

                    }
                });
        }
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.jeu_horizontalanglais);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.jeu_verticalanglais  );

        }
    }
}
