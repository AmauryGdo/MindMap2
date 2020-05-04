package com.example.anais.test;

// Il y a beaucoup de répétition dans notre code, nous avons donc choisi de commenter Chambre, MenuPrincipalFrancais,
// MenuSlection, ChoixLangue et Ecrire

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class cuisine extends AppCompatActivity {

    ImageView notif_frig;
    ImageView notif_chat1;
    ImageView notif_plant1;
    ImageView notif_four1;
    ImageView notif_fen1;
    ImageView notif_orange;
    ImageView notif_corb;
    ImageView notif_armo1;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {

            case Configuration.ORIENTATION_PORTRAIT:

                setContentView(R.layout.cuisine_vertical);
                RelativeLayout frigo = findViewById(R.id.frig1);
                frigo.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "frigo"); //Optional parameters
                        startActivity(i);

                    }
                });

                RelativeLayout orange = findViewById(R.id.orange1);
                orange.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "orange"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout corbeille = findViewById(R.id.corbeille1);
                corbeille.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "corbeille"); //Optional parameters
                        startActivity(i);
                    }
                });
                RelativeLayout fenetre = findViewById(R.id.fenetre1);
                fenetre.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "fenetre"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout four = findViewById(R.id.four1);
                four.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "four"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout plante = findViewById(R.id.plante1);
                plante.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "plante"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout armoire = findViewById(R.id.armoire1);
                armoire.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "armoire"); //Optional parameters
                        startActivity(i);
                    }
                });

                RelativeLayout chat = findViewById(R.id.chat1);
                chat.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "chat"); //Optional parameters
                        startActivity(i);
                    }
                });
                break;


            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.cuisine_horizontal);
                frigo = findViewById(R.id.frig1);
                frigo.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "frigo"); //Optional parameters
                        startActivity(i);

                    }
                });

                orange = findViewById(R.id.orange1);
                orange.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "orange"); //Optional parameters
                        startActivity(i);
                    }
                });

                corbeille = findViewById(R.id.corbeille1);
                corbeille.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "corbeille"); //Optional parameters
                        startActivity(i);
                    }
                });
                fenetre = findViewById(R.id.fenetre1);
                fenetre.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "fenetre"); //Optional parameters
                        startActivity(i);
                    }
                });

                four = findViewById(R.id.four1);
                four.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "four"); //Optional parameters
                        startActivity(i);
                    }
                });

                plante = findViewById(R.id.plante1);
                plante.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "plante"); //Optional parameters
                        startActivity(i);
                    }
                });

                armoire = findViewById(R.id.armoire1);
                armoire.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "armoire"); //Optional parameters
                        startActivity(i);
                    }
                });

                chat = findViewById(R.id.chat1);
                chat.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(cuisine.this, Ecrire.class);
                        i.putExtra("objetclique", "chat"); //Optional parameters
                        startActivity(i);
                    }
                });

        }

        //==================================== Detecteur de note a la création ==============================================================
        notif_frig = findViewById(R.id.notif_frig); //association variable/image
        notif_chat1 = findViewById(R.id.notif_chat1);
        notif_plant1 = findViewById(R.id.notif_plant1);
        notif_four1 = findViewById(R.id.notif_four1);
        notif_fen1 = findViewById(R.id.notif_fen1);
        notif_orange = findViewById(R.id.notif_orange);
        notif_corb = findViewById(R.id.notif_corb);
        notif_armo1 = findViewById(R.id.notif_armo1);

        sharedPreferences = getBaseContext().getSharedPreferences("listeDesMemos", MODE_PRIVATE); //récupération de la sharedpreferences de l'activité Ecrire

        if (sharedPreferences.contains("frigo")) {
            String texte = sharedPreferences.getString("frigo", null);
            assert texte != null;
            if (!texte.equals("")) {
                notif_frig.setVisibility(View.VISIBLE);
            } else {
                notif_frig.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("chat")) {
            String texte1 = sharedPreferences.getString("chat", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_chat1.setVisibility(View.VISIBLE);
            } else {
                notif_chat1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("plante")) {
            String texte2 = sharedPreferences.getString("plante", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_plant1.setVisibility(View.VISIBLE);
            } else {
                notif_plant1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("four")) {
            String texte3 = sharedPreferences.getString("four", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_four1.setVisibility(View.VISIBLE);
            } else {
                notif_four1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("fenetre")) {
            String texte4 = sharedPreferences.getString("fenetre", null);
            assert texte4!= null;
            if (!texte4.equals("")) {
                notif_fen1.setVisibility(View.VISIBLE);
            } else {
                notif_fen1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("orange")) {
            String texte5 = sharedPreferences.getString("orange", null);
            assert texte5 != null;
            if (!texte5.equals("")) {
                notif_orange.setVisibility(View.VISIBLE);
            } else {
                notif_orange.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("corbeille")) {
            String texte6 = sharedPreferences.getString("corbeille", null);
            assert texte6!= null;
            if (!texte6.equals("")) {
                notif_corb.setVisibility(View.VISIBLE);
            } else {
                notif_corb.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("armoire")) {
            String texte7 = sharedPreferences.getString("armoire", null);
            assert texte7 != null;
            if (!texte7.equals("")) {
                notif_armo1.setVisibility(View.VISIBLE);
            } else {
                notif_armo1.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.cuisine_horizontal);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.cuisine_vertical);
        }
        if (sharedPreferences.contains("frigo")) {
            String texte = sharedPreferences.getString("frigo", null);
            assert texte != null;
            if (!texte.equals("")) {
                notif_frig.setVisibility(View.VISIBLE);
            } else {
                notif_frig.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("chat")) {
            String texte1 = sharedPreferences.getString("chat", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_chat1.setVisibility(View.VISIBLE);
            } else {
                notif_chat1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("plante")) {
            String texte2 = sharedPreferences.getString("plante", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_plant1.setVisibility(View.VISIBLE);
            } else {
                notif_plant1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("four")) {
            String texte3 = sharedPreferences.getString("four", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_four1.setVisibility(View.VISIBLE);
            } else {
                notif_four1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("fenetre")) {
            String texte4 = sharedPreferences.getString("fenetre", null);
            assert texte4!= null;
            if (!texte4.equals("")) {
                notif_fen1.setVisibility(View.VISIBLE);
            } else {
                notif_fen1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("orange")) {
            String texte5 = sharedPreferences.getString("orange", null);
            assert texte5 != null;
            if (!texte5.equals("")) {
                notif_orange.setVisibility(View.VISIBLE);
            } else {
                notif_orange.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("corbeille")) {
            String texte6 = sharedPreferences.getString("corbeille", null);
            assert texte6!= null;
            if (!texte6.equals("")) {
                notif_corb.setVisibility(View.VISIBLE);
            } else {
                notif_corb.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("armoire")) {
            String texte7 = sharedPreferences.getString("armoire", null);
            assert texte7 != null;
            if (!texte7.equals("")) {
                notif_armo1.setVisibility(View.VISIBLE);
            } else {
                notif_armo1.setVisibility(View.GONE);
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (sharedPreferences.contains("frigo")) {
            String texte = sharedPreferences.getString("frigo", null);
            assert texte != null;
            if (!texte.equals("")) {
                notif_frig.setVisibility(View.VISIBLE);
            } else {
                notif_frig.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("chat")) {
            String texte1 = sharedPreferences.getString("chat", null);
            assert texte1 != null;
            if (!texte1.equals("")) {
                notif_chat1.setVisibility(View.VISIBLE);
            } else {
                notif_chat1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("plante")) {
            String texte2 = sharedPreferences.getString("plante", null);
            assert texte2 != null;
            if (!texte2.equals("")) {
                notif_plant1.setVisibility(View.VISIBLE);
            } else {
                notif_plant1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("four")) {
            String texte3 = sharedPreferences.getString("four", null);
            assert texte3 != null;
            if (!texte3.equals("")) {
                notif_four1.setVisibility(View.VISIBLE);
            } else {
                notif_four1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("fenetre")) {
            String texte4 = sharedPreferences.getString("fenetre", null);
            assert texte4!= null;
            if (!texte4.equals("")) {
                notif_fen1.setVisibility(View.VISIBLE);
            } else {
                notif_fen1.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("orange")) {
            String texte5 = sharedPreferences.getString("orange", null);
            assert texte5 != null;
            if (!texte5.equals("")) {
                notif_orange.setVisibility(View.VISIBLE);
            } else {
                notif_orange.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("corbeille")) {
            String texte6 = sharedPreferences.getString("corbeille", null);
            assert texte6!= null;
            if (!texte6.equals("")) {
                notif_corb.setVisibility(View.VISIBLE);
            } else {
                notif_corb.setVisibility(View.GONE);
            }
        }
        if (sharedPreferences.contains("armoire")) {
            String texte7 = sharedPreferences.getString("armoire", null);
            assert texte7 != null;
            if (!texte7.equals("")) {
                notif_armo1.setVisibility(View.VISIBLE);
            } else {
                notif_armo1.setVisibility(View.GONE);
            }
        }
    }
}