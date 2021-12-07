package kr.hs.emirim.w2027.ttstj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class Review extends AppCompatActivity {
    MyDBHelper dbHelper;
    EditText editName, editStar, editReview;
    RatingBar ratingBar;
    String strS; //별점
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        ratingBar = findViewById(R.id.starPoint);
        editName = findViewById(R.id.nickName);
        editReview = findViewById(R.id.review);
        Button btnInput = findViewById(R.id.saveButton);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//                Toast.makeText(getApplicationContext(),"New Rating: "+ rating, Toast.LENGTH_SHORT).show();
                strS = String.valueOf(rating);
                strS = Float.toString(rating);
                Toast.makeText(getApplicationContext(),"New Rating: "+ strS, Toast.LENGTH_SHORT).show();
            }
        });
        dbHelper = new MyDBHelper(this);
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db = dbHelper.getWritableDatabase();
                db.execSQL("insert into reviewDB values('"+editName.getText().toString()+"', "+editReview.getText().toString()+","+strS+");");
//                selectDB();
                db.close();
                Toast.makeText(getApplicationContext(), "정상적으로 행이 삽입 되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //    내부클래스
    public class MyDBHelper extends SQLiteOpenHelper {


        public MyDBHelper(Context context){
            super(context, "reviewDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table reviewDB (nickName char(50) primary key, review char(50) ,count char(50));");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            db.execSQL("drop table if exists reviewDB");
            onCreate(db);
        }
    }
}