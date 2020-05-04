package com.example.anais.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class jardin extends AppCompatActivity {

    ImageView notif_table;
    ImageView notif_hamac;
    ImageView notif_fleur;
    ImageView notif_buisson;
    SharedPreferences sharedPreferences;
    //Nous sommes dans le jardin il y a 4 zones clicables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.jardin_vertical);


                RelativeLayout fleur = findViewById(R.id.fleur);
                fleur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardin.this, Ecrire.class);
                        i.putExtra("objetclique", "fleur"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout buisson = findViewById(R.id.buisson);
                buisson.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardin.this, Ecrire.class);
                        i.putExtra("objetclique", "buisson"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout table = findViewById(R.id.table);
                table.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardin.this, Ecrire.class);
                        i.putExtra("objetclique", "table"); //Optional parameters
                        startActivity(i);

                    }
                });
                RelativeLayout hamac = findViewById(R.id.hamac);
                hamac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardin.this, Ecrire.class);
                        i.putExtra("objetclique", "hamac"); //Optional parameters
                        startActivity(i);

                    }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.jardin_horizontal);
                fleur = findViewById(R.id.fleur);
                fleur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardin.this, Ecrire.class);
                        i.putExtra("objetclique", "fleur"); //Optional parameters
                        startActivity(i);

                    }
                });

                buisson = findViewById(R.id.buisson);
                buisson.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardin.this, Ecrire.class);
                        i.putExtra("objetclique", "buisson"); //Optional parameters
                        startActivity(i);

                    }
                });

                table = findViewById(R.id.table);
                table.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardin.this, Ecrire.class);
                        i.putExtra("objetclique", "table"); //Optional parameters
                        startActivity(i);

                    }
                });
                hamac = findViewById(R.id.hamac);
                hamac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardin.this, Ecrire.class);
                        i.putExtra("objetclique", "hamac"); //Optional parameters
                        startActivity(i);

                    }
                });
                break;
        }
        //=============================================================================================================
        notif_table = findViewById(R.id.notif_table); //association variable/image
        notif_hamac = findViewById(R.id.notif_hamac);
        notif_fleur = findViewById(R.id.notif_fleur);
        notif_buisson = findViewById(R.id.notif_buisson);

        sharedPreferences = getBaseContext().getSharedPreferences("listeDesMemos", MODE_PRIVATE);
        if (sharedPreferences.contains("table")) {
            String texte = sharedPreferences.getString("table", null);
            assert texte != null;
            if (!texte.equals("")) {
                notif_table.setVisibility(View.VISIBLE);
            } else {
                notif_table.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("hamac")) {
            String texte1 = sharedPreferences.getString("hamac", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_hamac.setVisibility(View.VISIBLE);
            } else {
                notif_hamac.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("fleur")) {
            String texte2 = sharedPreferences.getString("fleur", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_fleur.setVisibility(View.VISIBLE);
            } else {
                notif_fleur.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("buisson")) {
            String texte3 = sharedPreferences.getString("buisson", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_buisson.setVisibility(View.VISIBLE);
            } else {
                notif_buisson.setVisibility(View.GONE);
            }
        }
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.jardin_horizontal);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.jardin_vertical  );
        }
        if (sharedPreferences.contains("table")) {
            String texte = sharedPreferences.getString("table", null);
            assert texte != null;
            if (!texte.equals("")) {
                notif_table.setVisibility(View.VISIBLE);
            } else {
                notif_table.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("hamac")) {
            String texte1 = sharedPreferences.getString("hamac", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_hamac.setVisibility(View.VISIBLE);
            } else {
                notif_hamac.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("fleur")) {
            String texte2 = sharedPreferences.getString("fleur", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_fleur.setVisibility(View.VISIBLE);
            } else {
                notif_fleur.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("buisson")) {
            String texte3 = sharedPreferences.getString("buisson", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_buisson.setVisibility(View.VISIBLE);
            } else {
                notif_buisson.setVisibility(View.GONE);
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (sharedPreferences.contains("table")) {
            String texte = sharedPreferences.getString("table", null);
            assert texte != null;
            if (!texte.equals("")) {
                notif_table.setVisibility(View.VISIBLE);
            } else {
                notif_table.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("hamac")) {
            String texte1 = sharedPreferences.getString("hamac", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_hamac.setVisibility(View.VISIBLE);
            } else {
                notif_hamac.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("fleur")) {
            String texte2 = sharedPreferences.getString("fleur", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_fleur.setVisibility(View.VISIBLE);
            } else {
                notif_fleur.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("buisson")) {
            String texte3 = sharedPreferences.getString("buisson", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_buisson.setVisibility(View.VISIBLE);
            } else {
                notif_buisson.setVisibility(View.GONE);
            }
        }
    }
}


