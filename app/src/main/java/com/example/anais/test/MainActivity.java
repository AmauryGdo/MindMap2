package com.example.anais.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class MainActivity extends AppCompatActivity {
    // définition variable de type bouton
    private Button memo;
    private Button info;
    // Ici est dans le menu d'acceuil qui contient deux boutons. Le bouton mem qui mène au choix des pièces et le bouton info pour la description de l'appli

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
        });}

    private void visualiser_la_suite()
    {
        Intent intent = new Intent( MainActivity.this, Menu.class);
        startActivity(intent);



    }
    private void visualiser_la_suite2()
    {
        Intent intent2= new Intent(MainActivity.this, information.class);
        startActivity(intent2);
    }
}




// Intent intent = new Intent(information); //new Intent(nom activité)



// Nouveau = findViewById(R.id);



