package com.example.celis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.celis.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        if(message.equals("2")) {
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, IncorrectMessageActivity.class);
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);        }
    }
}
