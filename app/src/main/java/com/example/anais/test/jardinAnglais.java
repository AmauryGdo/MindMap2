package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class jardinAnglais extends AppCompatActivity {

    //Nous sommes dans le jardin il y a 4 zones clicables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.jardin_verticalanglais);


                RelativeLayout fleur = findViewById(R.id.fleur);
                fleur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardinAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "fleur"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout buisson = findViewById(R.id.buisson);
                buisson.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardinAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "buisson"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout table = findViewById(R.id.table);
                table.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardinAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "table"); //Optional parameters
                        startActivity(i);

                    }
                });
                RelativeLayout hamac = findViewById(R.id.hamac);
                hamac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardinAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "hamac"); //Optional parameters
                        startActivity(i);

                    }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.jardin_horizontalanglais);
                fleur = findViewById(R.id.fleur);
                fleur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardinAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "fleur"); //Optional parameters
                        startActivity(i);

                    }
                });

                buisson = findViewById(R.id.buisson);
                buisson.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardinAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "buisson"); //Optional parameters
                        startActivity(i);

                    }
                });

                table = findViewById(R.id.table);
                table.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardinAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "table"); //Optional parameters
                        startActivity(i);

                    }
                });
                hamac = findViewById(R.id.hamac);
                hamac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jardinAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", "hamac"); //Optional parameters
                        startActivity(i);

                    }
                });
                break;
        }
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.jeu_horizontalanglais);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.jeu_verticalanglais  );

        }
    }
}


