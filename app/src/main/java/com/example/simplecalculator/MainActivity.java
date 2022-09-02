package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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


    public void calculate(View v){

            String tag = v.getTag().toString();
            lblAns.setText(tag);


            String value1 = lblVal1.getText().toString();
            String value2 = lblVal2.getText().toString();

            double val1 = Double.parseDouble(value1);
            double val2 = Double.parseDouble(value2);

            double ans = 0;
            switch(tag){
                case "add" : ans = val1 + val2; break;
                case "sub" : ans = val1 - val2; break;
                case "mul" : ans = val1 * val2; break;
                case "div" : ans = val1 / val2; break;

            }

//            if (tag.equals("add")){
//                ans = val1 + val2;
//            }
//
//            if (tag.equals("sub")){
//                ans = val1 - val2;
//            }
//
//            if (tag.equals("mul")){
//                ans = val1 * val2;
//            }
//
//            if (tag.equals("div")){
//                ans = val1 / val2;
//            }

            lblAns.setText("Answer is " + ans);

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
