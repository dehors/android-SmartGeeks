package com.example.slam24.smartgeeks;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        final AyudaBD ayudadb = new AyudaBD(getApplicationContext());

        btnSaveSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = ayudadb.getWritableDatabase();
                ContentValues valores = new ContentValues();
                valores.put(AyudaBD.DatosTabla.COLUMN_ID,etid.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMN_NAME,etName.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMN_PHONE,etPhone.getText().toString());

                Long IdGuardado = db.insert(AyudaBD.DatosTabla.TABLE_NAME, AyudaBD.DatosTabla.COLUMN_ID, valores);
                Toast.makeText(getApplicationContext(), "Kept: "+IdGuardado, Toast.LENGTH_SHORT).show();
            }
        });

        btnUpdateSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = ayudadb.getWritableDatabase();
                ContentValues valores = new ContentValues();
                valores.put(AyudaBD.DatosTabla.COLUMN_NAME, etName.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMN_PHONE, etPhone.getText().toString());
                String[] argsel = {etid.getText().toString()};
                String selection = AyudaBD.DatosTabla.COLUMN_ID+"=?";

                int count = db.update(AyudaBD.DatosTabla.TABLE_NAME, valores,selection,argsel);
                Toast.makeText(getApplicationContext(), "Kept", Toast.LENGTH_SHORT).show();
            }
        });

        btnFindSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = ayudadb.getReadableDatabase();
                String[] argsel = {etid.getText().toString()};
                String[] projection = {AyudaBD.DatosTabla.COLUMN_NAME, AyudaBD.DatosTabla.COLUMN_PHONE};
                Cursor c = db.query(AyudaBD.DatosTabla.TABLE_NAME, projection, AyudaBD.DatosTabla.COLUMN_ID+"=?",argsel,null,null,null);

                c.moveToFirst();
                etName.setText(c.getString(0));
                etPhone.setText(c.getString(1));
            }
        });

        btnDeleteSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = ayudadb.getWritableDatabase();
                String selection = AyudaBD.DatosTabla.COLUMN_ID+"=?";
                String[] argsel = {etid.getText().toString()};

                db.delete(AyudaBD.DatosTabla.TABLE_NAME,selection,argsel);
            }
        });
    }
}
