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

    @Override
    // Dans le code qui suit nous établissons une action sur les Relative Layout
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//------------------------------------ PORTRAIT-------------------------------------------------------------------
        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.chambre_vertical);
//=============================== LIT ============================================================================
                //Le code est très repetitif donc je commente uniquement l'objet "li"

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
            public void onClick(View v){
                Intent i = new Intent(Chambre.this, Ecrire.class);
                i.putExtra("objetclique", "fenetre");
                startActivity(i);
            }
        });
//================================= TABLEAU =======================================================================
                RelativeLayout tableau = findViewById(R.id.tableau);
        tableau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
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
                    public void onClick(View v){
                        Intent i = new Intent(Chambre.this, Ecrire.class); //Changement d'activité vers Ecrire
                        i.putExtra("objetclique", "lit"); //Lorsque on clique sur le bouton une valeur est envoyé vers la classe Ecrit. A Cette valeur
                        startActivity(i);                                //est reliée le nom de l'objet associé

                    }
                });

                fenetre2 = findViewById(R.id.fenetre2);
                fenetre2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(Chambre.this, Ecrire.class);
                        i.putExtra("objetclique", "fenetre"); //Optional parameters
                        startActivity(i);
                    }
                });

                tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(Chambre.this, Ecrire.class);
                        i.putExtra("objetclique", "tableau"); //Optional parameters
                        startActivity(i);
                    }
                });
    }
    //==================================== DETECTEUR DE NOTE ==============================================================
        notif_lit =findViewById(R.id.notif_lit); //association variable/image

        SharedPreferences sharedPreferences = getBaseContext().getSharedPreferences( "listeDesMemos",MODE_PRIVATE); //récupération de la sharedpreferences de l'activité Ecrire
        if(sharedPreferences.contains("lit")){
            String texte = sharedPreferences.getString("lit", null); //On recupere le texte de la key "lit"
            if(texte != ""){
                notif_lit.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            }
           if(texte.equals(null) && texte.equals("") ){
                notif_lit.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        //============================================================================================================
        }

        // Detecteur d'orientation afin de modifier le layout en temps réel
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.chambre_horizontal);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.chambre_vertical);

        }
    }
}
