package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {
    ListView tobe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        tobe = (ListView) findViewById(R.id.lv02);

        ArrayList list = new ArrayList();
        list.add("I");
        list.add("You");
        list.add("He");
        list.add("She");
        list.add("They");
        list.add("It");
        list.add("We");

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        tobe.setAdapter(adapter);
    }
}
