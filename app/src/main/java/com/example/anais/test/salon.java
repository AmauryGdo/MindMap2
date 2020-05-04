package com.example.anais.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class salon extends AppCompatActivity {

    //initialisation variable pour les pop-up des notifications
    ImageView notif_telefr;
    ImageView notif_buisson2fr;
    ImageView notif_tablebassefr;
    ImageView notif_canapefr;
    ImageView notif_lampe2fr;
    SharedPreferences sharedPreferences;

    //Nous sommes dans le salon il y a 5 zones clicables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//------------------------------------ PORTRAIT-------------------------------------------------------------------

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.salon_vertical);

//=============================== lampe2, canape, tablebasse, buisson2, tele ============================================================================

                //  Description des variables
                RelativeLayout lampe = findViewById(R.id.lampe2);
                lampe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salon.this, Ecrire.class);
                        i.putExtra("objetclique", "lampe"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout canape = findViewById(R.id.canape);
                canape.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salon.this, Ecrire.class);
                        i.putExtra("objetclique", "canape"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout tablebasse = findViewById(R.id.tablebasse);
                tablebasse.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salon.this, Ecrire.class);
                        i.putExtra("objetclique", "tablebasse"); //Optional parameters
                        startActivity(i);

                    }
                });
                RelativeLayout buisson2 = findViewById(R.id.buisson2);
                buisson2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salon.this, Ecrire.class);
                        i.putExtra("objetclique", "buisson2"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout tele = findViewById(R.id.tele);
                tele.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salon.this, Ecrire.class);
                        i.putExtra("objetclique", "tele"); //Optional parameters
                        startActivity(i);

                    }
                });
                break;
//---------------------------------- PAYSAGE ------------------------------------------------------------------------

            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.salon_horizontal);

                lampe = findViewById(R.id.lampe2);
                lampe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salon.this, Ecrire.class);
                        i.putExtra("objetclique", "lampe"); //Optional parameters
                        startActivity(i);

                    }
                });

                canape = findViewById(R.id.canape);
                canape.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salon.this, Ecrire.class);
                        i.putExtra("objetclique", "canape"); //Optional parameters
                        startActivity(i);

                    }
                });

                tablebasse = findViewById(R.id.tablebasse);
                tablebasse.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salon.this, Ecrire.class);
                        i.putExtra("objetclique", "tablebasse"); //Optional parameters
                        startActivity(i);

                    }
                });
                buisson2 = findViewById(R.id.buisson2);
                buisson2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salon.this, Ecrire.class);
                        i.putExtra("objetclique", "buisson2"); //Optional parameters
                        startActivity(i);

                    }
                });

                tele = findViewById(R.id.tele);
                tele.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salon.this, Ecrire.class);
                        i.putExtra("objetclique", "tele"); //Optional parameters
                        startActivity(i);

                    }
                });

        }

        //==================================== Detecteur de note a la création ==============================================================
        notif_telefr = findViewById(R.id.notif_telefr); //association variable/image
        notif_buisson2fr = findViewById(R.id.notif_buisson2fr);
        notif_tablebassefr = findViewById(R.id.notif_tablebassefr);
        notif_canapefr= findViewById(R.id.notif_canapefr);
        notif_lampe2fr= findViewById(R.id.notif_lampe2fr);


        sharedPreferences = getBaseContext().getSharedPreferences("listeDesMemos", MODE_PRIVATE); //récupération de la sharedpreferences de l'activité Ecrire
        if (sharedPreferences.contains("tele")) {
            String texte = sharedPreferences.getString("tele", null); //On recupere le texte de la key "lit"
            assert texte != null;
            if (!texte.equals("")) {
                notif_telefr.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            } else {
                notif_telefr.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        if (sharedPreferences.contains("buisson2")) {
            String texte1 = sharedPreferences.getString("buisson2", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_buisson2fr.setVisibility(View.VISIBLE);
            } else {
                notif_buisson2fr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("tablebasse")) {
            String texte2 = sharedPreferences.getString("tablebasse", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_tablebassefr.setVisibility(View.VISIBLE);
            } else {
                notif_tablebassefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("canape")) {
            String texte3 = sharedPreferences.getString("canape", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_canapefr.setVisibility(View.VISIBLE);
            } else {
                notif_canapefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("lampe2")) {
            String texte4 = sharedPreferences.getString("lampe2", null);
            assert texte4 != null;
            if (!texte4.equals("")) {
                notif_lampe2fr.setVisibility(View.VISIBLE);
            } else {
                notif_lampe2fr.setVisibility(View.GONE);
            }
        }
    }
    //=================== Detecteur d'orientation afin de modifier le layout en temps réel =====================================

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.salon_horizontal);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.salon_vertical);

        }
        //====================Detecteur de note au changement d'orientation =============================================================
        //Il y avait une inconsistance des notifications lors du passage d'une orientation à une autre
        //Si on modifiait les notes et que l'on revenait à l'orientation précedente, les notifications bug

        if (sharedPreferences.contains("tele")) {
            String texte = sharedPreferences.getString("tele", null); //On recupere le texte de la key "lit"
            assert texte != null;
            if (!texte.equals("")) {
                notif_telefr.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            } else {
                notif_telefr.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        if (sharedPreferences.contains("buisson2")) {
            String texte1 = sharedPreferences.getString("buisson2", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_buisson2fr.setVisibility(View.VISIBLE);
            } else {
                notif_buisson2fr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("tablebasse")) {
            String texte2 = sharedPreferences.getString("tablebasse", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_tablebassefr.setVisibility(View.VISIBLE);
            } else {
                notif_tablebassefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("canape")) {
            String texte3 = sharedPreferences.getString("canape", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_canapefr.setVisibility(View.VISIBLE);
            } else {
                notif_canapefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("lampe2")) {
            String texte4 = sharedPreferences.getString("lampe2", null);
            assert texte4 != null;
            if (!texte4.equals("")) {
                notif_lampe2fr.setVisibility(View.VISIBLE);
            } else {
                notif_lampe2fr.setVisibility(View.GONE);
            }
        }
    }

    //----------------------------- Detecteur de note en continu----------------------------------------------------------------
    // Ce callback permet de refresh l'etat des notifications pendant que l'activité est ouverte
    @Override
    protected void onResume() {
        super.onResume();

        if (sharedPreferences.contains("tele")) {
            String texte = sharedPreferences.getString("tele", null); //On recupere le texte de la key "lit"
            assert texte != null;
            if (!texte.equals("")) {
                notif_telefr.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            } else {
                notif_telefr.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        if (sharedPreferences.contains("buisson2")) {
            String texte1 = sharedPreferences.getString("buisson2", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_buisson2fr.setVisibility(View.VISIBLE);
            } else {
                notif_buisson2fr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("tablebasse")) {
            String texte2 = sharedPreferences.getString("tablebasse", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_tablebassefr.setVisibility(View.VISIBLE);
            } else {
                notif_tablebassefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("canape")) {
            String texte3 = sharedPreferences.getString("canape", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_canapefr.setVisibility(View.VISIBLE);
            } else {
                notif_canapefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("lampe2")) {
            String texte4 = sharedPreferences.getString("lampe2", null);
            assert texte4 != null;
            if (!texte4.equals("")) {
                notif_lampe2fr.setVisibility(View.VISIBLE);
            } else {
                notif_lampe2fr.setVisibility(View.GONE);
            }
        }
    }
}




