package com.example.anais.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipalAnglais extends AppCompatActivity {
    // définition variable de type bouton
    private Button memoanglais;
    private Button infoanglais;
    private Button langue;
    SharedPreferences sharedpreferences ;
    // Ici est dans le menu d'acceuil qui contient deux boutons. Le bouton mem qui mène au choix des pièces et le bouton info pour la description de l'appli


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.menu_principal_verticalanglais);
                memoanglais = findViewById(R.id.boutonMemanglais);
                memoanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite(); }
                });

                infoanglais = findViewById(R.id.inforanglais);
                infoanglais.setOnClickListener(new View.OnClickListener() {
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
                setContentView(R.layout.menu_principal_horizontalanglais);
                memoanglais = findViewById(R.id.boutonMemanglais);
                memoanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });

                infoanglais = findViewById(R.id.inforanglais);
                infoanglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });

                langue = findViewById(R.id.Langueanglais);
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
            setContentView(R.layout.menu_principal_horizontalanglais);

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.menu_principal_verticalanglais);

        }
        memoanglais = findViewById(R.id.boutonMemanglais);
        infoanglais = findViewById(R.id.inforanglais);
        memoanglais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite();

            }
        });

        infoanglais = findViewById(R.id.inforanglais);
        infoanglais.setOnClickListener(new View.OnClickListener() {
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
        Intent intent = new Intent(MenuPrincipalAnglais.this, MenuSelectionAnglais.class);
        startActivity(intent);
    }

    private void visualiser_la_suite2() {
        Intent intent2 = new Intent(MenuPrincipalAnglais.this, informationAnglais.class);
        startActivity(intent2);
    }

    private void visualiser_la_suite3() {
        Intent intent3 = new Intent(MenuPrincipalAnglais.this, ChoixLangue.class);
        startActivity(intent3);
    }
}