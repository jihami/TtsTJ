package kr.hs.emirim.w2027.ttstj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        getWindow().setWindowAnimations(0);

        Button btnQ1A1 = findViewById(R.id.btn_q4_answer1);
        Button btnQ1A2 = findViewById(R.id.btn_q4_answer2);
        Button btnQ1A3 = findViewById(R.id.btn_q4_answer3);
        Button btnQ1A4 = findViewById(R.id.btn_q4_answer4);

        btnQ1A1.setOnClickListener(btnListener1);
        btnQ1A2.setOnClickListener(btnListener2);
        btnQ1A3.setOnClickListener(btnListener3);
        btnQ1A4.setOnClickListener(btnListener4);
    }
    View.OnClickListener btnListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Question1.zero += 1;
            Question1.two += 1;
            Question1.five += 1;
            Intent intent = new Intent(getApplicationContext(), Question5.class);
            startActivity(intent);
        }
    };
    View.OnClickListener btnListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Question1.three += 1;
            Intent intent = new Intent(getApplicationContext(), Question5.class);
            startActivity(intent);
        }
    };
    View.OnClickListener btnListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Question1.four += 1;
            Question1.six += 1;
            Intent intent = new Intent(getApplicationContext(), Question5.class);
            startActivity(intent);
        }
    };
    View.OnClickListener btnListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Question1.one += 1;
            Intent intent = new Intent(getApplicationContext(), Question5.class);
            startActivity(intent);
            System.out.println(Question1.zero+" "+Question1.one + " "+Question1.two + " "+Question1.three + " "+Question1.four + " "+Question1.five + " "+Question1.six);
        }
    };
}
