package com.example.a20currency_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn);
        editText=findViewById(R.id.ed1);
        textView=findViewById(R.id.tv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().isEmpty()){
                    editText.setHint("Enter the number of USD");
                }
                else
                {
                    String s = editText.getText().toString();
                    double i= Double.parseDouble(s);
                    double rupees = i * 76;
                    textView.setText(Integer.toString((int) rupees) + "Rupees");
                }
            }
        });
    }
}