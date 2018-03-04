package com.example.dangb.phuongtrinhbacnhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txt1,txt2;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.editText);
        txt2 = findViewById(R.id.editText2);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result();
            }
        });
    }
    public void result()
    {
        double num1 = Double.parseDouble(txt1.getText().toString());
        double num2 = Double.parseDouble(txt2.getText().toString());
        double num3 = -num2/num1;
        String result = String.valueOf(num3);
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("result",result);
        this.startActivity(intent);
    }
}
