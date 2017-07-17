package com.example.slam24.smartgeeks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Button btngretting;
    EditText textgretting;
    TextView tvtitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btngretting = (Button) findViewById(R.id.btngretting);
        btngretting.setOnClickListener(this);

        textgretting = (EditText) findViewById(R.id.textg);

        tvtitle = (TextView) findViewById(R.id.tvTitulo);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btngretting:
                if (textgretting.getText().toString().isEmpty()){
                    tvtitle.setText("empty");
                }else{
                    String dato = textgretting.getText().toString();
                    tvtitle.setText(dato);
                }
                break;
        }
    }
}
