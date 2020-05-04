package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class jeu extends AppCompatActivity {

    //Nous sommes dans la salle de jeu et elle contient 4 zones clicables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.jeu_vertical);


                RelativeLayout guitare = findViewById(R.id.guitare);
                guitare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "guitare"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "tableau"); //Optional parameters
                        startActivity(i);

                    }
                });


                RelativeLayout xylophone = findViewById(R.id.xylophone);
                xylophone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "xylophone"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout pouf = findViewById(R.id.pouf);
                pouf.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "pouf"); //Optional parameters
                        startActivity(i);

                    }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.jeu_horizontal);

                guitare = findViewById(R.id.guitare);
                guitare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "guitare"); //Optional parameters
                        startActivity(i);

                    }
                });

                tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "tableau"); //Optional parameters
                        startActivity(i);

                    }
                });


                xylophone = findViewById(R.id.xylophone);
                xylophone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "xylophone"); //Optional parameters
                        startActivity(i);

                    }
                });

                pouf = findViewById(R.id.pouf);
                pouf.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "pouf"); //Optional parameters
                        startActivity(i);

                    }
                });
        }
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);


        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.jeu_horizontal);

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.jeu_vertical  );

        }
    }
}
