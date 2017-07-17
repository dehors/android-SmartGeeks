package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity{
    Button btnselection;
    TextView tvselected;
    RadioButton rb1,rb2;
    CheckBox cb1, cb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnselection = (Button) findViewById(R.id.btnselect);
        tvselected = (TextView) findViewById(R.id.tv1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);

        btnselection.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (rb1.isChecked()){
                    tvselected.setText(rb1.getText());
                }else if(rb1.isChecked()){
                    tvselected.setText(rb2.getText());
                }else if(cb1.isChecked()){
                    tvselected.setText(cb1.getText());
                }else{
                    tvselected.setText(cb2.getText());
                }
            }
        });
    }
}
