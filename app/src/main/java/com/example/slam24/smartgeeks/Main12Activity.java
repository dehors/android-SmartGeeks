package com.example.slam24.smartgeeks;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main12Activity extends AppCompatActivity implements View.OnClickListener, Frag2.OnFragmentInteractionListener, Frag1.OnFragmentInteractionListener {
    Button btnfr1, btnfr2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        Frag1 fagmento1  = new Frag1();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fagmento1);
        btnfr1 = (Button) findViewById(R.id.btnFrag1);
        btnfr2 = (Button) findViewById(R.id.btnFrag2);

        btnfr1.setOnClickListener(this);
        btnfr2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFrag1:
                Frag1 fagmento1  = new Frag1();
                FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, fagmento1);
                transition.commit();
                break;
            case R.id.btnFrag2:
                Frag2 fagmento2  = new Frag2();
                FragmentTransaction transition1 = getSupportFragmentManager().beginTransaction();
                transition1.replace(R.id.contenedor, fagmento2);
                transition1.commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
