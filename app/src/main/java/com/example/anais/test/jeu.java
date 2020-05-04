package com.example.anais.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// Il y a beaucoup de répétition dans notre code, nous avons donc choisi de commenter Chambre, MenuPrincipalFrancais,
// MenuSlection, ChoixLangue et Ecrire

public class jeu extends AppCompatActivity {

    ImageView notif_pouffr;
    ImageView notif_tableaufr;
    ImageView notif_guitarefr;
    ImageView notif_batteriefr;
    ImageView notif_xylophonefr;

    SharedPreferences sharedPreferences;

    //Nous sommes dans la salle de jeu et elle contient 4 zones clicables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.jeu_vertical);


                RelativeLayout guitare = findViewById(R.id.guitare);
                guitare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "guitare"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "tableau"); //Optional parameters
                        startActivity(i);

                    }
                });


                RelativeLayout xylophone = findViewById(R.id.xylophone);
                xylophone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "xylophone"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout pouf = findViewById(R.id.pouf);
                pouf.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "pouf"); //Optional parameters
                        startActivity(i);

                    }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.jeu_horizontal);

                guitare = findViewById(R.id.guitare);
                guitare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "guitare"); //Optional parameters
                        startActivity(i);

                    }
                });

                tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "tableau"); //Optional parameters
                        startActivity(i);

                    }
                });


                xylophone = findViewById(R.id.xylophone);
                xylophone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "xylophone"); //Optional parameters
                        startActivity(i);

                    }
                });

                pouf = findViewById(R.id.pouf);
                pouf.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jeu.this, Ecrire.class);
                        i.putExtra("objetclique", "pouf"); //Optional parameters
                        startActivity(i);

                    }
                });
        }

        //==================================== Detecteur de note a la création ==============================================================
        notif_pouffr = findViewById(R.id.notif_pouffr); //association variable/image
        notif_tableaufr = findViewById(R.id.notif_tableaufr);
        notif_guitarefr = findViewById(R.id.notif_guitarefr);
        notif_batteriefr = findViewById(R.id.notif_batteriefr);
        notif_xylophonefr = findViewById(R.id.notif_xylophonefr);

        sharedPreferences = getBaseContext().getSharedPreferences("listeDesMemos", MODE_PRIVATE); //récupération de la sharedpreferences de l'activité Ecrire
        if (sharedPreferences.contains("pouf")) {
            String texte = sharedPreferences.getString("pouf", null); //On recupere le texte de la key "lit"
            assert texte != null;
            if (!texte.equals("")) {
                notif_pouffr.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            } else {
                notif_pouffr.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        if (sharedPreferences.contains("tableau")) {
            String texte1 = sharedPreferences.getString("tableau", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_tableaufr.setVisibility(View.VISIBLE);
            } else {
                notif_tableaufr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("guitare")) {
            String texte2 = sharedPreferences.getString("guitare", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_guitarefr.setVisibility(View.VISIBLE);
            } else {
                notif_guitarefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("batterie")) {
            String texte3 = sharedPreferences.getString("batterie", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_batteriefr.setVisibility(View.VISIBLE);
            } else {
                notif_batteriefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("xylophone")) {
            String texte4 = sharedPreferences.getString("xylophone", null);
            assert texte4 != null;
            if (!texte4.equals("")) {
                notif_xylophonefr.setVisibility(View.VISIBLE);
            } else {
                notif_xylophonefr.setVisibility(View.GONE);
            }
        }
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);


        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.jeu_horizontal);

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.jeu_vertical  );

        }
        //====================Detecteur de note au changement d'orientation =============================================================
        //Il y avait une inconsistance des notifications lors du passage d'une orientation à une autre
        //Si on modifiait les notes et que l'on revenait à l'orientation précedente, les notifications bug

        if (sharedPreferences.contains("pouf")) {
            String texte = sharedPreferences.getString("pouf", null); //On recupere le texte de la key "lit"
            assert texte != null;
            if (!texte.equals("")) {
                notif_pouffr.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            } else {
                notif_pouffr.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        if (sharedPreferences.contains("tableau")) {
            String texte1 = sharedPreferences.getString("tableau", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_tableaufr.setVisibility(View.VISIBLE);
            } else {
                notif_tableaufr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("guitare")) {
            String texte2 = sharedPreferences.getString("guitare", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_guitarefr.setVisibility(View.VISIBLE);
            } else {
                notif_guitarefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("batterie")) {
            String texte3 = sharedPreferences.getString("batterie", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_batteriefr.setVisibility(View.VISIBLE);
            } else {
                notif_batteriefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("xylophone")) {
            String texte4 = sharedPreferences.getString("xylophone", null);
            assert texte4 != null;
            if (!texte4.equals("")) {
                notif_xylophonefr.setVisibility(View.VISIBLE);
            } else {
                notif_xylophonefr.setVisibility(View.GONE);
            }
        }
    }

    //----------------------------- Detecteur de note en continu----------------------------------------------------------------
    // Ce callback permet de refresh l'etat des notifications pendant que l'activité est ouverte
    @Override
    protected void onResume() {
        super.onResume();

        if (sharedPreferences.contains("pouf")) {
            String texte = sharedPreferences.getString("pouf", null); //On recupere le texte de la key "lit"
            assert texte != null;
            if (!texte.equals("")) {
                notif_pouffr.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
            } else {
                notif_pouffr.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
            }
        }
        if (sharedPreferences.contains("tableau")) {
            String texte1 = sharedPreferences.getString("tableau", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_tableaufr.setVisibility(View.VISIBLE);
            } else {
                notif_tableaufr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("guitare")) {
            String texte2 = sharedPreferences.getString("guitare", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_guitarefr.setVisibility(View.VISIBLE);
            } else {
                notif_guitarefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("batterie")) {
            String texte3 = sharedPreferences.getString("batterie", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_batteriefr.setVisibility(View.VISIBLE);
            } else {
                notif_batteriefr.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("xylophone")) {
            String texte4 = sharedPreferences.getString("xylophone", null);
            assert texte4 != null;
            if (!texte4.equals("")) {
                notif_xylophonefr.setVisibility(View.VISIBLE);
            } else {
                notif_xylophonefr.setVisibility(View.GONE);
            }
        }
    }
}
