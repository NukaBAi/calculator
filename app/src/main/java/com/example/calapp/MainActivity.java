package com.example.calapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button7, button8, button9, button6, button5, button4, button3, button2, button1, button0;
    Button buttonOshiru;
    Button buttonbolu, buttonminus, buttonX, buttonPLUS, buttonTen, buttonPro;
    TextView tvsan, tvzapis;

    String birinshiSan, ekinshiSan, znak, zapisText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button6 = findViewById(R.id.btn6);
        button5 = findViewById(R.id.btn5);
        button4 = findViewById(R.id.btn4);
        button3 = findViewById(R.id.btn3);
        button2 = findViewById(R.id.btn2);
        button1 = findViewById(R.id.btn1);
        button0 = findViewById(R.id.btn0);

        buttonOshiru = findViewById(R.id.btnOshiru);

        buttonPLUS = findViewById(R.id.btnPLUS);
        buttonPro = findViewById(R.id.btnPro);
        buttonX = findViewById(R.id.btnX);
        buttonbolu = findViewById(R.id.btnbolu);
        buttonminus = findViewById(R.id.btnminus);
        buttonTen = findViewById(R.id.btnTen);




        tvsan = findViewById(R.id.tv_san);
        tvzapis = findViewById(R.id.tv_zapis);

        View.OnClickListener buttonSandar = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aldingiSan = tvsan.getText().toString();
                String basilganSan = "";
                String songiResult = "";
                switch (view.getId()){
                    case R.id.btn7:
                        basilganSan = "7";
                        break;

                    case R.id.btn8:
                        basilganSan = "8";
                        break;
                    case R.id.btn9:
                        basilganSan = "9";
                        break;
                    case R.id.btn6:
                        basilganSan = "6";
                        break;
                    case R.id.btn5:
                        basilganSan = "5";
                        break;
                    case R.id.btn4:
                        basilganSan = "4";
                        break;
                    case R.id.btn3:
                        basilganSan = "3";
                        break;
                    case R.id.btn2:
                        basilganSan = "2";
                        break;
                    case R.id.btn1:
                        basilganSan = "1";
                        break;
                    case R.id.btn0:
                        basilganSan = "0";
                        break;
                }
                if(!aldingiSan.equals("0")) songiResult = aldingiSan + basilganSan;
                else songiResult = basilganSan;
                tvsan.setText(songiResult);
            }
        };

        button7.setOnClickListener(buttonSandar);
        button8.setOnClickListener(buttonSandar);
        button9.setOnClickListener(buttonSandar);
        button6.setOnClickListener(buttonSandar);
        button5.setOnClickListener(buttonSandar);
        button4.setOnClickListener(buttonSandar);
        button3.setOnClickListener(buttonSandar);
        button2.setOnClickListener(buttonSandar);
        button1.setOnClickListener(buttonSandar);
        button0.setOnClickListener(buttonSandar);

//        View.OnClickListener buttonOwiru = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch (view.getId()) {
//                    case R.id.btnOshiru:
//
//                        tvsan.setText("0");
//                        break;
//                }
//
//            }
//        };
//
//        buttonOshiru.setOnClickListener(buttonOwiru);
//

        View.OnClickListener button_C_Dell = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                switch (view.getId()){
//                    case R.id.btnOshiru:
//                        tvsan.setText("0");
//                        tvzapis.setText("0");

//                        break;
                    case R.id.btnOshiru:
                        String sanText = tvsan.getText().toString();
                        int sanInt = Integer.parseInt(sanText);
                        int sanIntC = sanInt / 10;
//                        int sanIntSony = sanInt-sanIntC;
                        tvsan.setText(""+sanIntC);
                        break;
                }
            }
        };
        buttonOshiru.setOnClickListener(button_C_Dell);


        View.OnClickListener btnFunctions = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birinshiSan = tvsan.getText().toString();
                switch (view.getId()){
                    case R.id.btnPLUS:
                        znak = "+";
                        break;

                    case R.id.btnminus:
                        znak = "-";
                        break;

                    case R.id.btnX:
                        znak = "*";
                        break;

                    case R.id.btnbolu:
                        znak = "/";
                        break;
                    case R.id.btnPro:
                        znak = "%";
                        break;

                }
                zapisText =  birinshiSan + znak;
                tvzapis.setText(zapisText);
                tvsan.setText("0");
            }
        };


        buttonPLUS.setOnClickListener(btnFunctions);
        buttonminus.setOnClickListener(btnFunctions);
        buttonX.setOnClickListener(btnFunctions);
        buttonbolu.setOnClickListener(btnFunctions);
        buttonPro.setOnClickListener(btnFunctions);


        buttonTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ekinshiSan = tvsan.getText().toString();

                int san1 = Integer.parseInt(birinshiSan);
                int san2 = Integer.parseInt(ekinshiSan);
                int res = 0;
                if(znak.equals("+")){
                    res = san1 + san2 ;

                }else if(znak.equals("-")){
                    res = san1 - san2 ;
                }else if(znak.equals("*")){
                    res = san1 * san2 ;

                }else if(znak.equals("/")){
                    res = san1 / san2 ;

                }else if(znak.equals("%")){
                    res = san1 % san2 ;


                }
                zapisText =  birinshiSan + znak + ekinshiSan + " = " + res;
                tvzapis.setText(zapisText);
                tvsan.setText(""+res);
            }
        });
    }}



