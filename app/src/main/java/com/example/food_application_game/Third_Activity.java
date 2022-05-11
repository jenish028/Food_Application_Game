package com.example.food_application_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;

public class Third_Activity extends AppCompatActivity {

    private WebView web_view;
    private ProgressBar progress_circular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        blinding();

    // apps
            String swi = getIntent().getStringExtra("n1");
            web_view.loadUrl(swi);


//        game
//        web_view.loadUrl(deseret);
//        web_view.loadUrl(hamburger);
//        web_view.loadUrl(pizzacafe);
//        web_view.loadUrl(penguin);
//        web_view.loadUrl(Cooking);
//        web_view.loadUrl(Squid);


        web_view.setWebViewClient(new WebViewClient());

        web_view.getSettings().setJavaScriptEnabled(true);

        web_view.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    progress_circular.setVisibility(View.GONE);
                }
            }
        });

    }

    private void blinding() {

        web_view = findViewById(R.id.web_view);
        progress_circular = findViewById(R.id.progress_circular);


    }

    @Override
    public void onBackPressed() {
        if (web_view.canGoBack()) {
            web_view.goBack();
        } else {
            super.onBackPressed();
        }
    }
}