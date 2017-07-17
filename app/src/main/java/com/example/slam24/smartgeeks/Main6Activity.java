package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main6Activity extends AppCompatActivity {
    ListView monthsofyear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        monthsofyear = (ListView) findViewById(R.id.lv01);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.listado, android.R.layout.simple_list_item_1);
        monthsofyear.setAdapter(adapter);
    }
}
