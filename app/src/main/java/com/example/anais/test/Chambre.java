package com.example.anais.test;

// Il y a beaucoup de répétition dans notre code, nous avons donc choisi de commenter Chambre, MenuPrincipalFrancais,
// MenuSlection, ChoixLangue et Ecrire

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Chambre extends AppCompatActivity {

    //initialisation variable pour les pop-up des notifications
    ImageView notif_lit;
    ImageView notif_fen_2;
    ImageView notif_tab;
    SharedPreferences sharedPreferences;


    @Override
    // Dans le code qui suit nous établissons une action sur les Relative Layout
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//------------------------------------ PORTRAIT-------------------------------------------------------------------
        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.chambre_vertical);
//=============================== LIT ============================================================================
                //Le code est très repetitif donc je commente uniquement l'objet "lit"

                //Déclaration des variables et association avec le relative layout
                RelativeLayout lit = findViewById(R.id.lit);
                lit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Chambre.this, Ecrire.class); //Changement d'activité vers Ecrire
                        i.putExtra("objetclique", "lit"); //Lorsque l'on clique sur le relativelayout une valeur est envoyée vers la classe Ecrire. A Cette valeur
                        startActivity(i);//est reliée le nom de l'objet associé
                    }
                });
//================================= FENETRE =======================================================================
                RelativeLayout fenetre2 = findViewById(R.id.fenetre2);
                fenetre2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Chambre.this, Ecrire.class);
                        i.putExtra("objetclique", "fenetre");
                        startActivity(i);
                    }
                });
//================================= TABLEAU =======================================================================
                RelativeLayout tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Chambre.this, Ecrire.class);
                        i.putExtra("objetclique", "tableau"); //Optional parameters
                        startActivity(i);
                    }
                });
                break;

//---------------------------------- PAYSAGE ------------------------------------------------------------------------
            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.chambre_horizontal);
                lit = findViewById(R.id.lit); //Liaison entre variable et Bouton
                lit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Chambre.this, Ecrire.class); //Changement d'activité vers Ecrire
                        i.putExtra("objetclique", "lit"); //Lorsque on clique sur le bouton une valeur est envoyé vers la classe Ecrit. A Cette valeur
                        startActivity(i);                                //est reliée le nom de l'objet associé

                    }
                });

                fenetre2 = findViewById(R.id.fenetre2);
                fenetre2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Chambre.this, Ecrire.class);
                        i.putExtra("objetclique", "fenetre"); //Optional parameters
                        startActivity(i);
                    }
                });

                tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Chambre.this, Ecrire.class);
                        i.putExtra("objetclique", "tableau"); //Optional parameters
                        startActivity(i);
                    }
                });
        }
        //==================================== Detecteur de note a la création ==============================================================
        notif_lit = findViewById(R.id.notif_lit); //association variable/image
        notif_fen_2 = findViewById(R.id.notif_fen_2);
        notif_tab = findViewById(R.id.notif_tab);

        sharedPreferences = getBaseContext().getSharedPreferences("listeDesMemos", MODE_PRIVATE); //récupération de la sharedpreferences de l'activité Ecrire
        if (sharedPreferences.contains("lit")) {
            String texte = sharedPreferences.getString("lit", null); //On recupere le texte de la key "lit"
            assert texte != null;
            if (!texte.equals("")) {
                notif_lit.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            } else {
                notif_lit.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        if (sharedPreferences.contains("fenetre")) {
            String texte1 = sharedPreferences.getString("fenetre", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_fen_2.setVisibility(View.VISIBLE);
            } else {
                notif_fen_2.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("tableau")) {
            String texte2 = sharedPreferences.getString("tableau", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_tab.setVisibility(View.VISIBLE);
            } else {
                notif_tab.setVisibility(View.GONE);
            }
        }
    }

    //=================== Detecteur d'orientation afin de modifier le layout en temps réel =====================================
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.chambre_horizontal);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.chambre_vertical);
        }
//====================Detecteur de note au changement d'orientation =============================================================
        //Il y avait une inconsistance des notifications lors du passage d'une orientation à une autre
        //Si on modifiait les notes et que l'on revenait à l'orientation précedente, les notifications bug

        String texte = sharedPreferences.getString("lit", null);
        assert texte != null;
        if (!texte.equals("")) {
            notif_lit.setVisibility(View.VISIBLE);
        } else {
            notif_lit.setVisibility(View.GONE);
        }

        String texte1 = sharedPreferences.getString("fenetre", null);
        assert texte1 != null;
        if (!texte1.equals("")) {
            notif_fen_2.setVisibility(View.VISIBLE);
        } else {
            notif_fen_2.setVisibility(View.GONE);
        }

        String texte2 = sharedPreferences.getString("tableau", null);
        assert texte2 != null;
        if (!texte2.equals("")) {
            notif_tab.setVisibility(View.VISIBLE);
        } else {
            notif_tab.setVisibility(View.GONE);
        }
    }

//----------------------------- Detecteur de note en continu----------------------------------------------------------------
    // Ce callback permet de refresh l'etat des notifications pendant que l'activité est ouverte
    @Override
    protected void onResume() {
        super.onResume();

        String texte = sharedPreferences.getString("lit", null);
        assert texte != null;
        if (!texte.equals("")) {
            notif_lit.setVisibility(View.VISIBLE);
        } else {
            notif_lit.setVisibility(View.GONE);
        }

        String texte1 = sharedPreferences.getString("fenetre", null);
        assert texte1 != null;
        if (!texte1.equals("")) {
            notif_fen_2.setVisibility(View.VISIBLE);
        } else {
            notif_fen_2.setVisibility(View.GONE);
        }

        String texte2 = sharedPreferences.getString("tableau", null);
        assert texte2 != null;
        if (!texte2.equals("")) {
            notif_tab.setVisibility(View.VISIBLE);
        } else {
            notif_tab.setVisibility(View.GONE);
        }
    }
}
