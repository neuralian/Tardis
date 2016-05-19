package com.zologic.tardis.app;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

import com.zologic.tardis.BuildConfig;
import com.zologic.tardis.R;


public class MainHelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainhelp);

        TextView versionTextView = (TextView) findViewById(R.id.versionTextView);
        versionTextView.setText("v" + BuildConfig.VERSION_NAME);

        WebView infoWebView = (WebView) findViewById(R.id.infoWebView);
        infoWebView.setBackgroundColor(Color.TRANSPARENT);
        infoWebView.loadUrl("file:///android_asset/app_help.html");
    }
}
