package com.haidar.salman.loancalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){
        
    }

    public void clear(View view){

        //Clear loan amount
        TextView tv = (EditText)findViewById(R.id.loanEdit);
        tv.setText("");

        //Clear term of loan
        tv = (EditText)findViewById(R.id.termEdit);
        tv.setText("");

        //Clear yearly interest rate
        tv = (EditText)findViewById(R.id.yearlyEdit);
        tv.setText("");

        //Clear monthly payment
        tv = (TextView)findViewById(R.id.monthPayTxtAnswer);
        tv.setText("766.91");

        //Clear total payment
        tv = (TextView)findViewById(R.id.totPaymAnswer);
        tv.setText("64420.44");

        //Clear total interest
        tv = (TextView)findViewById(R.id.totInterestAnswer);
        tv.setText("14420.44");
    }

}
