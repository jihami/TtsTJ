package kr.hs.emirim.w2027.ttstj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question10 extends AppCompatActivity {
    static int q10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
        getWindow().setWindowAnimations(0);

        Button btnQ1A1 = findViewById(R.id.btn_q10_answer1);
        Button btnQ1A2 = findViewById(R.id.btn_q10_answer2);
        Button btnQ1A3 = findViewById(R.id.btn_q10_answer3);
        Button btnQ1A4 = findViewById(R.id.btn_q10_answer4);

        btnQ1A1.setOnClickListener(btnListener1);
        btnQ1A2.setOnClickListener(btnListener2);
        btnQ1A3.setOnClickListener(btnListener3);
        btnQ1A4.setOnClickListener(btnListener4);
    }
    View.OnClickListener btnListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            q10 = 1;
            Intent intent = new Intent(getApplicationContext(), Result.class);
            startActivity(intent);
        }
    };
    View.OnClickListener btnListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            q10 = 2;
            Intent intent = new Intent(getApplicationContext(), Result.class);
            startActivity(intent);
        }
    };View.OnClickListener btnListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            q10 = 3;
            Intent intent = new Intent(getApplicationContext(), Result.class);
            startActivity(intent);
        }
    };View.OnClickListener btnListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            q10 = 4;
            Intent intent = new Intent(getApplicationContext(), Result.class);
            startActivity(intent);
        }
    };

}
