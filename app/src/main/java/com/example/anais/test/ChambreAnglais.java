package com.example.anais.test;
// Il y a beaucoup de répétition dans notre code, nous avons donc choisi de commenter Chambre, MenuPrincipalFrancais,
// MenuSlection, ChoixLangue et Ecrire

import android.content.Intent;
//import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.ImageView;
import android.widget.RelativeLayout;

// Il y a beaucoup de répétition dans notre code j'ai donc choisi de commenter Chambre, Main Activité, Choix Pièce et Ecrire
public class ChambreAnglais extends AppCompatActivity {

   /* ImageView notif_bed;
    ImageView notif_win_2;
    ImageView notif_board;
    SharedPreferences sharedPreferencesanglais;
*/
    @Override
    // Dans le code qui suit nous établissons une action sur les Relative Layout
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.chambre_verticalanglais);

                //Déclaration des variables
                RelativeLayout lit = findViewById(R.id.lit); //Liaison entre variable et Bouton
                // liaison variable image
                lit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(ChambreAnglais.this, EcrireAnglais.class); //Changement d'activité vers Ecrire
                        i.putExtra("objetclique", " bed"); //Lorsque on clique sur le bouton une valeur est envoyé vers la classe Ecrit. A Cette valeur
                        startActivity(i);//est reliée le nom de l'objet associé
                    }
                });

                RelativeLayout fenetre2 = findViewById(R.id.fenetre2);
                fenetre2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(ChambreAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " window"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(ChambreAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " board"); //Optional parameters
                        startActivity(i);
                    }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.chambre_horizontalanglais);
                lit = findViewById(R.id.lit); //Liaison entre variable et Bouton
                lit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(ChambreAnglais.this, EcrireAnglais.class); //Changement d'activité vers Ecrire
                        i.putExtra("objetclique", " bed"); //Lorsque on clique sur le bouton une valeur est envoyé vers la classe Ecrit. A Cette valeur
                        startActivity(i);                                //est reliée le nom de l'objet associé

                    }
                });

                fenetre2 = findViewById(R.id.fenetre2);
                fenetre2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(ChambreAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " window"); //Optional parameters
                        startActivity(i);
                    }
                });

                tableau = findViewById(R.id.tableau);
                tableau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(ChambreAnglais.this, EcrireAnglais.class);
                        i.putExtra("objetclique", " board"); //Optional parameters
                        startActivity(i);
                    }
                });
        }

        //==================================== Detecteur de note a la création ==============================================================
        /*notif_bed = findViewById(R.id.notif_bed); //association variable/image
        notif_win_2 = findViewById(R.id.notif_win_2);
        notif_board = findViewById(R.id.notif_board);

        sharedPreferencesanglais = getBaseContext().getSharedPreferences("listeDesMemos", MODE_PRIVATE); //récupération de la sharedpreferences de l'activité Ecrire

        String texte = sharedPreferencesanglais.getString("bed", null); //On recupere le texte de la key "lit"
        assert texte != null;
        if (!texte.equals("")) {
            notif_bed.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
        }
       else {
            notif_bed.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
        }

        String texte1 = sharedPreferencesanglais.getString("window", null);
        assert texte1 != null;
        if (!texte1.equals("")) {
            notif_win_2.setVisibility(View.VISIBLE);
        }
        else {
            notif_win_2.setVisibility(View.GONE);
        }

        String texte2 = sharedPreferencesanglais.getString("board", null);
        assert texte2 != null;
        if (!texte2.equals("")) {
            notif_board.setVisibility(View.VISIBLE);
        }
        else {
            notif_board.setVisibility(View.GONE);
        }*/
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.chambre_horizontalanglais);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.chambre_verticalanglais);
        }

        //====================Detecteur de note au changement d'orientation =============================================================
        //Il y avait une inconsistance des notifications lors du passage d'une orientation à une autre
        //Si on modifiait les notes et que l'on revenait à l'orientation précedente, les notifications bug

       /* String texte = sharedPreferencesanglais.getString("bed", null); //On recupere le texte de la key "lit"
        assert texte != null;
        if (!texte.equals("")) {
            notif_bed.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
        }
        else {
            notif_bed.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
        }

        String texte1 = sharedPreferencesanglais.getString("window", null);
        assert texte1 != null;
        if (!texte1.equals("")) {
            notif_win_2.setVisibility(View.VISIBLE);
        }
        else {
            notif_win_2.setVisibility(View.GONE);
        }

        String texte2 = sharedPreferencesanglais.getString("board", null);
        assert texte2 != null;
        if (!texte2.equals("")) {
            notif_board.setVisibility(View.VISIBLE);
        }
        else {
            notif_board.setVisibility(View.GONE);
        }
*/
    }

    //----------------------------- Detecteur de note en continu----------------------------------------------------------------
    // Ce callback permet de refresh l'etat des notifications pendant que l'activité est ouverte
   /* @Override
    protected void onResume() {
        super.onResume();

        String texte = sharedPreferencesanglais.getString("bed", null); //On recupere le texte de la key "lit"
        assert texte != null;
        if (!texte.equals("")) {
            notif_bed.setVisibility(View.VISIBLE); // Si le texte est different de vide, on affiche la notification
        }
        else {
            notif_bed.setVisibility(View.GONE); // Si le texte est vide, on fait disparaitre la notification
        }

        String texte1 = sharedPreferencesanglais.getString("window", null);
        assert texte1 != null;
        if (!texte1.equals("")) {
            notif_win_2.setVisibility(View.VISIBLE);
        }
       else {
            notif_win_2.setVisibility(View.GONE);
        }

        String texte2 = sharedPreferencesanglais.getString("board", null);
        assert texte2 != null;
        if (!texte2.equals("")) {
            notif_board.setVisibility(View.VISIBLE);
        }
        else {
            notif_board.setVisibility(View.GONE);
        }
    }*/
}
