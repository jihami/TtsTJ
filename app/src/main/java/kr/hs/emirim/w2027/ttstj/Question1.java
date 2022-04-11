package kr.hs.emirim.w2027.ttstj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question1 extends AppCompatActivity {
    static int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        getWindow().setWindowAnimations(0);

        Button btnQ1A1 = findViewById(R.id.btn_q1_answer1);
        Button btnQ1A2 = findViewById(R.id.btn_q1_answer2);
        Button btnQ1A3 = findViewById(R.id.btn_q1_answer3);
        Button btnQ1A4 = findViewById(R.id.btn_q1_answer4);

        btnQ1A1.setOnClickListener(btnListener1);
        btnQ1A2.setOnClickListener(btnListener2);
        btnQ1A3.setOnClickListener(btnListener3);
        btnQ1A4.setOnClickListener(btnListener4);
    }
    View.OnClickListener btnListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            one += 1;
            Intent intent = new Intent(getApplicationContext(), Question2.class);
            startActivity(intent);
        }
    };
    View.OnClickListener btnListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            two += 1;
            five += 1;
            six += 1;
            Intent intent = new Intent(getApplicationContext(), Question2.class);
            startActivity(intent);
        }
    };
    View.OnClickListener btnListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            zero += 1;
            four +=1;
            Intent intent = new Intent(getApplicationContext(), Question2.class);
            startActivity(intent);
        }
    };
    View.OnClickListener btnListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            three += 1;
            Intent intent = new Intent(getApplicationContext(), Question2.class);
            startActivity(intent);
            System.out.println(zero + " " + one + " "+two + " "+three + " "+four + " "+five + " "+six);
        }
    };
}
