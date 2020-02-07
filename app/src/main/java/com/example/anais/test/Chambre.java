package com.example.anais.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.HashMap;
// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class Chambre extends AppCompatActivity {
    //Déclaration des variables
    private RelativeLayout lit;
    private RelativeLayout tableau;
    private RelativeLayout fenetre2;
    @Override
    // Dans le code qui suit nous établissons une action sur les Relative Layout
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chambre);

        lit= findViewById(R.id.lit); //Liaison entre variable et Bouton
        lit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(Chambre.this, Ecrire.class); //Changement d'activité vers Ecrire
                i.putExtra("objetclique", "lit"); //Lorsque on clique sur le bouton une valeur est envoyé vers la classe Ecrit. A Cette valeur
                startActivity(i);                                //est reliée le nom de l'objet associé

            }
        });

        fenetre2= findViewById(R.id.fenetre2);
        fenetre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(Chambre.this, Ecrire.class);
                i.putExtra("objetclique", "fenetre"); //Optional parameters
                startActivity(i);
            }
        });

        tableau= findViewById(R.id.tableau);
        tableau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(Chambre.this, Ecrire.class);
                i.putExtra("objetclique", "tableau"); //Optional parameters
                startActivity(i);
            }
        });

    }
}
