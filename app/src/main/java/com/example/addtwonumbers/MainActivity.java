package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {
    Button Btn;
    TextView tvTotal;
    EditText eFirst ,eSec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        eFirst = findViewById(R.id.eFirst);
        eSec = findViewById(R.id.eSec);


        Btn = findViewById(R.id.Btn);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = eFirst.getText().toString();
                double f = Double.parseDouble(first);
                String Sec = eSec.getText().toString();
                double s = Double.parseDouble(Sec);

                double T = f + s ;
                tvTotal = findViewById(R.id.tvTotal);

                tvTotal.setText(String.valueOf(T));
                Toast.makeText(MainActivity.this, String.valueOf(T), Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
//                startActivity(intent);
            }
        });


    }
}