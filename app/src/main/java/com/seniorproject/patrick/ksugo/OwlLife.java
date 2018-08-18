package com.seniorproject.patrick.ksugo;

/**
 * Created by aschell3 on 3/12/2018.
 */

import android.app.LocalActivityManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TabHost;


public class OwlLife extends AppCompatActivity{

    private WebView thisWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owllife);
        thisWebView = (WebView)findViewById(R.id.olView);
        WebSettings ws = thisWebView.getSettings();
        ws.setJavaScriptEnabled(true);
        thisWebView.loadUrl("https://owllife.kennesaw.edu");
        thisWebView.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                findViewById(R.id.owllifeLoadingPanel).setVisibility(View.GONE);

            }
        });
    }

    public void onBackPressed() {
        if(thisWebView.canGoBack()){
            thisWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public void home(View view){
        finish();
    }

}
