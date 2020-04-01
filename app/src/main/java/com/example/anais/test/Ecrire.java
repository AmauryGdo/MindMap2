package com.example.anais.test;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;
// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
//Nous sommes dans l'activité qui permet à l'utilisateur de saisir le texte qu'il veut faire mémoriser dans un objet
public class Ecrire extends AppCompatActivity{
    // Définition des variables
    private Button boutonRetour;
    TextView origine;
    EditText texte;
    String nomObjet;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecrire);


        sharedPreferences= getBaseContext().getSharedPreferences( "listeDesMemos",MODE_PRIVATE); // on définit le tableau associatif
        origine=findViewById(R.id.origine);
        texte=findViewById(R.id.texte);
        boutonRetour = findViewById(R.id.boutonRetour);


        Bundle extras = getIntent().getExtras();
        if(extras != null)
        { nomObjet= extras.getString("objetclique"); // on stocke la valeur envoyée dans une variable nomObjet
            origine.setText("Vous enregistrez dans l'objet:"+nomObjet); //On affiche que le texte est bien mémorisé dans l'objet cliqué
            if(sharedPreferences.contains(nomObjet)){  //condition vérifiant si une donnée a déjà été stockée
                String textememorise = sharedPreferences.getString(nomObjet, null);
                System.out.println(textememorise);
                texte.setText(textememorise);

            }

        }
        boutonRetour.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {  //Lorsque on clique sur le bouton retour on met à jour la mémoire
                // on sauvegarde le texte dans sharedPreferences
                sharedPreferences.edit().putString(nomObjet, texte.getText().toString()).apply();
                //finish();
                Intent intent = new Intent(Ecrire.this, Choixpiece.class); // et on revient au menu
                startActivity(intent);
            }
        });

    }

}

    /*
private void visualiser_la_suite()
{
    Intent intent = new Intent(this, Choixpiece.class);
    startActivity(intent);

}
*/






