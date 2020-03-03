package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity {

    public TextView value;
    public TextView change1hr;
    public TextView change24hr;
    public TextView change7d;
    public TextView marketcap;
    public TextView volume24h;
    public TextView btc;
    public String coins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    Coin coin = Coin.searchCoin("BTC");





        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
      //this step is initialising + the above thing in one thing
     //   TextView textView = findViewById(R.id.textView2);
      //initialises it
        value = findViewById(R.id.valueamt);
        change1hr = findViewById(R.id.change1hramt);
        change24hr = findViewById(R.id.change24hramt);
        change7d = findViewById(R.id.change7damt);
        marketcap = findViewById(R.id.marketcapAmt);
        volume24h = findViewById(R.id.volume24hramt);
        btc = findViewById(R.id.btc);

        value.setText(Double.toString(coin.getValue()));
        change1hr.setText(Double.toString(coin.getChange1h()));
        change24hr.setText(Double.toString(coin.getChange24h()));
        change7d.setText(Double.toString(coin.getChange7d()));
        marketcap.setText(Double.toString(coin.getMarketcap()));
        volume24h.setText(Double.toString(coin.getVolume()));
        btc.setText(coin.getName());
        coins = coin.getName();
        //    textView.setText(message);
        Button btn = findViewById(R.id.vidBtn); //the search button goes to google
      // ImageButton searchBtn = findViewById(R.id.searchbutton);

       // btn.setText("Show Video");
      //  textView.setText("test");


    }

    public void showVideo(View view){
        Uri uri = Uri.parse("https://www.google.com.au/search?q="+coins);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        view.getContext().startActivity(intent);
    }


//run method in detail activity. e.g. intent is just btc

}