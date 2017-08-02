package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main16Activity extends AppCompatActivity {
    EditText etid,etName,etPhone;
    Button btnSaveSQL,btnFindSQL,btnDeleteSQL,btnUpdateSQL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        etid = (EditText) findViewById(R.id.etid);
        etName = (EditText) findViewById(R.id.etName);
        etPhone = (EditText) findViewById(R.id.etPhone);

        btnSaveSQL =  (Button) findViewById(R.id.btnSaveSQL);
        btnFindSQL =  (Button) findViewById(R.id.btnFindSQL);
        btnDeleteSQL =  (Button) findViewById(R.id.btnDeleteSQL);
        btnUpdateSQL =  (Button) findViewById(R.id.btnUpdateSQL);

        btnSaveSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnUpdateSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnFindSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnDeleteSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
