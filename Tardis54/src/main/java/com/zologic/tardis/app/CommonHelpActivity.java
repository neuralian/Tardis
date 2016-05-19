package com.zologic.tardis.app;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.zologic.tardis.R;


public class CommonHelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commonhelp);

        // Title
        String title = getIntent().getExtras().getString("title");
        getSupportActionBar().setTitle(title);

        // Text
        String asset = getIntent().getExtras().getString("help");
        WebView infoWebView = (WebView) findViewById(R.id.infoWebView);
        infoWebView.setBackgroundColor(Color.TRANSPARENT);
        infoWebView.loadUrl("file:///android_asset/" + asset);
    }
}
