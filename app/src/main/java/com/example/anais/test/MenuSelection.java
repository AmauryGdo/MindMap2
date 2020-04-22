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
    private ImageButton chambreon;
    private ImageButton chambreoff;
    private ImageButton cuisineon;
    private ImageButton cuisineoff;
    private ImageButton jardinon;
    private ImageButton jardinoff;
    private ImageButton jeuon;
    private ImageButton jeuoff;
    private ImageButton salledebainon;
    private ImageButton salledebainoff;
    private ImageButton salonon;
    private ImageButton salonoff;



    int i=0;


    // Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {
            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.menu_selection_vertical);

                chambreon = findViewById(R.id.chambre);
                chambreon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });

                chambreoff = findViewById(R.id.chambreoff);

                //initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton on

                chambreon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoff.setVisibility(View.VISIBLE); //le bouton off remplace le bouton ON
                        chambreon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"chambre supprimée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

                chambreoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoff.setVisibility(View.GONE); //le bouton on remplace le bouton off
                        chambreon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"chambre ajoutée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
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
                jardinon = findViewById(R.id.jardin);
                jardinon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite3();
                    }
                });
                jardinoff = findViewById(R.id.jardinoff);
                jardinon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jardinoff.setVisibility(View.VISIBLE); //le bouton off remplace le bouton ON
                        jardinon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"jardin supprimée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });
                jardinoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jardinoff.setVisibility(View.GONE); //le bouton on remplace le bouton off
                        jardinon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"jardin ajoutée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });


// fin  jardin ------------------------------------------------------------------------------------------------------------------


                jeuon = findViewById(R.id.jeu);
                jeuon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite4();
                    }
                });
                // initialisation du bouton off
                jeuoff = findViewById(R.id.jeuoff);

                //initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton on

                jeuon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jeuoff.setVisibility(View.VISIBLE); //le bouton off remplace le bouton ON
                        jeuon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"jeu supprimée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });
//initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton off

                jeuoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jeuoff.setVisibility(View.GONE); //le bouton on remplace le bouton off
                        jeuon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"jeu ajoutée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

// fin test jeu------------------------------------------------------------------------------------------------------------------


                salledebainon = findViewById(R.id.salledebain);
                salledebainon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite5();
                    }

                });
                // initialisation du bouton off
                salledebainoff = findViewById(R.id.salledebainoff);

                //initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton on

                salledebainon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salledebainoff.setVisibility(View.VISIBLE); //le bouton off remplace le bouton ON
                        salledebainon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"salle de bain supprimée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });
//initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton off

                salledebainoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salledebainoff.setVisibility(View.GONE); //le bouton on remplace le bouton off
                        salledebainon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"salle de bain ajoutée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

// fin test salledebain------------------------------------------------------------------------------------------------------------------


                salonon = findViewById(R.id.salon);
                salonon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite6();
                    }
                });
                salonoff = findViewById(R.id.cuisineoff);

                salonon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salonoff.setVisibility(View.VISIBLE); //le bouton off remplace le bouton ON
                        salonon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"salon supprimée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

                salonoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salonoff.setVisibility(View.GONE); //le bouton on remplace le bouton off
                        salonon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"salon ajoutée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

// fin test Cuisine------------------------------------------------------------------------------------------------------------------


                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.menu_selection_horizontal);


                chambreon = findViewById(R.id.chambre);
                chambreon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });
                chambreoff = findViewById(R.id.chambreoff);

                //initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton on

                chambreon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoff.setVisibility(View.VISIBLE); //le bouton off remplace le bouton ON
                        chambreon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"chambre supprimée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

                chambreoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoff.setVisibility(View.GONE); //le bouton on remplace le bouton off
                        chambreon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"chambre ajoutée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

//test cuisine--------------------------------------------------------------------------------------------------------------

                cuisineon = findViewById(R.id.cuisine);
                cuisineon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });
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


                jardinon = findViewById(R.id.jardin);
                jardinon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite3();
                    }
                });

                jeuon = findViewById(R.id.jeu);
                jeuon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite4();
                    }
                });

                salledebainon = findViewById(R.id.salledebain);
                salledebainon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite5();
                    }
                });

                salonon = findViewById(R.id.salon);
                salonon.setOnClickListener(new View.OnClickListener() {
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


