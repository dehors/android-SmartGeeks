package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnlinerlayout,btnrelativelayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlinerlayout = (Button) findViewById(R.id.viewlinerlayout);
        btnlinerlayout.setOnClickListener(this);

        btnrelativelayout = (Button) findViewById(R.id.viewrelativelayout);
        btnrelativelayout.setOnClickListener(this);
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
        }
    }
}
