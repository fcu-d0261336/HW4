package com.example.niu.hw4;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(rec_notification);
        editText = (EditText)findViewById(R.id.editText);
    }

    private View.OnClickListener rec_notification = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setAction("my.NOTIFICATION");
            String msg = editText.getEditableText().toString();
            intent.putExtra("KEY_MSG", msg);
            sendBroadcast(intent);
        }
    };
}
