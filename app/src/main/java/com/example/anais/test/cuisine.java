package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class cuisine extends AppCompatActivity {

    private RelativeLayout frigo;
    private RelativeLayout four;
    private RelativeLayout orange;
    private RelativeLayout plante;
    private RelativeLayout corbeille;
    private RelativeLayout fenetre;
    private RelativeLayout armoire;
    private RelativeLayout chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:

                setContentView(R.layout.cuisine_vertical);
                frigo = findViewById(R.id.frig1);
                frigo.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "frigo"); //Optional parameters
                        startActivity(i);

                    }
                });

                orange = findViewById(R.id.orange1);
                orange.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "orange"); //Optional parameters
                        startActivity(i);
                    }
                });

                corbeille = findViewById(R.id.corbeille1);
                corbeille.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "corbeille"); //Optional parameters
                        startActivity(i);
                    }
                });
                fenetre = findViewById(R.id.fenetre1);
                fenetre.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "fenetre"); //Optional parameters
                        startActivity(i);
                    }
                });

                four = findViewById(R.id.four1);
                four.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "four"); //Optional parameters
                        startActivity(i);
                    }
                });

                plante = findViewById(R.id.plante1);
                plante.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "plante"); //Optional parameters
                        startActivity(i);
                    }
                });

                armoire = findViewById(R.id.armoire1);
                armoire.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "armoire"); //Optional parameters
                        startActivity(i);
                    }
                });

                chat = findViewById(R.id.chat1);
                chat.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "chat"); //Optional parameters
                        startActivity(i);
                    }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.cuisine_horizontal);
                frigo = findViewById(R.id.frig1);
                frigo.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "frigo"); //Optional parameters
                        startActivity(i);

                    }
                });

                orange = findViewById(R.id.orange1);
                orange.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "orange"); //Optional parameters
                        startActivity(i);
                    }
                });

                corbeille = findViewById(R.id.corbeille1);
                corbeille.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "corbeille"); //Optional parameters
                        startActivity(i);
                    }
                });
                fenetre = findViewById(R.id.fenetre1);
                fenetre.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "fenetre"); //Optional parameters
                        startActivity(i);
                    }
                });

                four = findViewById(R.id.four1);
                four.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "four"); //Optional parameters
                        startActivity(i);
                    }
                });

                plante = findViewById(R.id.plante1);
                plante.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "plante"); //Optional parameters
                        startActivity(i);
                    }
                });

                armoire = findViewById(R.id.armoire1);
                armoire.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "armoire"); //Optional parameters
                        startActivity(i);
                    }
                });

                chat = findViewById(R.id.chat1);
                chat.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "chat"); //Optional parameters
                        startActivity(i);
                    }
                });

        }
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.cuisine_horizontal);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.cuisine_vertical);

        }
    }
}