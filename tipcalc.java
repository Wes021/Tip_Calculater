package com.example.tipcalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tipcalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipcalc);
    }

    public void calc(View view){
        EditText bill = findViewById(R.id.total);
        EditText tip_per = findViewById(R.id.tip);
        TextView in= findViewById(R.id.info);
        double Bill=Double.parseDouble( bill.getText().toString());
        double Tip_per=Double.parseDouble( tip_per.getText().toString());
        double Tip = Bill*Tip_per/100;
        double total = Tip+Bill;
        String tip2 =Double.toString(Tip).substring(0,4);
        String total2 =Double.toString(total).substring(0,4);
        String text="Tip: "+tip2+"$"+" Total: "+total2+"$";
        in.setText(text);


    }

}