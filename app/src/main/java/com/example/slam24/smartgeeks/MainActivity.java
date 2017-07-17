package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnlinerlayout,btnrelativelayout,bntcontrollers, btnspinner, btnlisview, btnlisviewwal;
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
        }
    }
}
