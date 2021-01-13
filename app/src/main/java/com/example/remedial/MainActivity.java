package com.example.remedial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button  button = null;
    TextView textView = null;
    EditText editText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        textView = (TextView) findViewById(R.id.textview2);
        editText = (EditText) findViewById(R.id.edittext);
        final String nama = editText.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                textView.setText("Haii" + nama +"\n Apakah sudah berbuat baik hari ini?");
            }

        });
    }
}
