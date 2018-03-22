package com.example.uca.basketball_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button OneA;
    private TextView NumA;
    private int A;

    private Button OneB;
    private TextView NumB;
    private int B;

    private Button TwoA;
    private TextView NumC;
    private int C;

    private Button TwoB;
    private TextView NumD;
    private int D;

    private Button ThreeA;
    private TextView NumE;
    private int E;

    private Button ThreeB;
    private TextView NumF;
    private int F;

    private Button Reset;
    private TextView NumG;
    private TextView NumH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OneA = findViewById(R.id.oneA);

        OneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NumA=findViewById(R.id.NumberA);
                int A = Integer.parseInt(NumA.getText().toString());
                A= A+1;
                NumA.setText(A+"");

            }
        });

        OneB = findViewById(R.id.oneB);

        OneB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NumB=findViewById(R.id.NumberB);
                int B = Integer.parseInt(NumB.getText().toString());
                B= B+1;
                NumB.setText(B+"");

            }
        });

        TwoA = findViewById(R.id.TwoA);

        TwoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NumC=findViewById(R.id.NumberA);
                int C = Integer.parseInt(NumC.getText().toString());
                C= C+2;
                NumC.setText(C+"");

            }
        });

        TwoB = findViewById(R.id.TwoB);

        TwoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NumD=findViewById(R.id.NumberB);
                int D = Integer.parseInt(NumD.getText().toString());
                D= D+2;
                NumD.setText(D+"");

            }
        });

        ThreeA = findViewById(R.id.ThreeA);

        ThreeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NumE=findViewById(R.id.NumberA);
                int E = Integer.parseInt(NumE.getText().toString());
                E= E+3;
                NumE.setText(E+"");

            }
        });

        ThreeB = findViewById(R.id.ThreeB);

        ThreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NumF=findViewById(R.id.NumberB);
                int F = Integer.parseInt(NumF.getText().toString());
                F= F+3;
                NumF.setText(F+"");

            }
        });

        Reset = findViewById(R.id.Reset);

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NumG=findViewById(R.id.NumberA);

                NumG.setText("0");

                NumH=findViewById(R.id.NumberB);

                NumH.setText("0");

            }
        });
    }
}
