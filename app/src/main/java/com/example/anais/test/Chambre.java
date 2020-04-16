package com.example.anais.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class Chambre extends AppCompatActivity {

   // ImageView notif_lit;
    //ImageView notif_fen_2;

    @Override
    // Dans le code qui suit nous établissons une action sur les Relative Layout
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.chambre_vertical);

                //Déclaration des variables
                RelativeLayout lit = findViewById(R.id.lit); //Liaison entre variable et Bouton
                 // liaison variable image
                lit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Chambre.this, Ecrire.class); //Changement d'activité vers Ecrire
                i.putExtra("objetclique", "lit"); //Lorsque on clique sur le bouton une valeur est envoyé vers la classe Ecrit. A Cette valeur
                startActivity(i);//est reliée le nom de l'objet associé
            }
        });

                RelativeLayout fenetre2 = findViewById(R.id.fenetre2);
                fenetre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(Chambre.this, Ecrire.class);
                i.putExtra("objetclique", "fenetre"); //Optional parameters
                startActivity(i);
            }
        });

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
        /*notif_lit =findViewById(R.id.notif_lit);

        SharedPreferences result = getBaseContext().getSharedPreferences( "listeDesMemos",MODE_PRIVATE);
        boolean value = result.getBoolean("lit", false);
        if(value){
            notif_lit.setVisibility(View.VISIBLE);
        }*/
        }

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
