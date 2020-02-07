package com.example.anais.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import java.util.HashMap;


public class Choixpiece extends AppCompatActivity {
//Création varaibles Image Bouton
  private ImageButton chambre;
  private ImageButton salledebain;
  private ImageButton cuisine;
  private ImageButton jeu;
  private ImageButton jardin;
  private ImageButton salon;

    // Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choixpiece);
        //On lie des actions aux boutons dans le code ci dessous. Chaque boutons mènent vers une activité correspondant à une pièce
        chambre = findViewById(R.id.logochambre);
        chambre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite();

            }
        });
        salledebain= findViewById(R.id.logosalledebain);
        salledebain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite2();
            }
        });
        salon= findViewById(R.id.logosalon);
        salon.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            visualiser_la_suite3();
        }
    });
     jeu= findViewById(R.id.logojeu);
     jeu.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        visualiser_la_suite4();
        }
        });
     jardin= findViewById(R.id.logojardin);
     jardin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visualiser_la_suite5();
                }
            });

     cuisine= findViewById(R.id.logocuisine);
     cuisine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visualiser_la_suite6();
                }
            });
        }
    private void visualiser_la_suite()
        {
        Intent intent=new Intent(this,Chambre.class);
        startActivity(intent);
        }
    private void visualiser_la_suite2()
    {
        Intent intent2= new Intent(this, salledebain.class);
        startActivity(intent2);
    }
    private void visualiser_la_suite3()
    {
        Intent intent3= new Intent(this, salon.class);
        startActivity(intent3);
    }
    private void visualiser_la_suite4()
    {
        Intent intent4= new Intent(this, jeu.class);
        startActivity(intent4);
    }
    private void visualiser_la_suite5()
    {
        Intent intent5= new Intent(this, jardin.class);
        startActivity(intent5);
    }
    private void visualiser_la_suite6()
    {
        Intent intent6= new Intent(this, cuisine.class);
        startActivity(intent6);
    }
}


