package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lblRes;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnVirgula, btnSoma, btnIgual, btnMulti, btnSub, btnDiv, btnClear,btnRaiz, btnPot, btnCos, btnSen;
    String op= "";
    double v1, v2, res = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblRes = findViewById(R.id.lblRes);
        btn0 = findViewById(R.id.btn13);
        btn1 = findViewById(R.id.btn9);
        btn2 = findViewById(R.id.btn10);
        btn3 = findViewById(R.id.btn11);
        btn4 = findViewById(R.id.btn5);
        btn5 = findViewById(R.id.btn6);
        btn6 = findViewById(R.id.btn7);
        btn7 = findViewById(R.id.btn1);
        btn8 = findViewById(R.id.btn2);
        btn9 = findViewById(R.id.btn3);
        btnVirgula = findViewById(R.id.btn14);
        btnSoma = findViewById(R.id.btn15);
        btnIgual = findViewById(R.id.btn16);
        btnDiv = findViewById(R.id.btn4);
        btnSub = findViewById(R.id.btn12);
        btnMulti = findViewById(R.id.btn8);
        btnClear = findViewById(R.id.btn17);
        btnRaiz = findViewById(R.id.btnRaiz);
        btnPot = findViewById(R.id.btnPot);
        btnCos = findViewById(R.id.btnCos);
        btnSen = findViewById(R.id.btnSen);

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "cos";
                v1 = Double.parseDouble(lblRes.getText().toString());
                res = Math.cos(v1);
                lblRes.setText("");
            }
        });

        btnSen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "sen";
                v1 = Double.parseDouble(lblRes.getText().toString());
                res = Math.sin(v1);
                lblRes.setText("");
            }
        });

        btnPot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "pot";
                v1 = Double.parseDouble(lblRes.getText().toString());
                lblRes.setText("");
            }
        });

                btnRaiz.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        v1 = Double.parseDouble(lblRes.getText().toString());
                        res = Math.sqrt(v1);
                        op = "";
                        lblRes.setText(String.valueOf(res));
                    }
                });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblRes.setText("");
                op="";
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (op.equals("+")){
                    
                    v2 = Double.parseDouble(lblRes.getText().toString());
                    res = v1 + v2;
                    op="";
                    lblRes.setText(String.valueOf(res));
                }else if (op.equals("-")) {
                    v2 = Double.parseDouble(lblRes.getText().toString());
                    res = v1 - v2;
                    op="";
                    lblRes.setText(String.valueOf(res));
                }else if (op.equals("/")) {
                    v2 = Double.parseDouble(lblRes.getText().toString());
                    res = v1 / v2;
                    op="";
                    lblRes.setText(String.valueOf(res));
                }else if(op.equals("*")){
                    v2 = Double.parseDouble(lblRes.getText().toString());
                    res = v1 * v2;
                    op="";
                    lblRes.setText(String.valueOf(res));
                }else if (op.equals("pot")){
                    v2 = Double.parseDouble(lblRes.getText().toString());
                    res = Math.pow(v1,v2);
                    op="";
                    lblRes.setText(String.valueOf(res));
                }else if (op.equals("sen")) {
                    v1 = Double.parseDouble(lblRes.getText().toString());
                    res = Math.sin(v1);
                    op="";
                    lblRes.setText(String.valueOf(res));
                }else {
                    v1 = Double.parseDouble(lblRes.getText().toString());
                    res = Math.cos(v1);
                    op="";
                    lblRes.setText(String.valueOf(res));
                }
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = Double.parseDouble(lblRes.getText().toString());  // irá armazenar um texto do valor do visor. (convertendo o texto da lblRes.)
                // então ele vai converter primeiro o valor da label para texto e depois converter para double.
                op="+";
                lblRes.setText("");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = Double.parseDouble(lblRes.getText().toString());  // irá armazenar um texto do valor do visor. (convertendo o texto da lblRes.)
                // então ele vai converter primeiro o valor da label para texto e depois converter para double.
                op="-";
                lblRes.setText("");
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = Double.parseDouble(lblRes.getText().toString());  // irá armazenar um texto do valor do visor. (convertendo o texto da lblRes.)
                // então ele vai converter primeiro o valor da label para texto e depois converter para double.
                op="*";
                lblRes.setText("");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = Double.parseDouble(lblRes.getText().toString());  // irá armazenar um texto do valor do visor. (convertendo o texto da lblRes.)
                // então ele vai converter primeiro o valor da label para texto e depois converter para double.
                op="/";
                lblRes.setText("");
            }
        });

        btnVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d = lblRes.getText().toString()+ ",";
                lblRes.setText(d);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d = lblRes.getText().toString() +  "0";
                lblRes.setText(d);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d = lblRes.getText().toString() + "9" ;
                lblRes.setText(d);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d = lblRes.getText().toString() + "8" ;
                lblRes.setText(d);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d =  lblRes.getText().toString() + "7";
                lblRes.setText(d);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d =  lblRes.getText().toString() + "6";
                lblRes.setText(d);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d =  lblRes.getText().toString() + "5";
                lblRes.setText(d);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d =  lblRes.getText().toString()+ "4";
                lblRes.setText(d);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d =  lblRes.getText().toString()+ "3";
                lblRes.setText(d);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d = lblRes.getText().toString()+ "2";
                lblRes.setText(d);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblRes.getText().toString().equals("0")){
                    lblRes.setText("");
                }
                String d =  lblRes.getText().toString()+ "1";
                lblRes.setText(d);
            }
        });
    }


}