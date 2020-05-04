package com.example.anais.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

// Il y a beaucoup de répétition dans notre code, nous avons donc choisi de commenter Chambre, MenuPrincipalFrancais,
// MenuSlection, ChoixLangue et Ecrire

public class EcrireAnglais extends AppCompatActivity{
    TextView origineanglais;
    EditText texteanglais;
    String nomObjetanglais;
    SharedPreferences sharedPreferencesanglais;
    String litanglais;
    ImageView notif_litanglais;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecrire);

        sharedPreferencesanglais= getBaseContext().getSharedPreferences( "listeDesMemos",MODE_PRIVATE); // on définit le tableau associatif
        origineanglais=findViewById(R.id.origine);
        texteanglais=findViewById(R.id.texte);
        // Définition des variables
        Button boutonRetouranglais = findViewById(R.id.boutonRetour);

        Bundle extras = getIntent().getExtras();
        if(extras != null)
        { nomObjetanglais= extras.getString("objetclique"); // on stocke la valeur envoyée dans une variable nomObjet
            origineanglais.setText("You are saving in the object :"+nomObjetanglais); //On affiche que le texte est bien mémorisé dans l'objet cliqué
            if(sharedPreferencesanglais.contains(nomObjetanglais)){  //condition vérifiant si une donnée a déjà été stockée
                String textememorise = sharedPreferencesanglais.getString(nomObjetanglais, null);
                System.out.println(textememorise);
                texteanglais.setText(textememorise);

            }
        }
        boutonRetouranglais.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {  //Lorsque on clique sur le bouton retour on met à jour la mémoire
                // on sauvegarde le texte dans sharedPreferences
                sharedPreferencesanglais.edit().putString(nomObjetanglais, texteanglais.getText().toString()).apply();
                if (sharedPreferencesanglais.contains(litanglais)){
                    notif_litanglais.setVisibility(View.VISIBLE);
                }

                Intent intent = new Intent(EcrireAnglais.this, MenuSelectionAnglais.class); // et on revient au menu
                startActivity(intent);
            }
        });

    }

}








