package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu_paysage extends AppCompatActivity {
    // définition variable de type bouton
    private Button memo;
    private Button info;
    // Ici est dans le menu d'acceuil qui contient deux boutons. Le bouton mem qui mène au choix des pièces et le bouton info pour la description de l'appli


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.menu_paysage);


        switch (getResources().getConfiguration().orientation) {
            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.menu_verti);
                memo = findViewById(R.id.boutonMem);
                // monBouton.setText("Valisez");
                memo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });

                info= findViewById(R.id.infor);
                info.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });
                break;

            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.menu_paysage);
                memo = findViewById(R.id.boutonMem);
                // monBouton.setText("Valisez");
                memo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite();

                    }
                });

                info= findViewById(R.id.infor);
                info.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        visualiser_la_suite2();
                    }
                });
                break;
        }
    }


    // protected void onConfigurationChanged (Bundle savedInstanceState) {

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.menu_paysage);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.menu_verti);

        }
    }

    private void visualiser_la_suite()
    {
        Intent intent = new Intent(menu_paysage.this, Choixpiece.class);
        startActivity(intent);



    }
    private void visualiser_la_suite2()
    {
        Intent intent2= new Intent(menu_paysage.this, information.class);
        startActivity(intent2);
    }
}