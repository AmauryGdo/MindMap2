package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class salonAnglais extends AppCompatActivity {

    //Nous sommes dans le salon il y a 5 zones clicables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.salon_verticalanglais);

                //  Description des variables
                RelativeLayout lampe = findViewById(R.id.lampe2);
                lampe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salonAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " lamp"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout canape = findViewById(R.id.canape);
                canape.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salonAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " sofa"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout tablebasse = findViewById(R.id.tablebasse);
                tablebasse.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salonAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " low table"); //Optional parameters
                        startActivity(i);

                    }
                });
                RelativeLayout buisson2 = findViewById(R.id.buisson2);
                buisson2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salonAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " bush 2"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout tele = findViewById(R.id.tele);
                tele.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salonAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " Tv"); //Optional parameters
                        startActivity(i);

                    }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.salon_horizontal);

                lampe = findViewById(R.id.lampe2);
                lampe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salonAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " lamp"); //Optional parameters
                        startActivity(i);

                    }
                });

                canape = findViewById(R.id.canape);
                canape.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salonAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " sofa"); //Optional parameters
                        startActivity(i);

                    }
                });

                tablebasse = findViewById(R.id.tablebasse);
                tablebasse.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salonAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " low table"); //Optional parameters
                        startActivity(i);

                    }
                });
                buisson2 = findViewById(R.id.buisson2);
                buisson2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salonAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " bush 2"); //Optional parameters
                        startActivity(i);

                    }
                });

                tele = findViewById(R.id.tele);
                tele.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salonAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " tv"); //Optional parameters
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
            setContentView(R.layout.salon_horizontalanglais);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.salon_verticalanglais  );

        }
    }
}



