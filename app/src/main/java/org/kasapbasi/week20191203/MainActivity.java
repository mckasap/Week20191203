package org.kasapbasi.week20191203;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView v= (WebView) findViewById(R.id.myWebView);
        v.getSettings().setJavaScriptEnabled(true);
        v.setWebViewClient( new WebViewClient());
//        v.loadUrl("https://obs.ticaret.edu.tr");
v.loadData("<html><body> <h1> MERHBA DÜNYA şÜüüiiııİİöçÖÇğğğğĞĞŞŞŞ</h1><p> bu da bir paragraf</p></body></html> ","text/html","ASCII");
    }
}
