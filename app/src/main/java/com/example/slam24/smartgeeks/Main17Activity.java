package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main17Activity extends AppCompatActivity {
    EditText etid,etName,etPhone;
    Button btnSaveMySQL,btnConsult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        etid = (EditText) findViewById(R.id.etid);
        etName = (EditText) findViewById(R.id.etName);
        etPhone = (EditText) findViewById(R.id.etPhone);

        btnSaveMySQL =  (Button) findViewById(R.id.btnSaveMySQL);
        btnConsult =  (Button) findViewById(R.id.btnConsult);
    }
}
