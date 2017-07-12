package com.example.tamir.myappafterreinstalling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import android.widget.TextView;
import android.widget.Toast;

import com.example.tamir.myappafterreinstalling.CalculatorLogic;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button0 = (Button) findViewById(R.id.button0);

        final Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        final Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        final Button buttonMult = (Button) findViewById(R.id.buttonMult);
        final Button buttonDev = (Button) findViewById(R.id.buttonDevide);
        final Button buttonTotal = (Button) findViewById(R.id.buttonTotal);
        final Button buttonClear = (Button) findViewById(R.id.buttonClear);

        final TextView myScreen = (TextView) findViewById(R.id.screen);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.scanDigit(0);
                myScreen.setText(myScreen.getText() + (String) button0.getText());
                Toast.makeText(MainActivity.this, "0", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.scanDigit(1);
                myScreen.setText(myScreen.getText() + (String) button1.getText());
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.scanDigit(2);
                myScreen.setText(myScreen.getText() + (String) button2.getText());
                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.scanDigit(3);
                myScreen.setText(myScreen.getText() + (String) button3.getText());
                Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.scanDigit(4);
                myScreen.setText(myScreen.getText() + (String) button4.getText());
                Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.scanDigit(5);
                myScreen.setText(myScreen.getText() + (String) button5.getText());
                Toast.makeText(MainActivity.this, "5", Toast.LENGTH_SHORT).show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.scanDigit(6);
                myScreen.setText(myScreen.getText() + (String) button6.getText());
                Toast.makeText(MainActivity.this, "6", Toast.LENGTH_SHORT).show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.scanDigit(7);
                myScreen.setText(myScreen.getText() + (String) button7.getText());
                Toast.makeText(MainActivity.this, "7", Toast.LENGTH_SHORT).show();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.scanDigit(8);
                myScreen.setText(myScreen.getText() + (String) button8.getText());
                Toast.makeText(MainActivity.this, "8", Toast.LENGTH_SHORT).show();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.scanDigit(9);
                myScreen.setText(myScreen.getText() + (String) button9.getText());
                Toast.makeText(MainActivity.this, "9", Toast.LENGTH_SHORT).show();
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.sendOperator('+');
                myScreen.setText(myScreen.getText() + (String) buttonPlus.getText());
                Toast.makeText(MainActivity.this, "+", Toast.LENGTH_SHORT).show();
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.sendOperator('-');
                myScreen.setText(myScreen.getText() + (String) buttonMinus.getText());
                Toast.makeText(MainActivity.this, "-", Toast.LENGTH_SHORT).show();
            }
        });
        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.sendOperator('X');
                myScreen.setText(myScreen.getText() + (String) buttonMult.getText());
                Toast.makeText(MainActivity.this, "X", Toast.LENGTH_SHORT).show();
            }
        });
        buttonDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.sendOperator('/');
                myScreen.setText(myScreen.getText() + (String) buttonDev.getText());
                Toast.makeText(MainActivity.this, "/", Toast.LENGTH_SHORT).show();
            }
        });
        buttonTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myScreen.setText("" + CalculatorLogic.calculateTotal());
                Toast.makeText(MainActivity.this, "=", Toast.LENGTH_SHORT).show();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculatorLogic.cleanMemory();
                myScreen.setText("");
                Toast.makeText(MainActivity.this, "clear", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
