package com.srijanmukhopadhyay.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void ClickFunction(View view) {
        EditText myTextField = (EditText)findViewById(R.id.myTextField);
        Double dollaramount = Double.parseDouble(myTextField.getText().toString());
        Double indianamount = dollaramount * 76.41;
        Toast.makeText(MainActivity.this, "Rs" + indianamount.toString(), Toast.LENGTH_LONG).show();
        Log.i("amount", myTextField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}