package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MenuSelectionAnglais extends AppCompatActivity {

    private ImageButton chambreonanglais;
    private ImageButton chambreoffanglais;
    private ImageButton cuisineonanglais;
    private ImageButton cuisineoffanglais;
    private ImageButton jardinonanglais;
    private ImageButton jardinoffanglais;
    private ImageButton jeuonanglais;
    private ImageButton jeuoffanglais;
    private ImageButton salledebainonanglais;
    private ImageButton salledebainoffanglais;
    private ImageButton salononanglais;
    private ImageButton salonoffanglais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {
//================================================VERTICALE====================================================================

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.menu_selection_verticalanglais);


// Chambre---------------------------------------------------------------------------------------------------------------------------------------
                //initialisation du bouton On et de son listeneur vers l'activity Chambre
                chambreonanglais = findViewById(R.id.chambreanglais);
                chambreonanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });
                // initialisation du bouton off
                chambreoffanglais = findViewById(R.id.chambreoffanglais);

                //initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton on
                chambreonanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoffanglais.setVisibility(View.VISIBLE); //le bouton off remplace le bouton ON
                        chambreonanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"chambre supprimée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

                //initialisation du detecteur de long clic et de son action pour faire disparaitre le bouton off
                chambreoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoffanglais.setVisibility(View.GONE); //le bouton on remplace le bouton off
                        chambreonanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"chambre ajoutée",Toast.LENGTH_SHORT).show(); //apparition d'un message de validation
                        return false;
                    }
                });

//cuisine-------------------------------------------------------------------------------------------------------------------------------------

                cuisineonanglais = findViewById(R.id.cuisineanglais);
                cuisineonanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }

                });

                cuisineoffanglais = findViewById(R.id.cuisineoffanglais);
                cuisineonanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        cuisineoffanglais.setVisibility(View.VISIBLE);
                        cuisineonanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"Cuisine supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                cuisineoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        cuisineoffanglais.setVisibility(View.GONE);
                        cuisineonanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"Cuisine ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

//Jardin------------------------------------------------------------------------------------------------------------------
                jardinonanglais = findViewById(R.id.jardinanglais);
                jardinonanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite3();
                    }
                });

                jardinoffanglais = findViewById(R.id.jardinoffanglais);
                jardinonanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jardinoffanglais.setVisibility(View.VISIBLE);
                        jardinonanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"jardin supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                jardinoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jardinoffanglais.setVisibility(View.GONE);
                        jardinonanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"jardin ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });


//Jeu ------------------------------------------------------------------------------------------------------------------

                jeuonanglais = findViewById(R.id.jeu);
                jeuonanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite4();
                    }
                });

                jeuoffanglais = findViewById(R.id.jeuoffanglais);
                jeuonanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jeuoffanglais.setVisibility(View.VISIBLE);
                        jeuonanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"jeu supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                jeuoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jeuoffanglais.setVisibility(View.GONE);
                        jeuonanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"jeu ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

// Salle de bain ------------------------------------------------------------------------------------------------------------------

                salledebainonanglais = findViewById(R.id.salledebainanglais);
                salledebainonanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite5();
                    }

                });

                salledebainoffanglais = findViewById(R.id.salledebainoffanglais);
                salledebainonanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salledebainoffanglais.setVisibility(View.VISIBLE);
                        salledebainonanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"salle de bain supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                salledebainoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salledebainoffanglais.setVisibility(View.GONE);
                        salledebainonanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"salle de bain ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

// Salon ------------------------------------------------------------------------------------------------------------------

                salononanglais = findViewById(R.id.salonanglais);
                salononanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite6();
                    }
                });

                salonoffanglais = findViewById(R.id.salonoffanglais);
                salononanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salonoffanglais.setVisibility(View.VISIBLE);
                        salononanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"salon supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                salonoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salonoffanglais.setVisibility(View.GONE);
                        salononanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"salon ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                break;

//==========================================HORIZONTALE===================================================================
            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.menu_selection_horizontalanglais);

