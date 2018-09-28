package com.sampleandroidcloudci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;


public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        WebView webView = (WebView)findViewById(R.id.webview);
        //String userAgent = String.format("%s %s",  "THDConsumer/5.11.0.1 (Linux; Android 9; Pixel 2 XL Build/PPP4.180612.004) Mobile") ;
        //webView.getSettings().setUserAgentString("THDConsumer/5.9.1 (Linux; Android 9; Pixel 2 XL Build/PPP4.180612.004) Mobile");
        webView.loadUrl(getIntent().getStringExtra("url"));

    }




}
