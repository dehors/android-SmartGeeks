package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    Button btnarriba, btnabajo, btnderecha, btnizquierda, btncenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btncenter = (Button) findViewById(R.id.btncentrocentrocentro);
        btncenter.setOnClickListener(this);

        btnarriba = (Button) findViewById(R.id.btncentrohorizontalarriba);
        btnarriba.setOnClickListener(this);

        btnabajo = (Button) findViewById(R.id.btncentrohorizontalabajo);
        btnabajo.setOnClickListener(this);

        btnizquierda = (Button) findViewById(R.id.btncentrohorizontalizquierda);
        btnizquierda.setOnClickListener(this);

        btnderecha = (Button) findViewById(R.id.btncentrohorizontalderecha);
        btnderecha.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btncentrocentrocentro:
                Toast.makeText(getApplicationContext(),"Center",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btncentrohorizontalarriba:
                Toast.makeText(getApplicationContext(),"Up",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btncentrohorizontalabajo:
                Toast.makeText(getApplicationContext(),"Down",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btncentrohorizontalizquierda:
                Toast.makeText(getApplicationContext(),"Left",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btncentrohorizontalderecha:
                Toast.makeText(getApplicationContext(),"Right",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
