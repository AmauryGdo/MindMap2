package com.example.anais.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.HashMap;

//Nous sommes dans le salon avec 3 zones clicables
// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class salledebain extends AppCompatActivity {
    private RelativeLayout lavabo;
    private RelativeLayout corbeille2;
    private RelativeLayout baignoire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salledebain);

        lavabo= findViewById(R.id.lavabo);
        lavabo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(salledebain.this, Ecrire.class);
                i.putExtra("objetclique", "lavabo"); //Optional parameters
                startActivity(i);

            }
        });

        baignoire= findViewById(R.id.baignoire);
        baignoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(salledebain.this, Ecrire.class);
                i.putExtra("objetclique", "baignoire"); //Optional parameters
                startActivity(i);

            }
        });

        corbeille2= findViewById(R.id.corbeille2);
        corbeille2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(salledebain.this, Ecrire.class);
                i.putExtra("objetclique", "corbeille2"); //Optional parameters
                startActivity(i);

            }
        });



    }

}