//Chambre-------------------------------------------------------------------------------------------------------------------
                chambreonanglais = findViewById(R.id.chambreanglais);
                chambreonanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });

                chambreoffanglais = findViewById(R.id.chambreoffanglais);
                chambreonanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoffanglais.setVisibility(View.VISIBLE);
                        chambreonanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"chambre supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                chambreoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        chambreoffanglais.setVisibility(View.GONE);
                        chambreonanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"chambre ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

//cuisine--------------------------------------------------------------------------------------------------------------

                cuisineonanglais = findViewById(R.id.cuisineanglais);
                cuisineonanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });

                cuisineoffanglais = findViewById(R.id.cuisineoffanglais);
                cuisineonanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        cuisineoffanglais.setVisibility(View.VISIBLE);
                        cuisineonanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"Cuisine supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                cuisineoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        cuisineoffanglais.setVisibility(View.GONE);
                        cuisineonanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"Cuisine ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

//Jardin-------------------------------------------------------------------------------------------------------------------
                jardinonanglais = findViewById(R.id.jardinanglais);
                jardinonanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite3();
                    }
                });

                jardinoffanglais = findViewById(R.id.jardinoffanglais);
                jardinonanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jardinoffanglais.setVisibility(View.VISIBLE);
                        jardinonanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"jardin supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
                jardinoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jardinoffanglais.setVisibility(View.GONE);
                        jardinonanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"jardin ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
//Jeu------------------------------------------------------------------------------------------------------------------------
                jeuonanglais = findViewById(R.id.jeuanglais);
                jeuonanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite4();
                    }
                });

                jeuoffanglais = findViewById(R.id.jeuoffanglais);
                jeuonanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jeuoffanglais.setVisibility(View.VISIBLE);
                        jeuonanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"jeu supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                jeuoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        jeuoffanglais.setVisibility(View.GONE);
                        jeuonanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"jeu ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
//Salle de bain---------------------------------------------------------------------------------------------------------------

                salledebainonanglais = findViewById(R.id.salledebainanglais);
                salledebainonanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite5();
                    }
                });

                salledebainoffanglais = findViewById(R.id.salledebainoffanglais);
                salledebainonanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salledebainoffanglais.setVisibility(View.VISIBLE);
                        salledebainonanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"salle de bain supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                salledebainoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salledebainoffanglais.setVisibility(View.GONE);
                        salledebainonanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"salle de bain ajoutée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
//Salon-------------------------------------------------------------------------------------------------------------------------

                salononanglais = findViewById(R.id.salonanglais);
                salononanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite6();
                    }
                });

                salonoffanglais = findViewById(R.id.salonoffanglais);
                salononanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salonoffanglais.setVisibility(View.VISIBLE);
                        salononanglais.setVisibility(View.GONE);
                        Toast.makeText(MenuSelectionAnglais.this,"salon supprimée",Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });

                salonoffanglais.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        salonoffanglais.setVisibility(View.GONE);
                        salononanglais.setVisibility(View.VISIBLE);
                        Toast.makeText(MenuSelectionAnglais.this,"salon ajoutée",Toast.LENGTH_SHORT).show();
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
            setContentView(R.layout.menu_selection_horizontalanglais);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.menu_selection_verticalanglais);

        }
    }


    // creation de fonction pour acceder au activity correspondante
    private void visualiser_la_suite() {
        Intent intent = new Intent(MenuSelectionAnglais.this, ChambreAnglais.class);
        startActivity(intent);

    }

    private void visualiser_la_suite2() {
        Intent intent = new Intent(MenuSelectionAnglais.this, cuisineAnglais.class);
        startActivity(intent);

    }


    private void visualiser_la_suite3() {
        Intent intent = new Intent(MenuSelectionAnglais.this, jardinAnglais.class);
        startActivity(intent);

    }

    private void visualiser_la_suite4() {
        Intent intent = new Intent(MenuSelectionAnglais.this, jeuAnglais.class);
        startActivity(intent);

    }

    private void visualiser_la_suite5() {
        Intent intent = new Intent(MenuSelectionAnglais.this, salledebainAnglais.class);
        startActivity(intent);

    }

    private void visualiser_la_suite6() {
        Intent intent = new Intent(MenuSelectionAnglais.this, salonAnglais.class);
        startActivity(intent);

    }
}


