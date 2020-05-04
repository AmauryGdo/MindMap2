package com.example.anais.test;

// Il y a beaucoup de répétition dans notre code, nous avons donc choisi de commenter Chambre, MenuPrincipalFrancais,
// MenuSlection, ChoixLangue et Ecrire

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ChoixLangue extends AppCompatActivity {

    private Button anglais;  // initialisation bouton anglais
    private Button francais; // initialisation bouton francais
    SharedPreferences sharedpreferences; // initialisation d'une sharedPreferences

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//========================== STOCKAGE LANGUE CHOISIE ============================================================

         sharedpreferences = getSharedPreferences("ma_langue", Context.MODE_PRIVATE); //Initialisation de la sharepreferences "ma_langue"
        final SharedPreferences.Editor editor = sharedpreferences.edit();//Pour simplifier le code

        if(sharedpreferences.contains("francais")){ //A l'ouverture, si "ma_langue" contient francais, on ouvre l'activité francaise
            Intent intent = new Intent(ChoixLangue.this, MenuPrincipalFrancais.class);
            startActivity(intent);
}
        if(sharedpreferences.contains("anglais")){ // Inversement en Anglais
            Intent intent = new Intent(ChoixLangue.this, MenuPrincipalAnglais.class);
            startActivity(intent);
        }
//==================================================================================================================

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.choixlangue_vertical);

//================= Bouton anglais ====================================================
                anglais = findViewById(R.id.boutonanglais); //Association variable/bouton
                anglais.setOnClickListener(new View.OnClickListener() { //création d'un listeneur qui au clic execute "visualiser_la_suite"
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();
                        editor.putString("anglais", null); // Au clique, on ajoute "anglais" dans sharedpreferences
                        editor.apply();
                    }
                });
//================= Bouton francais ====================================================
                francais = findViewById(R.id.boutonfrancais);//Association variable/bouton
                francais.setOnClickListener(new View.OnClickListener() { //création d'un listeneur qui au clic execute "visualiser_la_suite"
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                        editor.putString("francais", null); // Au clique, on ajoute "francais" dans sharedpreferences
                        editor.apply();
                    }
                });
                break;

//=======================================================================================

            case Configuration.ORIENTATION_LANDSCAPE: // Similaire mais en mode horizontal
                setContentView(R.layout.choixlangue_horizontal);
                anglais = findViewById(R.id.boutonanglais);
                anglais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();
                        editor.putString("anglais", null);
                        editor.apply();
                    }
                });

                francais = findViewById(R.id.boutonfrancais);
                francais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                        editor.putString("francais", null);
                        editor.apply();
                    }
                });
                break;
        }
    }
// Detecteur de changement d'orientation
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.choixlangue_horizontal);

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.choixlangue_vertical);

        }
//======================= REPETITION ANTI BUG DES BOUTONS ===================================================================
// un bug rendant les boutons inutilisables en cas de rotation. Ceci est une solution contre

        anglais = findViewById(R.id.boutonanglais);
        anglais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite();

            }
        });

        francais = findViewById(R.id.boutonfrancais);
        francais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visualiser_la_suite2();
            }
        });
//================================================================================================
    }

    private void visualiser_la_suite() {
        Intent intent = new Intent(ChoixLangue.this, MenuPrincipalAnglais.class);
        startActivity(intent);

    }


    private void visualiser_la_suite2() {
            Intent intent2 = new Intent(ChoixLangue.this, MenuPrincipalFrancais.class);
        startActivity(intent2);
    }
//Apres une serie de test, l'activity ne semble pas prendre en compte les conditions dans le Oncreate...
    //Il doit m'echapper encore une fois un petit quelque chose
    @Override
    protected void onResume() {
        super.onResume();
        if(sharedpreferences.contains("francais")){ //A l'ouverture, si "ma_langue" contient francais, on ouvre l'activité francaise
            Intent intent = new Intent(ChoixLangue.this, MenuPrincipalFrancais.class);
            startActivity(intent);
        }
        if(sharedpreferences.contains("anglais")){ // Inversement en Anglais
            Intent intent = new Intent(ChoixLangue.this, MenuPrincipalAnglais.class);
            startActivity(intent);
        }
    }
}











