package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button  btnlinerlayout,btnrelativelayout,
            bntcontrollers, btnspinner, btnlisview,
            btnlisviewwal, btnsenddata, btncustom,
            btnfrag, btnfragdinami, btnTabbed, btnNav, btnsp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlinerlayout = (Button) findViewById(R.id.viewlinerlayout);
        btnlinerlayout.setOnClickListener(this);

        btnrelativelayout = (Button) findViewById(R.id.viewrelativelayout);
        btnrelativelayout.setOnClickListener(this);

        bntcontrollers = (Button) findViewById(R.id.viewcontrollers);
        bntcontrollers.setOnClickListener(this);

        btnspinner = (Button) findViewById(R.id.viewspinner);
        btnspinner.setOnClickListener(this);

        btnlisview = (Button) findViewById(R.id.viewlistview);
        btnlisview.setOnClickListener(this);

        btnlisviewwal = (Button) findViewById(R.id.viewlistviewwarraylist);
        btnlisviewwal.setOnClickListener(this);

        btnsenddata = (Button) findViewById(R.id.viewdatabewteenactivities);
        btnsenddata.setOnClickListener(this);

        btncustom = (Button) findViewById(R.id.viewcustombotton);
        btncustom.setOnClickListener(this);

        btnfrag = (Button) findViewById(R.id.viewfragment);
        btnfrag.setOnClickListener(this);

        btnfragdinami = (Button) findViewById(R.id.viewfragmentdinamic);
        btnfragdinami.setOnClickListener(this);

        btnTabbed = (Button) findViewById(R.id.viewTabbed);
        btnTabbed.setOnClickListener(this);

        btnNav = (Button) findViewById(R.id.viewNav);
        btnNav.setOnClickListener(this);

        btnsp = (Button) findViewById(R.id.viewSP);
        btnsp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.viewlinerlayout:
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.viewrelativelayout:
                Intent intent1 = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent1);
                break;
            case R.id.viewcontrollers:
                Intent intent2 = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent2);
                break;
            case R.id.viewspinner:
                Intent intent3 = new Intent(MainActivity.this,Main5Activity.class);
                startActivity(intent3);
                break;
            case R.id.viewlistview:
                Intent intent4 = new Intent(MainActivity.this,Main6Activity.class);
                startActivity(intent4);
                break;
            case R.id.viewlistviewwarraylist:
                Intent intent5 = new Intent(MainActivity.this,Main7Activity.class);
                startActivity(intent5);
                break;
            case R.id.viewdatabewteenactivities:
                Intent intent6 = new Intent(MainActivity.this,Main8Activity.class);
                startActivity(intent6);
                break;
            case R.id.viewcustombotton:
                Intent intent7 = new Intent(MainActivity.this,Main10Activity.class);
                startActivity(intent7);
                break;
            case R.id.viewfragment:
                Intent intent8 = new Intent(MainActivity.this,Main11Activity.class);
                startActivity(intent8);
                break;
            case R.id.viewfragmentdinamic:
                Intent intent9 = new Intent(MainActivity.this,Main12Activity.class);
                startActivity(intent9);
                break;
            case R.id.viewTabbed:
                Intent intent10 = new Intent(MainActivity.this,Main13Activity.class);
                startActivity(intent10);
                break;
            case R.id.viewNav:
                Intent intent11 = new Intent(MainActivity.this,Main14Activity.class);
                startActivity(intent11);
                break;
            case R.id.viewSP:
                Intent intent12 = new Intent(MainActivity.this,Main15Activity.class);
                startActivity(intent12);
                break;
        }
    }
}
