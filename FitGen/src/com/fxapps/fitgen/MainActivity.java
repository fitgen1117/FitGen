package com.fxapps.fitgen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
		ImageButton imageButton;
 
	 
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.splash_main);
			
			addListenerOnImageButton();
	 
		}
	 
		public void addListenerOnImageButton() {
			
			imageButton = (ImageButton) findViewById(R.id.imageView1);
	 
			imageButton.setOnClickListener(new OnClickListener() {
	 
				public void onClick(View v) {
					
					Intent intent = new Intent(v.getContext(), Splash.class);
					startActivityForResult(intent,0);
					
					
						}

					});
				}
	 
		}
	 
	
								
	
	
		
	
	
