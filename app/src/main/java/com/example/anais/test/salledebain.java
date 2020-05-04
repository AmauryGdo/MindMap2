package com.example.anais.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

//Nous sommes dans le salon avec 3 zones clicables
// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class salledebain extends AppCompatActivity {

    //initialisation variable pour les pop-up des notifications
    ImageView notif_corbeille2fr;
    ImageView notif_lavabofr;
    ImageView notif_baignoirefr;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
            setContentView(R.layout.salledebain_vertical);

            RelativeLayout lavabo = findViewById(R.id.lavabo);
            lavabo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(salledebain.this, Ecrire.class);
                    i.putExtra("objetclique", "lavabo"); //Optional parameters
                    startActivity(i);

                }
            });

            RelativeLayout baignoire = findViewById(R.id.baignoire);
            baignoire.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(salledebain.this, Ecrire.class);
                    i.putExtra("objetclique", "baignoire"); //Optional parameters
                    startActivity(i);

                }
            });

            RelativeLayout corbeille2 = findViewById(R.id.corbeille2);
            corbeille2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(salledebain.this, Ecrire.class);
                    i.putExtra("objetclique", "corbeille2"); //Optional parameters
                    startActivity(i);

                }
            });

                break;

            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.salledebain_horizontal);

                 lavabo = findViewById(R.id.lavabo);
                lavabo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebain.this, Ecrire.class);
                        i.putExtra("objetclique", "lavabo"); //Optional parameters
                        startActivity(i);

                    }
                });

                 baignoire = findViewById(R.id.baignoire);
                baignoire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebain.this, Ecrire.class);
                        i.putExtra("objetclique", "baignoire"); //Optional parameters
                        startActivity(i);

                    }
                });

                 corbeille2 = findViewById(R.id.corbeille2);
                corbeille2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebain.this, Ecrire.class);
                        i.putExtra("objetclique", "corbeille2"); //Optional parameters
                        startActivity(i);

                    }
                });
        }
        //==================================== Detecteur de note a la création ==============================================================
        notif_corbeille2fr = findViewById(R.id.notif_corbeille2fr); //association variable/image
        notif_lavabofr = findViewById(R.id.notif_lavabofr);
        notif_baignoirefr = findViewById(R.id.notif_baignoirefr);

        sharedPreferences = getBaseContext().getSharedPreferences("listeDesMemos", MODE_PRIVATE); //récupération de la sharedpreferences de l'activité Ecrire
        if (sharedPreferences.contains("corbeille2")) {
            String texte = sharedPreferences.getString("corbeille2", null); //On recupere le texte de la key "lit"
            assert texte != null;
            if (!texte.equals("")) {
                notif_corbeille2fr.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            } else {
                notif_corbeille2fr.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        if (sharedPreferences.contains("lavabo")) {
            String texte1 = sharedPreferences.getString("lavabo", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_lavabofr.setVisibility(View.VISIBLE);
            } else {
                notif_lavabofr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("baignoire")) {
            String texte2 = sharedPreferences.getString("baignoire", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_baignoirefr.setVisibility(View.VISIBLE);
            } else {
                notif_baignoirefr.setVisibility(View.GONE);
            }
        }
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.salledebain_horizontal);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.salledebain_vertical  );

        }
        //====================Detecteur de note au changement d'orientation =============================================================
        //Il y avait une inconsistance des notifications lors du passage d'une orientation à une autre
        //Si on modifiait les notes et que l'on revenait à l'orientation précedente, les notifications bug

        if (sharedPreferences.contains("corbeille2")) {
            String texte = sharedPreferences.getString("corbeille2", null); //On recupere le texte de la key "lit"
            assert texte != null;
            if (!texte.equals("")) {
                notif_corbeille2fr.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            } else {
                notif_corbeille2fr.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        if (sharedPreferences.contains("lavabo")) {
            String texte1 = sharedPreferences.getString("lavabo", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_lavabofr.setVisibility(View.VISIBLE);
            } else {
                notif_lavabofr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("baignoire")) {
            String texte2 = sharedPreferences.getString("baignoire", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_baignoirefr.setVisibility(View.VISIBLE);
            } else {
                notif_baignoirefr.setVisibility(View.GONE);
            }
        }
    }

    //----------------------------- Detecteur de note en continu----------------------------------------------------------------
    // Ce callback permet de refresh l'etat des notifications pendant que l'activité est ouverte
    @Override
    protected void onResume() {
        super.onResume();

        if (sharedPreferences.contains("corbeille2")) {
            String texte = sharedPreferences.getString("corbeille2", null); //On recupere le texte de la key "lit"
            assert texte != null;
            if (!texte.equals("")) {
                notif_corbeille2fr.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            } else {
                notif_corbeille2fr.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        if (sharedPreferences.contains("lavabo")) {
            String texte1 = sharedPreferences.getString("lavabo", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_lavabofr.setVisibility(View.VISIBLE);
            } else {
                notif_lavabofr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("baignoire")) {
            String texte2 = sharedPreferences.getString("baignoire", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_baignoirefr.setVisibility(View.VISIBLE);
            } else {
                notif_baignoirefr.setVisibility(View.GONE);
            }
        }
    }
}

