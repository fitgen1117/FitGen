package com.fxapps.fitgen;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewWorkout extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_workout);
		
		ActionBar actionBar = getActionBar();
	    actionBar.setDisplayHomeAsUpEnabled(true);
		
		Button bMass = (Button) findViewById(R.id.bMass);
		bMass.setOnClickListener(new OnClickListener() {
					
			public void onClick(View v) {
						
				Intent intent = new Intent(v.getContext(), Mass_Button.class);
				startActivityForResult(intent,0);
			}

		});
		
		Button bStrength = (Button) findViewById(R.id.bStrength);
		bStrength.setOnClickListener(new OnClickListener() {
					
			public void onClick(View v) {
						
				Intent intent = new Intent(v.getContext(), General_Strength_Button.class);
				startActivityForResult(intent,0);
			}
		});
		
		Button bWeightLoss = (Button) findViewById(R.id.bWeightLoss);
		bWeightLoss.setOnClickListener(new OnClickListener() {
					
			public void onClick(View v) {
						
				Intent intent = new Intent(v.getContext(), Weight_Loss_Button.class);
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
	

	