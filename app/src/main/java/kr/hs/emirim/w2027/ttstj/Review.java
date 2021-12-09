package kr.hs.emirim.w2027.ttstj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Review extends AppCompatActivity implements View.OnClickListener {

    Button btnSave;
    Button btnSelect;
    EditText edtName;
    EditText edtP;
    EditText edtR;
    TextView viewResult;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        btnSave = findViewById(R.id.btnSave);
        btnSelect = (Button) findViewById(R.id.btnSelect);
        edtName = (EditText) findViewById(R.id.edtName);
        edtP = (EditText) findViewById(R.id.edtP);
        edtR = (EditText) findViewById(R.id.edtR);
        viewResult = (TextView) findViewById(R.id.txtResult);

        Button home = findViewById(R.id.btnHome);
        home.setOnClickListener(btnListener);

        btnSave.setOnClickListener(this);
        btnSelect.setOnClickListener(this);
        dbHelper = new DBHelper(Review.this, 1);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSave:
                dbHelper.insert(edtName.getText().toString(),Integer.parseInt(edtP.getText().toString()), edtR.getText().toString());
                btnSave.setEnabled(false);
                Toast.makeText(getApplicationContext(), "데이터 삽입 완료.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSelect:
                viewResult.setText(dbHelper.getResult());
                break;
        }
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}