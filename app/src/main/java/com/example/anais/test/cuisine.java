package com.example.anais.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class cuisine extends AppCompatActivity {

    ImageView notif_frig;
    ImageView notif_chat1;
    ImageView notif_plant1;
    ImageView notif_four1;
    ImageView notif_fen1;
    ImageView notif_orange;
    ImageView notif_corb;
    ImageView notif_armo1;
    SharedPreferences sharedPreferences1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:

                setContentView(R.layout.cuisine_vertical);
                RelativeLayout frigo = findViewById(R.id.frig1);
                frigo.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "frigo"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout orange = findViewById(R.id.orange1);
                orange.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "orange"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout corbeille = findViewById(R.id.corbeille1);
                corbeille.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "corbeille"); //Optional parameters
                        startActivity(i);
                    }
                });
                RelativeLayout fenetre = findViewById(R.id.fenetre1);
                fenetre.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "fenetre"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout four = findViewById(R.id.four1);
                four.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "four"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout plante = findViewById(R.id.plante1);
                plante.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "plante"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout armoire = findViewById(R.id.armoire1);
                armoire.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "armoire"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout chat = findViewById(R.id.chat1);
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

        //==================================== Detecteur de note a la création ==============================================================
        notif_frig = findViewById(R.id.notif_frig); //association variable/image
        notif_chat1 = findViewById(R.id.notif_chat1);
        notif_plant1 = findViewById(R.id.notif_plant1);

        sharedPreferences1 = getBaseContext().getSharedPreferences("listeDesMemos", MODE_PRIVATE); //récupération de la sharedpreferences de l'activité Ecrire

        if (sharedPreferences1.contains("frigo")) {
            String texte = sharedPreferences1.getString("frigo", null);
            assert texte != null;
            if (!texte.equals("")) {
                notif_frig.setVisibility(View.VISIBLE);
            } else {
                notif_frig.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences1.contains("chat")) {
            String texte1 = sharedPreferences1.getString("chat", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_chat1.setVisibility(View.VISIBLE);
            } else {
                notif_chat1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences1.contains("plante")) {
            String texte2 = sharedPreferences1.getString("plante", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_plant1.setVisibility(View.VISIBLE);
            } else {
                notif_plant1.setVisibility(View.GONE);
            }
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