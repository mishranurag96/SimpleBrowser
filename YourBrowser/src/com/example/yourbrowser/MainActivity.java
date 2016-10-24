package com.example.yourbrowser;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
	private ProgressBar progressBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		progressBar = (ProgressBar) findViewById(R.id.progressBar1);
		progressBar.setMax(100);
		
		Thread thobj=new Thread()
        {
        	public void run() {
        		try 
        		{
        			sleep(2000);
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        		finally
        		{
            			startActivity(new Intent(MainActivity.this,Home.class));
            			finish();
            		
        		}
        		
				
			}
        };
        thobj.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
