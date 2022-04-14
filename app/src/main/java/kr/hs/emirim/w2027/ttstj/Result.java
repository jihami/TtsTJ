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
        int[] arr = {Question1.zero,Question1.one, Question1.two, Question1.three, Question1.four, Question1.five, Question1.six};
        int max = arr[0];
        int maxIndex = 0;
        // 최대값, 최대값의 인덱스 구하기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        // 최대값, 최대값 인덱스 출력
        System.out.println("최대값은 " + max);
        System.out.println("최대값 인덱스는 " + maxIndex);

        System.out.println(Question1.zero+" "+Question1.one + " "+Question1.two + " "+Question1.three + " "+Question1.four + " "+Question1.five + " "+Question1.six);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getWindow().setWindowAnimations(0);

        ImageView mImageView = (ImageView) findViewById(R.id.result_img);
//        int imageId = (int) (Math.random() * images.length);
        mImageView.setBackgroundResource(images[maxIndex]);

        TextView ResultType = (TextView)findViewById(R.id.result_type);
        TextView ResultText = (TextView)findViewById(R.id.result_text);

        if(maxIndex == 0){
            ResultType.setText(R.string.type_0);
            ResultText.setText(R.string.result_0);
        }else if(maxIndex == 1){
            ResultType.setText(R.string.type_1);
            ResultText.setText(R.string.result_1);
        }else if(maxIndex == 2){
            ResultType.setText(R.string.type_2);
            ResultText.setText(R.string.result_2);
        }else if(maxIndex == 3){
            ResultType.setText(R.string.type_3);
            ResultText.setText(R.string.result_3);
        }else if(maxIndex == 4){
            ResultType.setText(R.string.type_4);
            ResultText.setText(R.string.result_4);
        }else if(maxIndex == 5){
            ResultType.setText(R.string.type_5);
            ResultText.setText(R.string.result_5);
        }else if(maxIndex == 6){
            ResultType.setText(R.string.type_6);
            ResultText.setText(R.string.result_6);
        }
        Button btnR = findViewById(R.id.btn_Result);
        btnR.setOnClickListenerpk(btnListener);

    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), Review.class);
            startActivity(intent);
        }
    };
}
