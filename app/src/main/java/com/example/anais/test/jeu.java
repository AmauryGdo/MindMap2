package com.example.anais.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.HashMap;
// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class jeu extends AppCompatActivity {
    //définition des variables
    private RelativeLayout guitare;
    private RelativeLayout xylophone;
    private RelativeLayout tableau;
    private RelativeLayout pouf;

    //Nous sommes dans la salle de jeu et elle contient 4 zones clicables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu);

        guitare= findViewById(R.id.guitare);
        guitare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(jeu.this, Ecrire.class);
                i.putExtra("objetclique", "guitare"); //Optional parameters
                startActivity(i);

            }
        });

        tableau= findViewById(R.id.tableau);
        tableau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(jeu.this, Ecrire.class);
                i.putExtra("objetclique", "tableau"); //Optional parameters
                startActivity(i);

            }
        });




        xylophone= findViewById(R.id.table);
        xylophone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(jeu.this, Ecrire.class);
                i.putExtra("objetclique", "xylophone"); //Optional parameters
                startActivity(i);

            }
        });

        pouf= findViewById(R.id.pouf);
        pouf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(jeu.this, Ecrire.class);
                i.putExtra("objetclique", "pouf"); //Optional parameters
                startActivity(i);

            }
        });

    }

}
