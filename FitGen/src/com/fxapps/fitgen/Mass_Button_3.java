package com.fxapps.fitgen;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Mass_Button_3 extends Activity {
	@ Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mass_button_31);
		ActionBar actionBar = getActionBar();
	    actionBar.setDisplayHomeAsUpEnabled(true);
		
		Button bStart = (Button) findViewById(R.id.bStart);
		bStart.setOnClickListener(new OnClickListener() {
					
			public void onClick(View v) {
						
				Intent intent = new Intent(v.getContext(), Mass_Button_32.class);
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
}


