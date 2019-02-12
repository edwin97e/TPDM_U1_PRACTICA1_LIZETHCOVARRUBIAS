package com.example.tpdm_u1_practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    EditText n1,n2;
    Button btnSum,btnRes,btnMul;
    TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 =(EditText)findViewById(R.id.txt2);
        n2 =(EditText)findViewById(R.id.txt3);
        btnSum=(Button)findViewById(R.id.btn3);
        btnMul=(Button)findViewById(R.id.btn1);
        btnRes=(Button)findViewById(R.id.btn2);
        r=(TextView)findViewById(R.id.lbl1);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1=Integer.parseInt(n1.getText().toString());
                int valor2=Integer.parseInt(n2.getText().toString());
                int s = valor1+valor2;
                r.setText(s+"");
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1=Integer.parseInt(n1.getText().toString());
                int valor2=Integer.parseInt(n2.getText().toString());
                int s = valor1-valor2;
                r.setText(s+"");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1=Integer.parseInt(n1.getText().toString());
                int valor2=Integer.parseInt(n2.getText().toString());
                int s = valor1*valor2;
                r.setText(s+"");
            }
        });

    }



}
