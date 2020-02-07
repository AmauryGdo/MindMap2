package com.example.anais.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class jardin extends AppCompatActivity {
    //Définition des variables
    private RelativeLayout fleur;
    private RelativeLayout buisson;
    private RelativeLayout table;
    private RelativeLayout hamac;

    //Nous sommes dans le jardin il y a 4 zones clicables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jardin);

        fleur= findViewById(R.id.fleur);
        fleur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(jardin.this, Ecrire.class);
                i.putExtra("objetclique", "fleur"); //Optional parameters
                startActivity(i);

            }
        });

        buisson= findViewById(R.id.buisson);
        buisson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(jardin.this, Ecrire.class);
                i.putExtra("objetclique", "buisson"); //Optional parameters
                startActivity(i);

            }
        });

        table= findViewById(R.id.table);
        table.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            Intent i = new Intent(jardin.this, Ecrire.class);
            i.putExtra("objetclique", "table"); //Optional parameters
            startActivity(i);

        }
    });
        hamac= findViewById(R.id.hamac);
        hamac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(jardin.this, Ecrire.class);
                i.putExtra("objetclique", "hamac"); //Optional parameters
                startActivity(i);

            }
        });

    }

}


