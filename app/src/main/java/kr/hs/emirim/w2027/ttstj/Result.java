package kr.hs.emirim.w2027.ttstj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {
    int[] images = new int[] {R.drawable.result_0, R.drawable.result_1, R.drawable.result_2, R.drawable.result_3, R.drawable.result_4, R.drawable.result_5, R.drawable.result_6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int[] rs = {Question1.q1, Question2.q2, Question3.q3, Question4.q4, Question5.q5, Question6.q6, Question7.q7, Question8.q8, Question9.q9, Question10.q10};
        int max =  0;
        int mun = 0;
        for(int i=0; i<10; i++){
            int cnt = 0;
            for(int j=0; j<rs.length; j++){
                if(rs[j]==i){
                    cnt++;
                }
            } //j
            if(max<cnt){
                max = cnt;
                mun = i;
            }
        }
        System.out.println(mun+"횟수"+max);
//        System.out.println(Question1.q1);
//        System.out.println(Question2.q2);
//        System.out.println(Question3.q3);
//        System.out.println(Question4.q4);
//        System.out.println(Question5.q5);
//        System.out.println(Question6.q6);
//        System.out.println(Question7.q7);
//        System.out.println(Question8.q8);
//        System.out.println(Question9.q9);
//        System.out.println(Question10.q10);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getWindow().setWindowAnimations(0);

        ImageView mImageView = (ImageView) findViewById(R.id.result_img);
        int imageId = (int) (Math.random() * images.length);
        mImageView.setBackgroundResource(images[imageId]);

        TextView ResultType = (TextView)findViewById(R.id.result_type);
        TextView ResultText = (TextView)findViewById(R.id.result_text);

        if(images[imageId] == R.drawable.result_0){
            ResultType.setText(R.string.type_0);
            ResultText.setText(R.string.result_0);
        }else if(images[imageId] == R.drawable.result_1){
            ResultType.setText(R.string.type_1);
            ResultText.setText(R.string.result_1);
        }else if(images[imageId] == R.drawable.result_2){
            ResultType.setText(R.string.type_2);
            ResultText.setText(R.string.result_2);
        }else if(images[imageId] == R.drawable.result_3){
            ResultType.setText(R.string.type_3);
            ResultText.setText(R.string.result_3);
        }else if(images[imageId] == R.drawable.result_4){
            ResultType.setText(R.string.type_4);
            ResultText.setText(R.string.result_4);
        }else if(images[imageId] == R.drawable.result_5){
            ResultType.setText(R.string.type_5);
            ResultText.setText(R.string.result_5);
        }else if(images[imageId] == R.drawable.result_6){
            ResultType.setText(R.string.type_6);
            ResultText.setText(R.string.result_6);
        }
        Button btnR = findViewById(R.id.btn_Result);
        btnR.setOnClickListener(btnListener);

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), Review.class);
            startActivity(intent);
        }
    };
}
