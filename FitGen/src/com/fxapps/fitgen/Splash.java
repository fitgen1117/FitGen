package com.fxapps.fitgen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Splash extends Activity {
	/** Called when the activity is first created. */
	@Override
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button bNew = (Button) findViewById(R.id.bNew);
		bNew.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					
					Intent intent = new Intent(v.getContext(), NewWorkout.class);
					startActivityForResult(intent,0);
				}

		});
	}

	   
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mass__button, menu);
		return true;
	}
		
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case R.id.gym_find:
	            Intent intent = new Intent(this, GymLocator.class);
	            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	            startActivity(intent);
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
		};
	}

		
					
								
	
	
		
	
	

