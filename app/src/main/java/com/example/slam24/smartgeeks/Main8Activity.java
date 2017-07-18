package com.example.slam24.smartgeeks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main8Activity extends AppCompatActivity {
    Button btnsend;
    EditText etsend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        btnsend = (Button) findViewById(R.id.btnpantalla1);
        etsend = (EditText) findViewById(R.id.etsend);

        btnsend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main8Activity.this, Main9Activity.class);
                intent.putExtra("info",etsend.getText().toString());
                startActivity(intent);
            }
        });
    }
}
