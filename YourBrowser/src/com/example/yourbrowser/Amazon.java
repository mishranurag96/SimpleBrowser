package com.example.yourbrowser;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;


public class Amazon extends Activity{
	
	private ProgressBar progressBar;
	private WebView webView;
	private Button home;
	private Button back;
	private Button forward;
	private Button reload;
	
        @SuppressLint("SetJavaScriptEnabled") 
        
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_amazon);
            home = (Button) findViewById(R.id.button1);
            reload = (Button) findViewById(R.id.button4);
            reload.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					webView.reload();
					
				}
			});
            forward = (Button) findViewById(R.id.button3);
            forward.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					webView.goForward();
					
				}
			});
            back = (Button) findViewById(R.id.button2);
          back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				webView.goBack();
				
			}
		});
            home.setOnClickListener(new OnClickListener() {
        		
        		@Override
        		public void onClick(View arg0) {
        			// TODO Auto-generated method stub
        		Intent intent = new Intent(Amazon.this,Home.class);
        		startActivity(intent);
        		finish();
        		}
        	});
            progressBar = (ProgressBar) findViewById(R.id.progressBar);
            progressBar.setMax(100);
            webView = (WebView) findViewById(R.id.webView);
            webView.setWebViewClient(new WebViewClientDemo());
            webView.setWebChromeClient(new WebChromeClientDemo());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("http://www.amazon.in/?tag=ucwebamz10-21");
        }

		private class WebViewClientDemo extends WebViewClient {
	    @Override
	    public boolean shouldOverrideUrlLoading(WebView view, String url) {
	        view.loadUrl(url);
	        return true;
	    }
	    @Override
	    public void onPageFinished(WebView view, String url) {
    		super.onPageFinished(view, url);
		progressBar.setVisibility(View.GONE);
		progressBar.setProgress(100);
	    }
 	    @Override
	    public void onPageStarted(WebView view, String url, Bitmap favicon) {
		super.onPageStarted(view, url, favicon);
		progressBar.setVisibility(View.VISIBLE);
		progressBar.setProgress(60);
	    }	    
	}
        private class WebChromeClientDemo extends WebChromeClient {
   	    public void onProgressChanged(WebView view, int progress) {
 	    progressBar.setProgress(progress);
        }
    }

       
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       return true;
    }
}  