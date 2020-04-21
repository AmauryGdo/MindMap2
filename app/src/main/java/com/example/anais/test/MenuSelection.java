//NE SERT A RIEN
// residu




package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;


public class MenuSelection extends AppCompatActivity {
    private ImageButton salledebain;
    private ImageButton cuisineon;
    private ImageButton jeu;
    private ImageButton jardin;
    private ImageButton salon;
    private ImageButton chambre;
    private ImageButton cuisineoff;

    int i=0;


    // Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {
            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.menu_selection_vertical);

                chambre = findViewById(R.id.chambre);
                chambre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });
//test cuisine--------------------------------------------------------------------------------------------------------------
               //initialisation du bouton On et de son listeneur vers l'activity Cuisine
                cuisineon = findViewById(R.id.cuisine);
                cuisineon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }

                });
                // initialisation du bouton off
                cuisineoff = findViewById(R.id.cuisineoff);

                //initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton on

                cuisineon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        cuisineoff.setVisibility(View.VISIBLE); //le bouton off remplace le bouton ON
                        cuisineon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"Cuisine supprimée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });
//initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton off

                cuisineoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        cuisineoff.setVisibility(View.GONE); //le bouton on remplace le bouton off
                        cuisineon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"Cuisine ajoutée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

// fin test Cuisine------------------------------------------------------------------------------------------------------------------
                jardin = findViewById(R.id.jardin);
                jardin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite3();
                    }
                });

                jeu = findViewById(R.id.jeu);
                jeu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite4();
                    }
                });

                salledebain = findViewById(R.id.salledebain);
                salledebain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite5();
                    }
                });

                salon = findViewById(R.id.salon);
                salon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite6();
                    }
                });

                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.menu_selection_horizontal);


                chambre = findViewById(R.id.chambre);
                // monBouton.setText("Valisez");
                chambre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });

                cuisineon = findViewById(R.id.cuisine);
                cuisineon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });


                jardin = findViewById(R.id.jardin);
                jardin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite3();
                    }
                });

                jeu = findViewById(R.id.jeu);
                jeu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite4();
                    }
                });

                salledebain = findViewById(R.id.salledebain);
                salledebain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite5();
                    }
                });

                salon = findViewById(R.id.salon);
                salon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite6();
                    }
                });
                break;

        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.menu_selection_horizontal);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.menu_selection_vertical);

        }
    }


    // creation de fonction visualiser la suite
    private void visualiser_la_suite() {
        Intent intent = new Intent(MenuSelection.this, Chambre.class);
        startActivity(intent);

    }

    private void visualiser_la_suite2() {
        Intent intent = new Intent(MenuSelection.this, cuisine.class);
        startActivity(intent);

    }


    private void visualiser_la_suite3() {
        Intent intent = new Intent(MenuSelection.this, jardin.class);
        startActivity(intent);

    }

    private void visualiser_la_suite4() {
        Intent intent = new Intent(MenuSelection.this, jeu.class);
        startActivity(intent);

    }

    private void visualiser_la_suite5() {
        Intent intent = new Intent(MenuSelection.this, salledebain.class);
        startActivity(intent);

    }

    private void visualiser_la_suite6() {
        Intent intent = new Intent(MenuSelection.this, salon.class);
        startActivity(intent);

    }
}


