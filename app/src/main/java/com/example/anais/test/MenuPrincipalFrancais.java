package com.example.anais.test;

// Il y a beaucoup de répétition dans notre code, nous avons donc choisi de commenter Chambre, MenuPrincipalFrancais,
// MenuSlection, ChoixLangue et Ecrire

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipalFrancais extends AppCompatActivity {
    // définition variable de type bouton
    private Button memo;
    private Button info;
    private Button langue;
    SharedPreferences sharedpreferences ; // recupération de la sharedpreferences de Choixlangue

    // Ici est dans le menu d'acceuil qui contient deux boutons. Le bouton mem qui mène au choix des pièces et le bouton info pour la description de l'appli


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.menu_principal_vertical);
                memo = findViewById(R.id.boutonMem);
                memo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite(); }
                });

                info = findViewById(R.id.infor);
                info.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });

                langue = findViewById(R.id.Langue);
                langue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite3(); }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.menu_principal_horizontal);
                memo = findViewById(R.id.boutonMem);
                memo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });

                info = findViewById(R.id.infor);
                info.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });

                langue = findViewById(R.id.Langue);
                langue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite3(); }
                });
                break;
        }
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.menu_principal_horizontal);

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.menu_principal_vertical);

        }
        memo = findViewById(R.id.boutonMem);
        info = findViewById(R.id.infor);
        memo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite();

            }
        });

        info = findViewById(R.id.infor);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite2();
            }
        });

        langue = findViewById(R.id.Langue);
        langue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite3(); }
        });
    }


    private void visualiser_la_suite() {
        Intent intent = new Intent(MenuPrincipalFrancais.this, MenuSelection.class);
        startActivity(intent);
    }

    private void visualiser_la_suite2() {
        Intent intent2 = new Intent(MenuPrincipalFrancais.this, information.class);
        startActivity(intent2);
    }

    private void visualiser_la_suite3() {
        /*sharedpreferences.edit().remove("francais"); //remove de "francais" pour que l'activité choixlangue s'ouvre
        sharedpreferences.edit().apply();*/
        Intent intent3 = new Intent(MenuPrincipalFrancais.this, ChoixLangue.class);
        startActivity(intent3);
    }

}