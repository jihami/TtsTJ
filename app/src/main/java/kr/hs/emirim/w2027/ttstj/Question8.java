package kr.hs.emirim.w2027.ttstj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question8 extends AppCompatActivity {
    static int q8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        getWindow().setWindowAnimations(0);

        Button btnQ1A1 = findViewById(R.id.btn_q8_answer1);
        Button btnQ1A2 = findViewById(R.id.btn_q8_answer2);
        Button btnQ1A3 = findViewById(R.id.btn_q8_answer3);
        Button btnQ1A4 = findViewById(R.id.btn_q8_answer4);

        btnQ1A1.setOnClickListener(btnListener1);
        btnQ1A2.setOnClickListener(btnListener2);
        btnQ1A3.setOnClickListener(btnListener3);
        btnQ1A4.setOnClickListener(btnListener4);
    }
    View.OnClickListener btnListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            q8 = 1;
            Intent intent = new Intent(getApplicationContext(), Question9.class);
            startActivity(intent);
        }
    };
    View.OnClickListener btnListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            q8 = 2;
            Intent intent = new Intent(getApplicationContext(), Question9.class);
            startActivity(intent);
        }
    };
    View.OnClickListener btnListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            q8 = 3;
            Intent intent = new Intent(getApplicationContext(), Question9.class);
            startActivity(intent);
        }
    };
    View.OnClickListener btnListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            q8 = 4;
            Intent intent = new Intent(getApplicationContext(), Question9.class);
            startActivity(intent);
        }
    };

}
