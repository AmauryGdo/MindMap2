package com.example.anais.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class salon extends AppCompatActivity {
  //  Description des variables
    private RelativeLayout lampe;
    private RelativeLayout tele;
    private RelativeLayout buisson2;
    private RelativeLayout tablebasse;
    private RelativeLayout canape;

    //Nous sommes dans le salon il y a 5 zones clicables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon);

        lampe= findViewById(R.id.lampe2);
        lampe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(salon.this, Ecrire.class);
                i.putExtra("objetclique", "lampe"); //Optional parameters
                startActivity(i);

            }
        });

        canape= findViewById(R.id.canape);
        canape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(salon.this, Ecrire.class);
                i.putExtra("objetclique", "canape"); //Optional parameters
                startActivity(i);

            }
        });

        tablebasse= findViewById(R.id.tablebasse);
        tablebasse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(salon.this, Ecrire.class);
                i.putExtra("objetclique", "tablebasse"); //Optional parameters
                startActivity(i);

            }
        });
        buisson2= findViewById(R.id.buisson2);
        buisson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(salon.this, Ecrire.class);
                i.putExtra("objetclique", "buisson2"); //Optional parameters
                startActivity(i);

            }
        });

        tele= findViewById(R.id.tele);
        tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(salon.this, Ecrire.class);
                i.putExtra("objetclique", "tele"); //Optional parameters
                startActivity(i);

            }
        });

    }

}



