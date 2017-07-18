package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main9Activity extends AppCompatActivity {
    TextView tvinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        tvinfo = (TextView) findViewById(R.id.tvanswer);

        Bundle bundle = getIntent().getExtras();

        String dato = bundle.get("info").toString();
        tvinfo.setText(dato);
    }
}
