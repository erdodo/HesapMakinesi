package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sayi1;
    EditText sayi2;
    TextView result;
    double sayi01;
    double sayi02;

    Button btnSum;
    Button btnDeduct;
    Button btnMultiply;
    Button btnDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimlamalar();
    }

    public void tanimlamalar() {
        sayi1=findViewById(R.id.eTsayi1);
        sayi2=findViewById(R.id.eTsayi2);
        result=findViewById(R.id.tVresult);

        btnSum=findViewById(R.id.btnSum);
        btnDeduct=findViewById(R.id.btnDeduct);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
    }

    public void sayiDonusum(){
        sayi01=Double.valueOf(sayi1.getText().toString());
        sayi02=Double.valueOf(sayi2.getText().toString());
    }

    public void sum(View view){
        sayiDonusum();
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sum=String.valueOf(sayi01+sayi02);
                result.setText(sum);
            }
        });
    }
    public void deduct(View view){
        sayiDonusum();
        btnDeduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String deduct=String.valueOf(sayi01-sayi02);
                result.setText(deduct);
            }
        });

    }
    public void multiply(View view){
        sayiDonusum();
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String multiply=String.valueOf(sayi01*sayi02);
                result.setText(multiply);
            }
        });
    }
    public void divide(View view){
        sayiDonusum();
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String divide=String.valueOf(sayi01/sayi02);
                result.setText(divide);
            }
        });
    }
}
