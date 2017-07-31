package com.example.slam24.smartgeeks;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main11Activity extends AppCompatActivity implements Frag1.OnFragmentInteractionListener, Frag2.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
