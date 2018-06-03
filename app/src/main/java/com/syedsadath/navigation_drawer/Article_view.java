package com.syedsadath.navigation_drawer;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Article_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_view);

        WebView webView = (WebView) findViewById(R.id.webview);

            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());

        Intent i = getIntent();

        Log.i(" inside web ","view");

        String url = i.getStringExtra("Article_url");

        Log.i("Clicked_recivedURL", url);

        webView.loadUrl(url);

        webView.clearCache(true);
        webView.clearMatches();
        webView.clearHistory();

    }
}
