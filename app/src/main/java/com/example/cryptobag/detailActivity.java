package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);
        Button btn = findViewById(R.id.vidBtn);
        btn.setText("Show Video");
        textView.setText("PLSWORK");
    }

    public void showVideo(View view){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=XqZsoesa55w");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        view.getContext().startActivity(intent);
    }
}