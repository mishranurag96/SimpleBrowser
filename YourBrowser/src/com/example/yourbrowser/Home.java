package com.example.yourbrowser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Home extends Activity {
	EditText url;
	Button go;
    Button google; 
    Button facebook;
    Button ygiwebsite;
    Button ygifb;
    Button flipkart;
    Button snapdeal;
    Button news;
    Button amazon;
    Button youtube;
    Button cricket;
    Button exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		go = (Button) findViewById(R.id.button1);
		google = (Button) findViewById(R.id.button2);
		facebook = (Button) findViewById(R.id.button3);
		ygiwebsite = (Button) findViewById(R.id.button4);
		ygifb = (Button) findViewById(R.id.button5);
		flipkart = (Button) findViewById(R.id.button6);
		snapdeal = (Button) findViewById(R.id.button7);
		news = (Button) findViewById(R.id.button8);
		amazon = (Button) findViewById(R.id.button9);
		exit = (Button) findViewById(R.id.button10);
		youtube = (Button) findViewById(R.id.button11);
		cricket = (Button) findViewById(R.id.button12);
		go.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Home.this,Go.class);
				startActivity(intent);
				}
		});
		google.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Home.this,Google.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Google is being opened,Please wait...",Toast.LENGTH_SHORT).show();
				
			}
		});
		facebook.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Home.this,Facebook.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Facebook is being opened,Please wait...",Toast.LENGTH_SHORT).show();
				
			}
		});
		ygiwebsite.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Home.this,CollegeWebsite.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "MyCollege Website is being opened,Please wait...",Toast.LENGTH_SHORT).show();
			
			}
		});
		ygifb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Home.this,CollegePage.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "College page is being opened,Please wait...",Toast.LENGTH_SHORT).show();
				
			}
		});
            flipkart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Home.this,Flipkart.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Flipkart is being opened,Please wait...",Toast.LENGTH_SHORT).show();
				
				}
		});
            snapdeal.setOnClickListener(new OnClickListener() {
    			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Home.this,Snapdeal.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Snapdeal is being opened,Please wait...",Toast.LENGTH_SHORT).show();
				
				}
		});
            news.setOnClickListener(new OnClickListener() {
    			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Home.this,News.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "News is being opened,Please wait...",Toast.LENGTH_SHORT).show();
				
				}
		});
            amazon.setOnClickListener(new OnClickListener() {
    			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Home.this,Amazon.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Amazon is being opened,Please wait...",Toast.LENGTH_SHORT).show();
				
				}
		});
            exit.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 finish();
					    Intent intent = new Intent(Intent.ACTION_MAIN);
					    intent.addCategory(Intent.CATEGORY_HOME);
					    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					    startActivity(intent);
						
				}
			});
            youtube.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(Home.this,YouTube.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "YouTube is being opened,Please wait...",Toast.LENGTH_SHORT).show();
					
					
				}
			});
            cricket.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(Home.this,Cricket.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "Cricket is being opened,Please wait...",Toast.LENGTH_SHORT).show();
					
					
				}
			});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
