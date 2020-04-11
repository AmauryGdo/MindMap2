package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

//Nous sommes dans le salon avec 3 zones clicables
// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class salledebain extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
            setContentView(R.layout.salledebain_vertical);

            RelativeLayout lavabo = findViewById(R.id.lavabo);
            lavabo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(salledebain.this, Ecrire.class);
                    i.putExtra("objetclique", "lavabo"); //Optional parameters
                    startActivity(i);

                }
            });

            RelativeLayout baignoire = findViewById(R.id.baignoire);
            baignoire.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(salledebain.this, Ecrire.class);
                    i.putExtra("objetclique", "baignoire"); //Optional parameters
                    startActivity(i);

                }
            });

            RelativeLayout corbeille2 = findViewById(R.id.corbeille2);
            corbeille2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(salledebain.this, Ecrire.class);
                    i.putExtra("objetclique", "corbeille2"); //Optional parameters
                    startActivity(i);

                }
            });

                break;

            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.salledebain_horizontal);

                 lavabo = findViewById(R.id.lavabo);
                lavabo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebain.this, Ecrire.class);
                        i.putExtra("objetclique", "lavabo"); //Optional parameters
                        startActivity(i);

                    }
                });

                 baignoire = findViewById(R.id.baignoire);
                baignoire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebain.this, Ecrire.class);
                        i.putExtra("objetclique", "baignoire"); //Optional parameters
                        startActivity(i);

                    }
                });

                 corbeille2 = findViewById(R.id.corbeille2);
                corbeille2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebain.this, Ecrire.class);
                        i.putExtra("objetclique", "corbeille2"); //Optional parameters
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
            setContentView(R.layout.salledebain_horizontal);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.salledebain_vertical  );

        }
    }
}
