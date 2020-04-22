//NE SERT A RIEN
// residu




package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {
//================================================VERTICALE====================================================================

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.menu_selection_vertical);


// Chambre---------------------------------------------------------------------------------------------------------------------------------------
                //initialisation du bouton On et de son listeneur vers l'activity Chambre
                chambreon = findViewById(R.id.chambre);
                chambreon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });
                // initialisation du bouton off
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

                //initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton off
                chambreoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoff.setVisibility(View.GONE); //le bouton on remplace le bouton off
                        chambreon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"chambre ajoutée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

//cuisine-------------------------------------------------------------------------------------------------------------------------------------

                cuisineon = findViewById(R.id.cuisine);
                cuisineon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }

                });

                cuisineoff = findViewById(R.id.cuisineoff);
                cuisineon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        cuisineoff.setVisibility(View.VISIBLE);
                        cuisineon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"Cuisine supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                cuisineoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        cuisineoff.setVisibility(View.GONE);
                        cuisineon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"Cuisine ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

//Jardin------------------------------------------------------------------------------------------------------------------
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
                        jardinoff.setVisibility(View.VISIBLE);
                        jardinon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"jardin supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                jardinoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jardinoff.setVisibility(View.GONE);
                        jardinon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"jardin ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });


//Jeu ------------------------------------------------------------------------------------------------------------------

                jeuon = findViewById(R.id.jeu);
                jeuon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite4();
                    }
                });

                jeuoff = findViewById(R.id.jeuoff);
                jeuon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jeuoff.setVisibility(View.VISIBLE);
                        jeuon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"jeu supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                jeuoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jeuoff.setVisibility(View.GONE);
                        jeuon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"jeu ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

// Salle de bain ------------------------------------------------------------------------------------------------------------------

                salledebainon = findViewById(R.id.salledebain);
                salledebainon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite5();
                    }

                });

                salledebainoff = findViewById(R.id.salledebainoff);
                salledebainon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salledebainoff.setVisibility(View.VISIBLE);
                        salledebainon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"salle de bain supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                salledebainoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salledebainoff.setVisibility(View.GONE);
                        salledebainon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"salle de bain ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

// Salon ------------------------------------------------------------------------------------------------------------------

                salonon = findViewById(R.id.salon);
                salonon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite6();
                    }
                });

                salonoff = findViewById(R.id.salonoff);
                salonon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salonoff.setVisibility(View.VISIBLE);
                        salonon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"salon supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                salonoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salonoff.setVisibility(View.GONE);
                        salonon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"salon ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                break;

//==========================================HORIZONTALE===================================================================
            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.menu_selection_horizontal);

//Chambre-------------------------------------------------------------------------------------------------------------------
                chambreon = findViewById(R.id.chambre);
                chambreon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });

                chambreoff = findViewById(R.id.chambreoff);
                chambreon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoff.setVisibility(View.VISIBLE);
                        chambreon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"chambre supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                chambreoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoff.setVisibility(View.GONE);
                        chambreon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"chambre ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

//cuisine--------------------------------------------------------------------------------------------------------------

                cuisineon = findViewById(R.id.cuisine);
                cuisineon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });

                cuisineoff = findViewById(R.id.cuisineoff);
                cuisineon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        cuisineoff.setVisibility(View.VISIBLE);
                        cuisineon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"Cuisine supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                cuisineoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        cuisineoff.setVisibility(View.GONE);
                        cuisineon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"Cuisine ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

//Jardin-------------------------------------------------------------------------------------------------------------------
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
                        jardinoff.setVisibility(View.VISIBLE);
                        jardinon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"jardin supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                jardinoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jardinoff.setVisibility(View.GONE);
                        jardinon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"jardin ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
//Jeu------------------------------------------------------------------------------------------------------------------------
                jeuon = findViewById(R.id.jeu);
                jeuon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite4();
                    }
                });

                jeuoff = findViewById(R.id.jeuoff);
                jeuon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jeuoff.setVisibility(View.VISIBLE);
                        jeuon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"jeu supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                jeuoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jeuoff.setVisibility(View.GONE);
                        jeuon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"jeu ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
//Salle de bain---------------------------------------------------------------------------------------------------------------

                salledebainon = findViewById(R.id.salledebain);
                salledebainon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite5();
                    }
                });

                salledebainoff = findViewById(R.id.salledebainoff);
                salledebainon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salledebainoff.setVisibility(View.VISIBLE);
                        salledebainon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"salle de bain supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                salledebainoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salledebainoff.setVisibility(View.GONE);
                        salledebainon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"salle de bain ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
//Salon-------------------------------------------------------------------------------------------------------------------------

                salonon = findViewById(R.id.salon);
                salonon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite6();
                    }
                });

                salonoff = findViewById(R.id.salonoff);
                salonon.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salonoff.setVisibility(View.VISIBLE);
                        salonon.setVisibility(View.GONE);
                        Toast.makeText(MenuSelection.this,"salon supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                salonoff.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salonoff.setVisibility(View.GONE);
                        salonon.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelection.this,"salon ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                break;

        }
    }

    // Permet de detecter l'orientation du telephone a tout moment et ainsi afficher le bon layout correspondant a l'orientation
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.menu_selection_horizontal);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.menu_selection_vertical);

        }
    }


    // creation de fonction pour acceder au activity correspondante
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


