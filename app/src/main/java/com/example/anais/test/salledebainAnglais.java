package com.example.anais.test;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

//Nous sommes dans le salon avec 3 zones clicables

// Il y a beaucoup de répétition dans notre code, nous avons donc choisi de commenter Chambre, MenuPrincipalFrancais,
// MenuSlection, ChoixLangue et Ecrire

public class salledebainAnglais extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.salledebain_verticalanglais);

                RelativeLayout lavabo = findViewById(R.id.lavabo);
                lavabo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebainAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " sink"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout baignoire = findViewById(R.id.baignoire);
                baignoire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebainAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " bathub"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout corbeille2 = findViewById(R.id.corbeille2);
                corbeille2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebainAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " wastepaper 2"); //Optional parameters
                        startActivity(i);

                    }
                });

                break;

            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.salledebain_horizontalanglais);

                lavabo = findViewById(R.id.lavabo);
                lavabo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebainAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " sink"); //Optional parameters
                        startActivity(i);

                    }
                });

                baignoire = findViewById(R.id.baignoire);
                baignoire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebainAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " bathub"); //Optional parameters
                        startActivity(i);

                    }
                });

                corbeille2 = findViewById(R.id.corbeille2);
                corbeille2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(salledebainAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " wastepaper 2"); //Optional parameters
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
            setContentView(R.layout.salledebain_horizontalanglais);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.salledebain_verticalanglais  );

        }
    }
}
