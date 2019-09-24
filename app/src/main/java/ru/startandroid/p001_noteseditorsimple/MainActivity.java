package ru.startandroid.p001_noteseditorsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout llMain;
    EditText etInput;
    Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMain = (LinearLayout) findViewById(R.id.llMain);
        etInput = (EditText) findViewById(R.id.etInput);

        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (etInput.getText().toString().equals("")) {
            Toast.makeText(this, "Введите текст заметки", Toast.LENGTH_SHORT).show();
        }
        else {
            TextView tvNew = new TextView(this);
            tvNew.setText(etInput.getText().toString());
            llMain.addView(tvNew);
            etInput.setText("");
        }
    }
}
