package com.example.slam24.smartgeeks;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main15Activity extends AppCompatActivity {

    Button btnsave, btnshow;
    EditText etdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        final Context context = this;
        SharedPreferences sharedPreferences = getSharedPreferences("ArchivoSP", context.MODE_PRIVATE);

        btnsave = (Button) findViewById(R.id.btnSave);
        btnshow = (Button) findViewById(R.id.btnShow);
        etdata = (EditText) findViewById(R.id.etData);

        btnsave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences sharedPref = getPreferences(context.MODE_PRIVATE);
                SharedPreferences.Editor editor  = sharedPref.edit();
                editor.putString("Midato", etdata.getText().toString());
                editor.commit();
            }
        });
        btnshow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences sharpref = getPreferences(context.MODE_PRIVATE);
                String valor = sharpref.getString("Midato","No hay dato");
                Toast.makeText(getApplicationContext(), "Dato guardado :"+valor,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
