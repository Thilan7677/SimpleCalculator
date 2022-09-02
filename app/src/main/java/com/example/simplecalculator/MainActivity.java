package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int val1, val2;

    EditText lblVal1;
    EditText lblVal2;
    TextView lblAns;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblVal1 = findViewById(R.id.lblVal1);
        lblVal2 = findViewById(R.id.lblVal2);
        lblAns = findViewById(R.id.lblAns);
    }

    public void calculate(View V) {
        val1 = Integer.parseInt(lblVal1.getText().toString());
        val2 = Integer.parseInt(lblVal2.getText().toString());
        int add = val1 + val2;
        int sub = val1 - val2;
        int mul = val1 * val2;
        int div = val1 / val2;
        String clear = (" ");

        lblAns.setText("Answer is " + add);
        lblAns.setText("Answer is " + sub);
        lblAns.setText("Answer is " + mul);
        lblAns.setText("Answer is " + div);
        lblAns.setText("Answer is " + clear);

    }
}
//    public void btnAdd(View V) {
//        EditText lblVal1 = findViewById(R.id.lblVal1);
//        EditText lblVal2 = findViewById(R.id.lblVal2);
//        TextView lblAns = findViewById(R.id.lblAns);
//
//        val1 = Integer.parseInt(lblVal1.getText().toString());
//        val2 = Integer.parseInt(lblVal2.getText().toString());
//        int add = val1 + val2;
//        lblAns.setText("Answer is " + add);
//    }
//
//    public void btnSub(View V) {
//        EditText lblVal1 = findViewById(R.id.lblVal1);
//        EditText lblVal2 = findViewById(R.id.lblVal2);
//        TextView lblAns = findViewById(R.id.lblAns);
//
//        val1 = Integer.parseInt(lblVal1.getText().toString());
//        val2 = Integer.parseInt(lblVal2.getText().toString());
//        int sub = val1 - val2;
//        lblAns.setText("Answer is " + sub);
//    }
//
//    public void btnMul(View V) {
//        EditText lblVal1 = findViewById(R.id.lblVal1);
//        EditText lblVal2 = findViewById(R.id.lblVal2);
//        TextView lblAns = findViewById(R.id.lblAns);
//
//        val1 = Integer.parseInt(lblVal1.getText().toString());
//        val2 = Integer.parseInt(lblVal2.getText().toString());
//        int mul = val1 * val2;
//        lblAns.setText("Answer is " + mul);
//    }
//
//    public void btnDiv(View V) {
//        //EditText lblVal1 = findViewById(R.id.lblVal1);
//        //EditText lblVal2 = findViewById(R.id.lblVal2);
//        //TextView lblAns = findViewById(R.id.lblAns);
//
//        val1 = Integer.parseInt(lblVal1.getText().toString());
//        val2 = Integer.parseInt(lblVal2.getText().toString());
//        int div = val1 / val2;
//        lblAns.setText("Answer is " + div);
//    }
//
//    public void btnClear(View V) {
//        EditText lblVal1 = findViewById(R.id.lblVal1);
//        EditText lblVal2 = findViewById(R.id.lblVal2);
//        TextView lblAns = findViewById(R.id.lblAns);
//
//        val1 = Integer.parseInt(lblVal1.getText().toString());
//        val2 = Integer.parseInt(lblVal2.getText().toString());
//
//        lblVal1.setText(" ");
//        lblVal2.setText(" ");
//        lblAns.setText(" ");
//    }
