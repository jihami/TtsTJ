package kr.hs.emirim.w2027.ttstj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question6 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        getWindow().setWindowAnimations(0);

        Button btnQ1A1 = findViewById(R.id.btn_q6_answer1);
        Button btnQ1A2 = findViewById(R.id.btn_q6_answer2);
        Button btnQ1A3 = findViewById(R.id.btn_q6_answer3);
        Button btnQ1A4 = findViewById(R.id.btn_q6_answer4);

        btnQ1A1.setOnClickListener(btnListener);
        btnQ1A2.setOnClickListener(btnListener);
        btnQ1A3.setOnClickListener(btnListener);
        btnQ1A4.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), Question7.class);
            startActivity(intent);
        }
    };
}