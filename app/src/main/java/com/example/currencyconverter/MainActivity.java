package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

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

    public String getValue(){
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName2);
        return editText.getText().toString();
    }

    public void display(int n){
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(""+n+" Rs");
    }
    public void fromDollar(View view){
        String s = getValue();
        display(Integer.parseInt(s)*73);
    }

    public void fromEuro(View view){
        String s = getValue();
        display(Integer.parseInt(s)*86);
    }

    public void fromYen(View view){
        String s = getValue();
        display(Integer.parseInt(s)*11);
    }

    public void fromDhiram(View view){
        String s = getValue();
        display(Integer.parseInt(s)*20);
    }

    public void fromCanadian(View view){
        String s = getValue();
        display(Integer.parseInt(s)*58);
    }
}